package service.impl;
import dao.BaseDAO;
import model.BaseModel;
import service.BaseService;

public abstract class BaseServiceImpl <T extends BaseModel> implements BaseService<T> {
    protected abstract BaseDAO<T> getBaseDAO();
    @Override
    public boolean create(T entity) {
        return getBaseDAO().create(entity);
    }

    @Override
    public boolean delete(T entity) {
        return getBaseDAO().delete(entity);
    }

    @Override
    public boolean update(T entity) {
        return getBaseDAO().update(entity);
    }

    @Override
    public T get(Long id) {
        return getBaseDAO().get(id);
    }
}
