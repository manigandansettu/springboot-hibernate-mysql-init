package com.example.demo.services.impl;

import com.example.demo.dao.ActorDAO;
import com.example.demo.entity.Actor;
import com.example.demo.services.ActorService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {

    private ActorDAO actorDAO;

    public ActorServiceImpl(ActorDAO actorDAO) {
        this.actorDAO = actorDAO;
    }

    public List<Actor> getAllActors(){
        return this.actorDAO.getAllActors();
    }

    @Override
    public void saveActor(Actor actor) {
        actor.setLastUpdate(LocalDateTime.now());
        this.actorDAO.saveActor(actor);
    }
}
