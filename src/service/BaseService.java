package service;

import model.BaseModel;

public interface BaseService <T extends BaseModel>{
    boolean create(T entity);
    boolean delete (T entity);
    boolean update (T entity);
    T get (Long id);

}
