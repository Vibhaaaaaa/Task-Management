package com.vibha.vibhaapp;

import com.vibha.vibhaapp.model.Task;
import com.vibha.vibhaapp.repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;

@SpringBootApplication
public class VibhaappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VibhaappApplication.class, args);
	}

	@Autowired
	private TaskRepo taskRepo;

	private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	@Override
	public void run(String... args) throws Exception {
		Task task1 = new Task();
		task1.setTitle("Requirement Analysis");
		task1.setDescription("Analyse the req");
		task1.setStatus("completed");
		task1.setCreatedAt(new java.sql.Date(dateFormat.parse("09/02/2022").getTime()));
		task1.setUpdatedAt(new java.sql.Date(dateFormat.parse("10/03/2022").getTime()));
		taskRepo.save(task1);

		Task task2 = new Task();
		task2.setTitle("Design");
		task2.setDescription("Design the application");
		task2.setStatus("completed");
		task2.setCreatedAt(new java.sql.Date(dateFormat.parse("09/04/2023").getTime()));
		task2.setUpdatedAt(new java.sql.Date(dateFormat.parse("07/05/2023").getTime()));
		taskRepo.save(task2);

		Task task3 = new Task();
		task3.setTitle("Development");
		task3.setDescription("Develop the app");
		task3.setStatus("completed");
		task3.setCreatedAt(new java.sql.Date(dateFormat.parse("07/05/2023").getTime()));
		task3.setUpdatedAt(new java.sql.Date(dateFormat.parse("05/06/2023").getTime()));
		taskRepo.save(task3);

		Task task4 = new Task();
		task4.setTitle("Testing");
		task4.setDescription("Test the app");
		task4.setStatus("completed");
		task4.setCreatedAt(new java.sql.Date(dateFormat.parse("05/06/2023").getTime()));
		task4.setUpdatedAt(new java.sql.Date(dateFormat.parse("05/07/2023").getTime()));
		taskRepo.save(task4);
	}

}
