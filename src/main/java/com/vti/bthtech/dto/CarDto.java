package com.vti.bthtech.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CarDto {
    @JsonProperty("licensePlate")// trả về phía giao dien người dùng
    private String pkLicensePlate;

    @JsonProperty("RepairDate")
    private LocalDate pkRepairDate;
    private  String customerName;
    private  String catalog;
    private  String carMaker;

}
