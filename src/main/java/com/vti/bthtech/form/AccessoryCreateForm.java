package com.vti.bthtech.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Getter
@Setter
public class AccessoryCreateForm {
    @NotBlank //khac null, >0 không có dấu cách
    @Length(max = 255)
    private  String name;

    @NotNull
    @PositiveOrZero
    private  Long price;

    @NotBlank
    @Length(max = 255)
    private  String statusDamaged;

    @NotBlank
    @Length(max = 255)
    private  String repairStatus;

    @NotBlank
    @Length(max = 255)
    private String licensePlate;

    @NotNull
    @PastOrPresent
    private LocalDate repairDate;
}
