package ru.kurbanov.edu.wqe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kurbanov.edu.wqe.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {

}
