package ru.kurbanov.edu.wqe.service;

import ru.kurbanov.edu.wqe.model.Question;

import java.util.List;

public interface QuizService {

    Question getQuestionById(long id);

    Question saveQuestion(Question question);

    Question updateQuestion(long id, Question question);

    void deleteQuestion(long id);

    List<Question> getAllQuestions();

}
