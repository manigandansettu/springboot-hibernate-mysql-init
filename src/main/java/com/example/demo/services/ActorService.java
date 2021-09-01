package com.example.demo.services;

import com.example.demo.entity.Actor;

import java.util.List;

public interface ActorService {

    List<Actor> getAllActors();

    void saveActor(Actor actor);
}
