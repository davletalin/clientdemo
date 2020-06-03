package kz.davletalin.fibo.dao;

import java.util.List;

public interface Dao<T> {
    T getById(int id);
    List<T> getRequests();
    void save(T t);
    void update(T t);
    void delete(T t);
}
