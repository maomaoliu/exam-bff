
package com.thoughtworks.exam.bff.adapter.client;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateQuizCommand {
    private String teacherId;
    private String question;
    private Integer score;
    private String referenceAnswer;
}
