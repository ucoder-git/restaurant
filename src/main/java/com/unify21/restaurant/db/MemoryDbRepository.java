package com.unify21.restaurant.db;

import java.util.List;
import java.util.Optional;

public interface MemoryDbRepository<T> {
    Optional findById(int index);
    T save(T entity);
    void deleteById(int index);
    List<T> listAll();
}
