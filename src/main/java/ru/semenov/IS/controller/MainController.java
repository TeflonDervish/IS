package ru.semenov.IS.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.semenov.IS.model.Modem;
import ru.semenov.IS.model.Question;
import ru.semenov.IS.service.ModemService;
import ru.semenov.IS.service.QuestionService;

import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    private static final Logger log = LoggerFactory.getLogger(MainController.class);
    private final QuestionService questionService;
    private final ModemService modemService;

    public MainController(QuestionService questionService, ModemService modemService) {
        this.questionService = questionService;
        this.modemService = modemService;
    }

    @GetMapping
    private String mainPage() {
        return "index";
    }

    @GetMapping("/question")
    private String question(Model model) {
        try {
            Question question = questionService.getCurrentQuestion();

            model.addAttribute("questionNumber", "Вопрос №" + (question.getId() + 1));
            model.addAttribute("questionText", question.getText());
            model.addAttribute("options", question.getOptions());

            return "question";
        } catch (NullPointerException e) {
            return "redirect:/result";
        }
    }

    @PostMapping("/submit-answer")
    private String answer(@RequestParam(value = "answer") Integer id) {
        questionService.setQuestionAnswer(id);
        return "redirect:/question";
    }

    @GetMapping("/result")
    private String result(Model model) {
        Map<String, String> result = questionService.getResult();
        List<Modem> modems = modemService.getResult(result);
        return "result";
    }

    @GetMapping("/again")
    private String again() {
        questionService.again();
        return "redirect:/question";
    }

    public ModemService getModemService() {
        return modemService;
    }

}
