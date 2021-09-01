package com.example.demo.dao;

import com.example.demo.entity.Actor;

import java.util.List;

public interface ActorDAO {

    List<Actor> getAllActors();

    void saveActor(Actor actor);
}
