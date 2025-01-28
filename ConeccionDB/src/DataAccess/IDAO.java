package DataAccess;

import java.util.List;

public interface IDAO<T> {
    T       readBy(Integer id)  throws Exception;
    List<T> readAll()           throws Exception;
    boolean create(T entity)    throws Exception;
    boolean update(T entity)    throws Exception;
    boolean delete(Integer id)  throws Exception;
    //public Integer getMaxRow() throws Exception;
}
