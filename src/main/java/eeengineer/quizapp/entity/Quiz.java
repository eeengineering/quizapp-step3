package eeengineer.quizapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name="quiz")
public class Quiz {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="quizid")
    private int quizid;
    
    @Column(name="userid")
    private int userid;

    @Column(name="quiz")
    private String quiz;

    @Column(name="category")
    private String category;

    @Column(name="option1")
    private String option1;

    @Column(name="option2")
    private String option2;

    @Column(name="option3")
    private String option3;

    @Column(name="option4")
    private String option4;

    @Column(name="answer")
    private int answer;

    @Column(name="explain")
    private String explain;

    @Column(name="status")
    private String status;

    // define constructors
    public Quiz() {

    }

    public Quiz(int quizid, int userid,String quiz, String category, String option1, String option2, String option3, String option4, Integer answer, String explain, String status) {
        this.quizid = quizid;
        this.userid = userid;
        this.quiz = quiz;
        this.category = category;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
        this.explain = explain;
        this.status = status;
    }

    public int getQuizid() {
        return quizid;
    }
    
    public Integer getUserid() {
        return userid;
    }

    public String getQuiz() {
        return quiz;
    }

    public String getCategory() {
        return category;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public Integer getAnswer() {
        return answer;
    }

    public String getExplain() {
        return explain;
    }

    public String getStatus() {
        return status;
    }

    public void setQuizid(int quizid) {
        this.quizid = quizid;
    }
    
    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setQuiz(String quiz) {
        this.quiz = quiz;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // define toString
    @Override
    public String toString() {
        return "Qiuz{" +
                "quizid=" + quizid +
                ", category='" + category + '\'' +
                ", quiz='" + quiz + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}