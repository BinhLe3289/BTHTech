package com.vti.bthtech.form;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Getter
@Setter
public class CarCreateForm {
    @NotBlank
    @Length(max = 255)
    private String licensePlate;

    @NotNull
    @PastOrPresent
    private LocalDate repairDate;
    @NotBlank
    @Length (max = 255)

    private  String customerName;
    @NotBlank
    @Length (max = 255)

    private  String catalog;
    @NotBlank
    @Length (max = 255)

    private  String carMaker;
}
