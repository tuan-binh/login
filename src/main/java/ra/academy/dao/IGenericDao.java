package ra.academy.dao;

import org.springframework.stereotype.Component;

import java.util.List;


public interface IGenericDao<T, E> {
    List<T> findAll();
    T findById(E id);
    void save(T t);
    void delete(E id);
}
