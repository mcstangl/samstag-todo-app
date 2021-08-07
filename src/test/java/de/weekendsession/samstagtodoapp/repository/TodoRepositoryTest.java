package de.weekendsession.samstagtodoapp.repository;

import de.weekendsession.samstagtodoapp.enums.Status;
import de.weekendsession.samstagtodoapp.model.TodoItem;
import de.weekendsession.samstagtodoapp.service.IdService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class TodoRepositoryTest {


    @Test
    public void getAllTodoItems() {
        // Given
        IdService idServiceMock = mock(IdService.class);
        when(idServiceMock.generateId()).thenReturn("1");
        TodoRepository todoRepository = new TodoRepository(idServiceMock);

        // When
        List<TodoItem> actual = todoRepository.getAllTodoItems();

        //Then
        assertEquals(List.of(), actual);
    }

    @Test
    public void saveNewTodoItem(){
        // Given
        IdService idServiceMock = mock(IdService.class);
        when(idServiceMock.generateId()).thenReturn("1");
        TodoRepository todoRepository = new TodoRepository(idServiceMock);

        // When
        TodoItem actual = todoRepository.save(new TodoItem(null, "testtitle", "testdescription",null, Status.OPEN));

        // Then
        TodoItem expected = new TodoItem("1", "testtitle", "testdescription", null, Status.OPEN);
        assertEquals(expected, actual);
    }

    @Test
    public void saveExistingTodoItem(){
        // Given
        IdService idServiceMock = mock(IdService.class);
        when(idServiceMock.generateId()).thenReturn("1");
        TodoRepository todoRepository = new TodoRepository(idServiceMock);

        // When
        TodoItem actual = todoRepository.save(new TodoItem("2", "testtitle", "testdescription",null, Status.OPEN));

        // Then
        TodoItem expected = new TodoItem("2", "testtitle", "testdescription", null, Status.OPEN);
        assertEquals(expected, actual);
    }
}