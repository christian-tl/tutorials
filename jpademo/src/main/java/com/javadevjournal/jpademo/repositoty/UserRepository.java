package com.javadevjournal.jpademo.repositoty;

import com.javadevjournal.jpademo.entity.User;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long> {

    List<User> findUserByLastName(String lastName);
}
