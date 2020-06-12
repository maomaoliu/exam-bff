package com.thoughtworks.exam.bff.adapter.client;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BlankQuizClient {
    private RestTemplate restTemplate;

    public BlankQuizClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String create(CreateQuizCommand createQuizCommand) {
        return restTemplate.postForObject("http://localhost:8100/quizzes", createQuizCommand, BlankQuizDTO.class).toString();
    }
}