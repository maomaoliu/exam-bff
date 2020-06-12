package com.thoughtworks.exam.bff.adapter.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BlankQuizClient {
    private RestTemplate restTemplate;

    @Value("${quizService.host}")
    private String quizHost;

    @Value("${quizService.port}")
    private String quizPort;

    public BlankQuizClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String create(CreateQuizCommand createQuizCommand) {
        return restTemplate.postForObject(quizHost + ":" + quizPort + "/quizzes", createQuizCommand, BlankQuizDTO.class).toString();
    }
}