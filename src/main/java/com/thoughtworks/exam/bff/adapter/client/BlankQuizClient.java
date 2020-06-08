package com.thoughtworks.exam.bff.adapter.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "BlankQuiz", url = "http://localhost:8001")
public interface BlankQuizClient {
    @RequestMapping(method = RequestMethod.POST, value = "/quizzes", consumes = "application/json")
    String create(CreateQuizCommand createQuizCommand);
}