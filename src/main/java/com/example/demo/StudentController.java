package com.example.demo;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

//    @Autowired
//    private ActorsDAO actorsDAO;

    @Autowired
    private ActorEntityRepository actorEntityRepository;

    @GetMapping("/students")
    public String getStudents() {
        List<Actor> actors = actorEntityRepository.findAll();
        return new Gson().toJson(actors);
    }
    @GetMapping("/students/admin")
    public String getStudentsAdmin() {
        return "Admin is the best!";
    }

    @PostMapping("/students")
    public String postStudents(@RequestBody String body) {
        Actor actor = new Gson().fromJson(body, Actor.class);
        actorEntityRepository.save(actor);
        return "OK";
    }
}