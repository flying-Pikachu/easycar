package com.edu.dlnu.services;

import com.edu.dlnu.been.Car;

import java.util.List;
import java.util.Map;

public interface CarServices {

    List<Car> getCarsByBrand(String carBrand);

    Car getCarByCarID(String carID);

    int delete(String carID);

    int update(Car car);

    int add(Car car);
}
