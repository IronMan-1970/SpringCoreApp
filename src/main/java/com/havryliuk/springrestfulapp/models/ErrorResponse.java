package com.havryliuk.springrestfulapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    int statusCode;
    String description;
    long timeStump;
}
