/*
* Class name: UserService
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
* Description: User Service
*/
package com.nagarro.hrmanagement.service;

import com.nagarro.hrmanagement.model.User;

public interface UserService {

    /**
     * Validate a user
     * 
     * @param user
     * @return
     */
    public User validateUser(User user);
}
