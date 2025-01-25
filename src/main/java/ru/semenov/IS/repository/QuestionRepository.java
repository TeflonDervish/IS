package ru.semenov.IS.repository;

import ru.semenov.IS.model.Question;

import java.util.List;

public interface QuestionRepository {

    public List<Question> getQuestions();
}
