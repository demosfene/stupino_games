package com.stupino.games;

import com.stupino.games.db.DAO;
import com.stupino.games.db.entities.Game;
import com.stupino.games.db.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;


// используется если надо вернуть html
@Controller
public class GamesController {

    @Autowired
    private DAO dao;

    // НА СЛУЧАЙ ЕСЛИ ХОЧЕШЬ ИСПОЛЬЗОВАТЬ ПАРАМЕТР ПРЯМО ИЗ ЗАПРОСА
    @RequestMapping("/{value}")
    public String handleLink(@PathVariable("value") String value, ModelMap modelMap, HttpSession httpSession)
    {
        System.out.println("Параметр из строки запроса ---> " + value);
        return "example";
    }

    @GetMapping(value = "/test")
    public String test(ModelMap modelMap)
    {
        List<Game> gameList = dao.queryGames();
        modelMap.put("gameList",gameList);
        return "example";
    }

    @PostMapping(value="/test")
    public String search(@Valid String param){
        param="5";
        return "exemple";
    }


//    @GetMapping("/mygame")
//    public String myGame(ModelMap modelMap){
//        List<Person> personList = dao.queryPerson();
//        if (personList.rentedGameId
//
//        return "myGame";
//    }
//

    /*@PostMapping
    public String filter(@RequestParam String title, ModelMap modelMap){
        List<Game> gameList = dao.getTitle();
        if((gameList.equals()) )
        filter().equals()
    }
*/
}




