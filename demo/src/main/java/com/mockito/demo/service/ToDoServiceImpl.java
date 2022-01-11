package com.mockito.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToDoServiceImpl implements ToDoService {
    @Override
    public List<String> retrieveTodos(String user) {
       return Arrays.asList("Learn Spring Mvc","Learn Spring Boot", "Learn to Dance");
    }
}
