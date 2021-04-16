package com.nagarro.hrmanagement.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nagarro.hrmanagement.model.User;
import com.nagarro.hrmanagement.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public User validateUser(User user) {
        String userName = user.getUserName();
        String password = user.getPassword();
        TypedQuery<User> query = entityManager.createQuery(
                "SELECT u FROM User u WHERE u.userName='" + userName + "' AND u.password='" + password + "'",
                User.class);
        User validateUser = query.getSingleResult();
        if (validateUser != null) {
            return validateUser;
        }
        return null;
    }
}
