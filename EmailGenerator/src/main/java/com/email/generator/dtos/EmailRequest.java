package com.email.generator.dtos;


import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}
