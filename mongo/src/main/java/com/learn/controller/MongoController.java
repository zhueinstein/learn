package com.learn.controller;

import com.learn.dao.PersonRepository;
import com.learn.model.Location;
import com.learn.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Created by admin on 2017/6/13.
 */
@RestController
public class MongoController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(value = "/save")
    public Person save(){
        Person person = new Person("zwf", 27);
        Collection<Location> locations = new LinkedHashSet<Location>();
        Location location_3 = new Location("商丘", "2004");
        Location location_1 = new Location("郑州", "2009");
        Location location_2 = new Location("北京", "2012");
        Location location_4 = new Location("上海", "2020");
        locations.add(location_1);
        locations.add(location_2);
        locations.add(location_3);
        locations.add(location_4);
        person.setLocations(locations);
        return  personRepository.save(person);
    }
    @RequestMapping(value = "/q1")
    public Person q1(String name){
        return personRepository.findByName(name);
    }

  /*  @RequestMapping(value = "/q2")
    public List<Person> q2(Integer age){
        return personRepository.withQueryFindByAge(age);
    }*/
}
