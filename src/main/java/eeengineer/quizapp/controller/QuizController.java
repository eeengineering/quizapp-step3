package eeengineer.quizapp.controller;

import eeengineer.quizapp.entity.Quiz;
import eeengineer.quizapp.service.QuizService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/quiz")
public class QuizController {

    private QuizService quizService;

    public QuizController(QuizService theQuizService) {
        quizService = theQuizService;
    }

    @GetMapping("/list")
    public String listQuiz(Model theModel) {

        // get the quiz from db
        List<Quiz> theQuiz = quizService.findAll();

        // add to the spring model
        theModel.addAttribute("quiz", theQuiz);

        return "list-quiz";
    }

    @GetMapping("/list/{quizid}")
    public String QuizByID(@PathVariable Integer quizid, Model theModel) {

        Quiz theQuiz = quizService.findById(quizid);

        // add to the spring model
        theModel.addAttribute("quiz", theQuiz);

        return "byid-quiz";
    }

    @GetMapping("/list/toggleStatus")
    public String changeStatus(Integer quizid) {
        quizService.changeStatus(quizid);
        return "redirect:/";
    }

}