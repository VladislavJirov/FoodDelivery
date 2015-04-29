package com.epam.vzhirov.fooddelivery.dao;

public interface DaoManager {

//    default <T> T executeTx(DaoCommand<T> daoCommand) throws DaoException {
//        return execute(daoManager -> daoManager.transaction(daoCommand));
//    }
//
      <T> T executeAndClose(DaoCommand<T> daoCommand) throws DaoException;
//
//    <T> T transaction(DaoCommand<T> daoCommand) throws DaoException;
//
      <T extends AbstractDao> T create(Class<T> daoInterface) throws DaoException;


}