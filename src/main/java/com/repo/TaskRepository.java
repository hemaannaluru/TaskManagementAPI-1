package com.repo;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(String status);
    List<Task> findByDueDate(LocalDate dueDate);
    // Assuming User has an 'id' field
    List<Task> findByUserId(Long userId);
}
