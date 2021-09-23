package com.example.demo.dao.impl;

import com.example.demo.dao.ActorDAO;
import com.example.demo.entity.Actor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ActorDAOImpl implements ActorDAO {

    private SessionFactory sessionFactory;

    public ActorDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Actor> getAllActors() {
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery("from Actor a order by a.id desc");
        return query.getResultList();
    }

    @Override
    public void saveActor(Actor actor) {
        Session session = sessionFactory.getCurrentSession();
        session.save(actor);
    }

}
