package com.notifyme;

/**
 * Created by gepard on 20.04.17.
 */

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    public User findByFirstName(String firstName);
    public List<User> findByLastName(String lastName);
    public List<User> findByProjects(String projects);

}