package com.learn.dao;

import com.learn.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by admin on 2017/6/13.
 */
public interface PersonRepository extends MongoRepository<Person, String> {

    Person findByName(String name);

/*    @Query("('age': ?0)")
    List<Person> withQueryFindByAge(Integer age);*/
}
