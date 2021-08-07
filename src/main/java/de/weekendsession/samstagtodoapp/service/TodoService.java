package de.weekendsession.samstagtodoapp.service;


import de.weekendsession.samstagtodoapp.enums.Status;
import de.weekendsession.samstagtodoapp.model.TodoItem;
import de.weekendsession.samstagtodoapp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;


    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    public List<TodoItem> getAllTodoItems() {

        return todoRepository.getAllTodoItems();
    }

    public TodoItem createNewTodoItem(TodoItem todoItem) {
        TodoItem newTodoItem = new TodoItem(null, todoItem.getTitle(), todoItem.getDescription(), null, Status.OPEN);
        return todoRepository.save(newTodoItem);
    }
}
