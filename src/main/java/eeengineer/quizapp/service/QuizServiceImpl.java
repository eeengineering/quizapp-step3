package eeengineer.quizapp.service;

import eeengineer.quizapp.repository.QuizRepository;
import eeengineer.quizapp.entity.Quiz;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizServiceImpl implements QuizService {

    private QuizRepository quizRepository;

    public QuizServiceImpl(QuizRepository theQuizRepository) {
        quizRepository = theQuizRepository;
    }

    @Override
    public List<Quiz> findAll() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz findById(int theId) {
        Optional<Quiz> result = quizRepository.findById(theId);

        Quiz theQuiz = null;

        if (result.isPresent()) {
            theQuiz = result.get();
        } else {
            // we didn't find the quiz
            throw new RuntimeException("Did not find quiz id - " + theId);
        }

        return theQuiz;
    }

    @Override
    public void changeStatus(int theId) {
        @SuppressWarnings("deprecation")
		Quiz theQuiz = quizRepository.getById(theId);
        String quizStatus = theQuiz.getStatus();
        String changeStatus = "";
        if(quizStatus.equals("完了")) {
            changeStatus = "未完了";
        }
        else{
            changeStatus = "完了";
        }
        theQuiz.setStatus(changeStatus);
        quizRepository.save(theQuiz);
    }
}






