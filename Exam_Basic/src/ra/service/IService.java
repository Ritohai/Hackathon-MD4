package ra.service;

import java.util.List;

public interface IService<T, E> {
    List<T> getALl();
    void save(T t);
    void findById(E e);
    void delete(E e);

}
