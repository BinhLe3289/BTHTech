package com.vti.bthtech.repository;

import com.vti.bthtech.entity.Accessory;
import com.vti.bthtech.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Car.PrimaryKey> {
}