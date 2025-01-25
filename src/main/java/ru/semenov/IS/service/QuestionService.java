package ru.semenov.IS.service;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.semenov.IS.model.Question;
import ru.semenov.IS.repository.QuestionRepository;
import ru.semenov.IS.repository.QuestionRepositoryJson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class QuestionService {

    private static final Logger log = LoggerFactory.getLogger(QuestionService.class);
    private final QuestionRepository questionRepository;
    private final Map<String, String> result;
    private Integer currentQuestionId;
    private final List<Question> questions;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
        questions = getQuestions();
        currentQuestionId = 0;
        this.result = new HashMap<>();
    }

    private List<Question> getQuestions() {
        return questionRepository.getQuestions();
    }

    public Question getCurrentQuestion() {
        return questions.get(currentQuestionId);
    }

    public void setQuestionAnswer(Integer id) {
        result.put(questions.get(currentQuestionId).getField(),
                questions.get(currentQuestionId).getOptions().get(id).getFieldType());


        log.info(questions.get(currentQuestionId).getOptions().get(id).getId().toString());

        currentQuestionId = questions.get(currentQuestionId).getOptions().get(id).getNextQuestionId();

    }

    public Map<String, String> getResult() {
        return result;
    }

    public void again() {
        this.currentQuestionId = 0;
    }
}
