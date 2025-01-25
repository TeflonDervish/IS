package ru.semenov.IS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.semenov.IS.model.Question;
import ru.semenov.IS.repository.QuestionRepository;
import ru.semenov.IS.repository.QuestionRepositoryJson;

import java.util.List;

@SpringBootApplication
public class IsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(IsApplication.class, args);
	}

}
