package com.helloworld.baymax.dao;

import com.helloworld.baymax.pojo.TodoPojo;
import org.springframework.data.repository.CrudRepository;

public interface TodoDao extends CrudRepository<TodoPojo, Integer> {
}
