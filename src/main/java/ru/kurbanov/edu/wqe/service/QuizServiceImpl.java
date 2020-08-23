package ru.kurbanov.edu.wqe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kurbanov.edu.wqe.model.Question;
import ru.kurbanov.edu.wqe.repository.QuestionRepository;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizService {

    private final QuestionRepository questionRepository;

    @Autowired
    public QuizServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question getQuestionById(long id) {
        return questionRepository.findById(id).get();
    }

    @Override
    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public Question updateQuestion(long id, Question question) {
        return null;
    }

    @Override
    public void deleteQuestion(long id) {
        questionRepository.deleteById(id);
    }

    @Override
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }
}
