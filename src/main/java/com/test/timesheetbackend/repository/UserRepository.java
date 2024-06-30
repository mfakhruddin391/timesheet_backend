package com.test.timesheetbackend.repository;
import org.springframework.data.repository.CrudRepository;

import com.test.timesheetbackend.entity.User;

public interface UserRepository extends CrudRepository<User,Integer> {
    
}
