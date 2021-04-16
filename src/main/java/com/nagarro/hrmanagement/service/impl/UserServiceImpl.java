/*
* Class name: UserServiceImpl
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
* Description: User Service Implementation
*/
package com.nagarro.hrmanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.hrmanagement.model.User;
import com.nagarro.hrmanagement.repository.UserRepository;
import com.nagarro.hrmanagement.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * Validate a user
     */
    @Override
    public User validateUser(User user) {
        return userRepository.validateUser(user);
    }
}
