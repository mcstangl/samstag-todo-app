package de.weekendsession.samstagtodoapp.repository;


import de.weekendsession.samstagtodoapp.model.TodoItem;
import de.weekendsession.samstagtodoapp.service.IdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TodoRepository {


    private final Map<String, TodoItem> todoItems;

    private final IdService idService;

    @Autowired
    public TodoRepository(IdService idService) {
        this.idService = idService;
        this.todoItems = new HashMap<>();
    }

    public List<TodoItem> getAllTodoItems() {
        return new ArrayList<>(todoItems.values());
    }

    public TodoItem save(TodoItem todoItem) {
        if(todoItem.getId() == null){
            todoItem.setId(idService.generateId());
        }
        todoItems.put(todoItem.getId(), todoItem);
        return todoItem;
    }
}
