package eeengineer.quizapp.repository;

import eeengineer.quizapp.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Integer> {

    // that's it ... no need to write any code LOL!

}