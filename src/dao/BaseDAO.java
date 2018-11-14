package dao;

import model.BaseModel;

import java.util.List;

public interface BaseDAO<T extends BaseModel> {
    boolean create(T entity);

    boolean delete(T entity);

    boolean update(T entity);

    T get(Long id);

    List<T> getAll();
}
