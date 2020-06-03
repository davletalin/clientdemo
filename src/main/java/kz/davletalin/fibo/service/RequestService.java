package kz.davletalin.fibo.service;

import kz.davletalin.fibo.dao.Dao;
import kz.davletalin.fibo.dao.RequestDao;
import kz.davletalin.fibo.entity.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class RequestService {

    @Autowired
    private Dao<Request> requestDao = new RequestDao<>();

    public RequestService() {
    }

    @Transactional
    public Request getRequest(int id){
        return requestDao.getById(id);
    }

    @Transactional
    public void saveRequest(Request request){
        requestDao.save(request);
    }

    @Transactional
    public void deleteRequest(Request request){
        requestDao.delete(request);
    }

    @Transactional
    public List<Request> getRequests() {
        return requestDao.getRequests();
    }
}
