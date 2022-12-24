package com.gestion.service.api.dataaccess.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {

    private String code;
    private String message;


    @Override
    public String toString() {
        return "ErrorMessage [code=" + code + ", message=" + message + "]";
    }
}
