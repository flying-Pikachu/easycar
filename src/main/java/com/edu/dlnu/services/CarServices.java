package com.edu.dlnu.services;

import com.edu.dlnu.been.Car;

import java.util.List;
import java.util.Map;

public interface CarServices {

    List<Car> getCarsByBrand(String carBrand);

    int delete(String carID);
}
