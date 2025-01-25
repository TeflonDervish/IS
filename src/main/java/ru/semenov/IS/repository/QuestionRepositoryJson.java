package ru.semenov.IS.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import ru.semenov.IS.model.Question;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

@Repository
public class QuestionRepositoryJson implements QuestionRepository{

    private Gson gson;
    @Value("${questions.data}")
    private String pathToFile;

    public QuestionRepositoryJson() {
        gson = new Gson();
    }

    public List<Question> getQuestions() {
        try {
            FileReader reader = new FileReader(pathToFile);
            return gson.fromJson(reader, new TypeToken<List<Question>>() {}.getType());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
