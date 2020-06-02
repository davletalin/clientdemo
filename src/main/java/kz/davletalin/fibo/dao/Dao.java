package kz.davletalin.fibo.dao;

import java.util.Collection;

public interface Dao<T> {
    T getById(int id);
    Collection<T> getAll();
    void save(T t);
    void update(T t);
    void delete(T t);
}
