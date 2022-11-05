package com.hngintern.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Request {
    private String operation_type;
    private int x;
    private int y;
}
