package com.vti.bthtech.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class AccessoryDto { // map từ entity sang dto
    private Long id;
    private  String name;
    private  Long price;
    private  String statusDamaged;
    private  String repairStatus;
    @JsonProperty("licensePlate")
    private String  carPkLicensePlate;
    @JsonProperty("repairDate")
    private LocalDate carPkRepairDate;
}
