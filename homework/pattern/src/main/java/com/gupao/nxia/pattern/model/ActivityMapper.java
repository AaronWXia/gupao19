package com.gupao.nxia.pattern.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class ActivityMapper implements  RowMapper{



    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws  SQLException{
        Person person = new Person();
        person.setAge(10);
        person.setName("tom");
        return person;
    }


}
