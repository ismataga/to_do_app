package com.ismataga.to_do_app.repository;

import com.ismataga.to_do_app.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<Task,Long> {

}
