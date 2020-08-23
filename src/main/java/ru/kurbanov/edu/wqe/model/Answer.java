package ru.kurbanov.edu.wqe.model;

import lombok.Data;

import java.util.List;

@Data
public class Answer {
    //@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column
    //@ElementCollection
    private List<Integer> answer;
}
