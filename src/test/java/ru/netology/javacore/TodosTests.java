package ru.netology.javacore;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class TodosTests {
    @Test
    public void testAdd() {
        Todos todos = new Todos();
        todos.addTask("Пробежка");
        Assertions.assertEquals(todos.getAllTasks(), "Пробежка ");
    }

    @Test
    public void testRemove() {
        Todos todos = new Todos();
        todos.addTask("Учеба");
        todos.removeTask("Учеба");
        Assertions.assertEquals(todos.getAllTasks(), "");
    }

    @Test
    public void testGetAll() {
        Todos todos = new Todos();
        todos.addTask("Пробежка");
        todos.addTask("Акробатика");
        todos.addTask("Учеба");
        todos.removeTask("Акробатика");
        Assertions.assertEquals(todos.getAllTasks(), "Пробежка Учеба ");
    }
}
