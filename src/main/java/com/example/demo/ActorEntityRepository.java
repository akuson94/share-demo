package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ActorEntityRepository extends JpaRepository<Actor, String> {

    List<Actor> findAll();

    Actor save(Actor actor);
}