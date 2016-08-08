package com.manning.gia.todo.repository;

import com.manning.gia.todo.model.ToDoItem;

import java.util.List;

/**
 * Created by yinrong on 2016/8/8.
 */
public interface  ToDoRepository {
    List<ToDoItem> findAll();
    ToDoItem findById(Long id);
    Long insert(ToDoItem toDoItem);
    void update(ToDoItem toDoItem);
    void delete(ToDoItem toDoItem);
}
