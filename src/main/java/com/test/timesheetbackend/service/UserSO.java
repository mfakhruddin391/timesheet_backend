package com.test.timesheetbackend.service;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.timesheetbackend.entity.Status;
import com.test.timesheetbackend.entity.User;

import java.util.List;
public interface UserSO {
    
      public Iterable<User> findAll();
}
