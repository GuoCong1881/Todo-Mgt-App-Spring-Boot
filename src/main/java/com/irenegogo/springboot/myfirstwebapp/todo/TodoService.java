package com.irenegogo.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	
	private static int todosCount = 0;
	
	//initialize a static variable, use a static block
	static {
		todos.add(new Todo(todosCount++, "Irene", "Learn Spring Boot",
				LocalDate.now().plusYears(1), false));
		todos.add(new Todo(todosCount++, "Irene", "Learn Javascript",
				LocalDate.now().plusYears(2), false));
		todos.add(new Todo(todosCount++, "Irene", "Learn C++",
				LocalDate.now().plusYears(3), false));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(todosCount++, username, description, targetDate, done);
		todos.add(todo);
	}
	
	public void deleteById(int id) {
		// condition: todo.getId() == id
		// lambda function: todo->todo.getId()==id
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}
}
