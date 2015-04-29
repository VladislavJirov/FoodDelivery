package com.epam.vzhirov.fooddelivery.dao;

public interface DaoCommand<T> {
        T execute(DaoManager daoManager);
}
