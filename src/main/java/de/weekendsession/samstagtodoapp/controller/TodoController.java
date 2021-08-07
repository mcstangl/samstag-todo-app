package de.weekendsession.samstagtodoapp.controller;


import de.weekendsession.samstagtodoapp.model.TodoItem;
import de.weekendsession.samstagtodoapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoController {

    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }



    @GetMapping
    public List<TodoItem> getAllTodoItems (){
        return todoService.getAllTodoItems();
    }


    @PostMapping
    public TodoItem createNewTodoItem(@RequestBody TodoItem todoItem){
        return todoService.createNewTodoItem(todoItem);
    }
}
