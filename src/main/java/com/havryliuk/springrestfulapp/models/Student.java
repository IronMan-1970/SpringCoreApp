package com.havryliuk.springrestfulapp.models;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    int id;
    String first_name;
    String last_name;
    String email;
}
