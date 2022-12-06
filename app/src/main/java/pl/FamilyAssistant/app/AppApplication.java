package pl.FamilyAssistant.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
		HabitRepository repo = new HabitRepository();
		repo.getAllHabits();
	}

}
