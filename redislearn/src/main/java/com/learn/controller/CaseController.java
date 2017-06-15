package com.learn.controller;

import com.learn.dao.PersonDao;
import com.learn.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/6/14.
 */
@RestController
public class CaseController {

    @Autowired
    PersonDao personDao;

    @RequestMapping(value = "/set")
    public void set(){
        Person person = new Person("1", "zwf", 27);
        personDao.set(person.getId(), person);
    }

    @RequestMapping(value = "/getStr")
    public String getStr(){
        return personDao.get("1");
    }

}
