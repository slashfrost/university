package impl;

import com.company.Exam;
import dao.BaseDAO;
import model.BaseModel;


import java.util.List;

public abstract class AbstractDAOImpl extends BaseModel implements BaseDAO {
    List<BaseModel> list;
    @Override
    public boolean create(BaseModel entity) {
        //???
    }

    @Override
    public boolean delete(BaseModel entity) {
        return list.remove(entity);
    }

    @Override
    public boolean update(BaseModel entity) {
        return list.add(entity);
    }
}




