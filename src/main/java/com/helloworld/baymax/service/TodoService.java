package com.helloworld.baymax.service;

import com.helloworld.baymax.dao.TodoDao;
import com.helloworld.baymax.pojo.TodoPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoDao todoDao;

    public List<TodoPojo> getAll() {
        List<TodoPojo> result = new ArrayList<>();
        todoDao.findAll().forEach(result::add);
        return result;
    }

    public void save(String content) {
        TodoPojo todoPojo = new TodoPojo();
        todoPojo.setContent(content);
        todoDao.save(todoPojo);
    }
}
