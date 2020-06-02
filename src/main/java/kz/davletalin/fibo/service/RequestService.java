package kz.davletalin.fibo.service;

import kz.davletalin.fibo.dao.Dao;
import kz.davletalin.fibo.dao.RequestDao;
import kz.davletalin.fibo.entity.Request;

public class RequestService {
    private Dao<Request> requestDao =new RequestDao<>();

    public RequestService() {
    }
    public Request getRequest(int id){
        return requestDao.getById(id);
    }
    public void saveRequest(Request request){
        requestDao.save(request);
    }
    public void deleteRequest(Request request){
        requestDao.delete(request);
    }
}
