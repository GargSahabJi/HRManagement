package com.nagarro.hrmanagement.repository;

import com.nagarro.hrmanagement.model.User;

public interface UserRepository {
    
    public User validateUser(User user);
}
