package lesson_5;

import java.util.List;

public interface BaseRepository <T, ID> {
    T findById(ID id);
    List<T> findAll();
    T merge(T entity);
    boolean delete(T entity);
    boolean deleteById(ID id);
}