package com.thoughtworks.exam.bff.adapter.client;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class BlankQuizDTO {
    private String blankQuizId;

    @Override
    public String toString() {
        return blankQuizId;
    }
}
