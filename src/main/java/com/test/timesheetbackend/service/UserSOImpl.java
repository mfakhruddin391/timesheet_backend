package com.test.timesheetbackend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.timesheetbackend.entity.User;
import com.test.timesheetbackend.repository.UserRepository;

@Service
public class UserSOImpl implements UserSO {

    @Autowired
    private final UserRepository userRepository;

    UserSOImpl(UserRepository userRepository){

        this.userRepository = userRepository;

    }


    public Iterable<User> findAll(){
        return this.userRepository.findAll();
    }
    
}
