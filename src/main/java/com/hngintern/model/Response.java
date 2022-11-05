package com.hngintern.model;

import lombok.*;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Response {

    private String slackUsername;

    private String operation_type;

    private int result;
}
