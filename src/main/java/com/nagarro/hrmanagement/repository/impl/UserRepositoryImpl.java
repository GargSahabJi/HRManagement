/*
* Class name: UserRepositoryImpl
*
* Version info: jdk 1.8
*
* Copyright notice:
* 
* Author info: Arpit Garg
*
* Creation date: 13/Apr/2021
*
* Last updated By: Arpit Garg
*
* Last updated Date: 16/Apr/2021
*
* Description: User Repository Implementation
*/
package com.nagarro.hrmanagement.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nagarro.hrmanagement.model.User;
import com.nagarro.hrmanagement.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private EntityManager entityManager;

    /**
     * Validate a user
     */
    @Override
    public User validateUser(User user) {
        String userName = user.getUserName();
        String password = user.getPassword();
        List<User> query = entityManager.createQuery(
                "SELECT u FROM User u WHERE u.userName='" + userName + "' AND u.password='" + password + "'",
                User.class).getResultList();
        if (!query.isEmpty()) {
            return query.get(0);
        }
        return null;
    }
}
