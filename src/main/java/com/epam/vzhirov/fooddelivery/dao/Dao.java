package com.epam.vzhirov.fooddelivery.dao;


import java.io.Serializable;
import java.util.List;

public interface Dao <T, PK extends Serializable> {

    PK add(T t);
    void update(T t);
    void delete(T t);
    T findById(PK id);
    List<T> getAll();
}
