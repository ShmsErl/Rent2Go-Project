package com.example.rent2gojavaproject.services.dtos.requests.colorRequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateColorRequest {
    private int id;
    private String name;
}
