package com.example.demo.controller;

import com.example.demo.entity.Actor;
import com.example.demo.services.ActorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/actor")
public class ActorController {

    private ActorService actorService;

    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping
    public List<Actor> getAllActors() {
        return this.actorService.getAllActors();
    }

    @PostMapping
    public String saveActor(Actor actor){
        actorService.saveActor(actor);
        return "success";
    }

}
