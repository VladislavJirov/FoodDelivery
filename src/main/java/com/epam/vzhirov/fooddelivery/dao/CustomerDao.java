package com.epam.vzhirov.fooddelivery.dao;

import com.epam.vzhirov.fooddelivery.model.Customer;

import java.sql.SQLException;

public interface CustomerDao extends AbstractDao<Customer,Long> {

    //хмрептеия вепег йнрнпши юаярпюйршл лерндюл йкюяяю ABSTRACT DAO днаюбкъчряъ хмдхбхдсюкэмше лерндш
       Customer findByLogin(String name) throws SQLException;

}
