package com.epam.vzhirov.fooddelivery.dao;

import java.sql.SQLException;
import java.util.List;

public interface AbstractDao<T, Long> {

    Long add(T t) throws SQLException;
    void update(T t) throws SQLException;
    void delete(T t) throws SQLException;
    T findById(Long id) throws SQLException;
    List<T> getAll() throws SQLException;
}
