package de.weekendsession.samstagtodoapp.service;

import de.weekendsession.samstagtodoapp.model.TodoItem;
import de.weekendsession.samstagtodoapp.repository.TodoRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TodoServiceTest {

    @Test
    public void getAllTodoItems(){
        // Given
        TodoRepository todoRepositoryMock = mock(TodoRepository.class);
        when(todoRepositoryMock.getAllTodoItems()).thenReturn(List.of());

        TodoService todoService = new TodoService(todoRepositoryMock);

        // When
        List<TodoItem> actual = todoService.getAllTodoItems();

        //Then
        assertEquals(List.of(), actual);
    }

}