package com.elasticsearch.demo.util;

import lombok.Data;

@Data
public class ErrorResponse {
    private Integer code;
    private String msg;
}
