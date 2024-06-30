package com.test.timesheetbackend.repository;
import java.util.Collection;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.timesheetbackend.entity.Status;

import io.micrometer.common.lang.NonNull;

public interface StatusRepository extends CrudRepository<Status,Integer> {
    public @ResponseBody Iterable<Status> findAll();
}
