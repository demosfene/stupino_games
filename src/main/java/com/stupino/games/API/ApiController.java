package com.stupino.games.API;

import com.stupino.games.db.DAO;
import com.stupino.games.db.entities.Game;
import com.stupino.games.db.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


// используется если надо получить объект в java script
@RestController
public class ApiController {

    @Autowired
    DAO dao;

    @RequestMapping("/queryForGetObject")
    public Game queryForGetObject(@RequestParam Integer gameId){

        Game game = dao.queryGame(gameId);
        return game;
    }

    @RequestMapping("/queryForGetPersonsWithGame")
    public ArrayList<Person> queryForGetPersonsWithGame(@RequestParam Integer rentedGameId){
        List<Person> personsList = dao.queryPerson();
        ArrayList<Person> personsListWithGame = new ArrayList<Person>();
        for(Person p:personsList){
            if(rentedGameId.equals(p.getRentedGameId()))
                personsListWithGame.add(p);
        }
        return personsListWithGame;
    }

}
