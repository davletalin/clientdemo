package kz.davletalin.fibo.dao;

import kz.davletalin.fibo.entity.Request;
import kz.davletalin.fibo.hibernate.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class RequestDao<Request> implements Dao<Request> {
    @Override
    public Request getById(int id) {
        return (Request) HibernateSessionFactoryUtil.getSessionFactory().openSession().get(kz.davletalin.fibo.entity.Request.class, id);
    }

    @Override
    public List<Request> getRequests() {
//        List<Request> requests = HibernateSessionFactoryUtil.getSessionFactory().openSession()
//                .createQuery("from Request").list();
//        return (List<Request>)requests;
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Query<Request> query = (Query<Request>) session.createQuery("from Request ", kz.davletalin.fibo.entity.Request.class);
        List<Request> requests=query.getResultList();
        return requests;
    }

    @Override
    public void save(Request request) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session.save(request);
        session.close();
    }

    @Override
    public void update(Request request) {

    }

    @Override
    public void delete(Request request) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session.delete(request);
        session.close();
    }
}
