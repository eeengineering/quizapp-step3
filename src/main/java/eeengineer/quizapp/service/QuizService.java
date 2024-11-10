package eeengineer.quizapp.service;

import eeengineer.quizapp.entity.Quiz;
import java.util.List;

public interface QuizService {

    List<Quiz> findAll();

    Quiz findById(int theId);

    void changeStatus(int theId);

}
