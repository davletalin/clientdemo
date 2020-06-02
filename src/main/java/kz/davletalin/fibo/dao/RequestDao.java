package kz.davletalin.fibo.dao;

import kz.davletalin.fibo.entity.Request;
import kz.davletalin.fibo.hibernate.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class RequestDao<Request> implements Dao<Request> {
    @Override
    public Request getById(int id) {
        return (Request) HibernateSessionFactoryUtil.getSessionFactory().openSession().get(kz.davletalin.fibo.entity.Request.class,id);
    }

    @Override
    public Collection<Request> getAll() {
        return null;
    }

    @Override
    public void save(Request request) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(request);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Request request) {

    }

    @Override
    public void delete(Request request) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        session.delete(request);
        transaction.commit();
        session.close();
    }
}
