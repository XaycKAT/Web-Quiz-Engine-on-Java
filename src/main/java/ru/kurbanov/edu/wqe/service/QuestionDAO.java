package ru.kurbanov.edu.wqe.service;

import org.springframework.stereotype.Service;
import ru.kurbanov.edu.wqe.model.Question;
import ru.kurbanov.edu.wqe.component.Response;
import ru.kurbanov.edu.wqe.repository.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Deprecated
public class QuestionDAO implements DAO<Question, Response> {

    private final List<Question> questions = new ArrayList<>();

    @Override
    public Optional<Question> get(int id) {
        return Optional.ofNullable(questions.get(id - 1));
    }

    @Override
    public List<Question> getAll() {
        return questions;
    }

    @Override
    public void add(Question question) {
        questions.add(question);
    }

    @Override
    public void update(Question question, String[] params) {

    }

    @Override
    public void delete(Question question) {
        questions.remove(question);
    }
}
