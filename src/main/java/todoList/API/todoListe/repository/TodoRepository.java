package todoList.API.todoListe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import todoList.API.todoListe.entity.Todo;


public interface TodoRepository extends JpaRepository<Todo, Long> {

}
