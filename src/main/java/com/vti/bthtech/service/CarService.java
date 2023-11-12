package com.vti.bthtech.service;

import com.vti.bthtech.dto.CarDto;
import com.vti.bthtech.entity.Car;
import com.vti.bthtech.form.CarCreateForm;
import com.vti.bthtech.form.CarUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface CarService  {
   Page<CarDto> findAll (Pageable pageable);
   CarDto create(CarCreateForm form);

   CarDto update (CarUpdateForm form);

   void deleteById(Car.PrimaryKey pk);
}
