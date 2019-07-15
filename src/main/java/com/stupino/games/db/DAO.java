package com.stupino.games.db;

import com.stupino.games.db.entities.Game;
import com.stupino.games.db.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class DAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Game> queryGames()
    {
        return jdbcTemplate.query("select id, title, description, image, NumberOfParticipants from game", new BeanPropertyRowMapper<>(Game.class));
    }

    public List<Person> queryPerson(){
        return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<>(Person.class));
    }

    public Game queryGame(Integer gameId) {
        try {
            Game game = jdbcTemplate.queryForObject("select id, title, description, image, NumberOfParticipants, amount, used_count from game where id = ?", new BeanPropertyRowMapper<>(Game.class),gameId);
            return game;
        }
        catch (EmptyResultDataAccessException e)
        {return null;}
    }

    public Game getTitle(Integer gameId){
        try {
            Game game = jdbcTemplate.queryForObject("select title from game", new BeanPropertyRowMapper<>(Game.class),gameId);
            return game;
        }
        catch (EmptyResultDataAccessException e)
        {return null;}
    }

    public Person queryPerson(Integer rentedGameId){
        try{
            Person person = jdbcTemplate.queryForObject("select * from person", new BeanPropertyRowMapper<>(Person.class),rentedGameId);
        return person;
        }
        catch(EmptyResultDataAccessException e)
        {return null;}
    }
}


