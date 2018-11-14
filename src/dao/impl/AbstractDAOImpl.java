package dao.impl;

import dao.BaseDAO;
import model.BaseModel;


import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDAOImpl<T extends BaseModel> implements BaseDAO<T> {
    protected List<T> list=new ArrayList<T>();

    @Override
    public List<T> getAll() {
        return null;
    }

    @Override
    public boolean create(T entity) {
       return list.add(entity);
    }

    @Override
    public boolean delete(T entity) {
        return list.remove(entity);
    }

    @Override
    public boolean update(T entity) {
        return delete(entity)&&list.add(entity);
    }

    @Override
    public T get(Long id) {
        for (T e : list) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }
}





