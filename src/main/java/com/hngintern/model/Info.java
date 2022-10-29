package com.hngintern.model;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class Info {
    private String slackUsername;
    private Boolean backend;
    private Integer age;
    private String bio;
}
