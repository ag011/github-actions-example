package com.mockito.demo;

import com.mockito.demo.service.ToDoService;
import com.mockito.demo.service.ToDoServiceImpl;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class FirstMockitoTestCases {

    @Test
    public void test() {
        ToDoService toDoService = new ToDoServiceImpl();
        ToDoBusinessImpl toDoBusiness = new ToDoBusinessImpl(toDoService);
        List<String> filteredSubTodos = toDoBusiness.retrieveTodoRelatedToSpring("Dummy");
        assertEquals(2,filteredSubTodos.size());
    }

    @Test
    public void mockTest() {
        ToDoService toDoService = mock(ToDoService.class);
        List<String> value = Arrays.asList("Learn Spring Mvc","Learn Spring Boot", "Learn to Dance");
        when(toDoService.retrieveTodos("Dummy")).thenReturn(value);
        ToDoBusinessImpl toDoBusiness = new ToDoBusinessImpl(toDoService);
        List<String> filteredSubTodos = toDoBusiness.retrieveTodoRelatedToSpring("Dummy");
        assertEquals(2,filteredSubTodos.size());
    }
}
