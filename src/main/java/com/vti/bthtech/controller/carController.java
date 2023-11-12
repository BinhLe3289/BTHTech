package com.vti.bthtech.controller;

import com.vti.bthtech.dto.CarDto;
import com.vti.bthtech.entity.Car;
import com.vti.bthtech.form.CarCreateForm;
import com.vti.bthtech.form.CarUpdateForm;
import com.vti.bthtech.service.CarService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController // dùng cho  controller có body trả ve
@AllArgsConstructor
@CrossOrigin("*")
public class carController {
    private final CarService carService;
    @GetMapping("api/v1/cars")
    public Page<CarDto> findAll(Pageable pageable) {
        return  carService.findAll(pageable);

    }

    @PostMapping("api/v1/cars")
    @ResponseStatus(HttpStatus.CREATED)
    public CarDto create (@RequestBody @Valid CarCreateForm form) {

        return carService.create(form);
    }
    @PutMapping("api/v1/cars")
    public CarDto update (@RequestBody @Valid CarUpdateForm form) {
        return carService.update(form);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("api/v1/cars")
    public void deleteById(@RequestBody Car.PrimaryKey pk) {
        carService.deleteById(pk);

    }
}
