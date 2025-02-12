package com.vibha.vibhaapp.repository;

import com.vibha.vibhaapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TaskRepo extends JpaRepository <Task,Long> {
}
