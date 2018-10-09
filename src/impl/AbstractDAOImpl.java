package impl;

import com.company.Exam;
import dao.BaseDAO;
import model.BaseModel;


import java.util.List;

public abstract class AbstractDAOImpl <T extends BaseModel >implements BaseDAO<T> {
   protected List<T> list;
    @Override
    public boolean create(BaseModel entity) {
        //???
    }

    @Override
    public boolean delete(T entity) {
        return list.remove(entity);
    }

    @Override
    public boolean update(T entity) {
        return list.add(entity);
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





