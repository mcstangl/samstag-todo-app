package de.weekendsession.samstagtodoapp.repository;


import de.weekendsession.samstagtodoapp.model.TodoItem;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TodoRepository {


    private final Map<String, TodoItem> todoItems;

    public TodoRepository() {
        this.todoItems = new HashMap<>();
    }

    public List<TodoItem> getAllTodoItems() {
        return new ArrayList<>(todoItems.values());
    }
}
