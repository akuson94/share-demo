package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ActorsDAO implements Dao<ActorPOJO> {
    private List<ActorPOJO> actorPOJOS = new ArrayList<>();
    @Override
    public Optional<ActorPOJO> get(String id) {
        return this.actorPOJOS.stream().filter(actorPOJO -> actorPOJO.getActor_id() == id).findFirst();
    }

    @Override
    public List<ActorPOJO> getAll() {
        return this.actorPOJOS;
    }

    @Override
    public void save(ActorPOJO actorPOJO) {
        this.actorPOJOS.add(actorPOJO);
    }

    @Override
    public void update(ActorPOJO actorPOJO, String[] params) {
        actorPOJO.setActor_id(params[0]);
        actorPOJO.setFirst_name(params[1]);
        actorPOJO.setLast_name(params[2]);
        actorPOJO.setLast_update(params[3]);
    }

    @Override
    public void delete(ActorPOJO actorPOJO) {
        this.actorPOJOS.remove(actorPOJO);
    }

}
