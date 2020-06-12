package com.thoughtworks.exam.bff.adapter.client;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BlankQuizDTO {
    private String blankQuizId;

    @Override
    public String toString() {
        return blankQuizId;
    }
}
