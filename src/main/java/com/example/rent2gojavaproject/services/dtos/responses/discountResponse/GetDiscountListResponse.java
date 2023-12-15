package com.example.rent2gojavaproject.services.dtos.responses.discountResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetDiscountListResponse {
    private int id;
    private String discountCode;
    private double percentage;
    private int rentalId;
}
