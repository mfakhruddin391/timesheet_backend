package com.test.timesheetbackend.service;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.timesheetbackend.entity.Status;

public interface StatusSO {
     public @ResponseBody Iterable<Status> findAll();
}
