/*
* Class name: UserRepository
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
* Description: User Repository
*/
package com.nagarro.hrmanagement.repository;

import com.nagarro.hrmanagement.model.User;

public interface UserRepository {

    /**
     * validate a user
     * 
     * @param user
     * @return
     */
    public User validateUser(User user);
}
