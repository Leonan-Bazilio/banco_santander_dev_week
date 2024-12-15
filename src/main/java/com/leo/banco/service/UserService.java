package com.leo.banco.service;

import com.leo.banco.domain.model.User;

public interface UserService {
    
    User findById(Long id);
    
    User create(User userToCreate);
}