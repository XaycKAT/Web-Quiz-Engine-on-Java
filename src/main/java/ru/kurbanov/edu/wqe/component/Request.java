package ru.kurbanov.edu.wqe.component;

import lombok.Data;

import java.util.List;

@Data
public class Request {
    private Long id;
    private String title;
    private String text;
    private List<String> options;
    private List<Integer> answer;
}
