package com.thoughtworks.exam.bff.adapter.api;

import com.thoughtworks.exam.bff.adapter.client.BlankQuizClient;
import com.thoughtworks.exam.bff.adapter.client.CreateQuizCommand;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quizzes")
public class BlankQuizController {
    private BlankQuizClient blankQuizClient;

    public BlankQuizController(BlankQuizClient blankQuizClient) {
        this.blankQuizClient = blankQuizClient;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestBody CreateQuizCommand command) {
        return blankQuizClient.create(command);
    }
}