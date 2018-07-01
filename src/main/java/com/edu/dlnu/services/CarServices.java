package com.edu.dlnu.services;

import com.edu.dlnu.been.Car;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface CarServices {

    List<Car> getCarsByBrand(String carBrand);

    Car getCarByCarID(String carID);

    List<String> getCarsBrands();

    PageInfo getCarsWithoutHire(int pn);

    PageInfo getCarsWithoutHireByCarBrand(int pn, String carBrand);

    PageInfo getCarsWithoutHireByBrandAndPrice(int pn, String carBrand, double lowPrice, double highPrice);

    int delete(String carID);

    int update(Car car);

    int add(Car car);

}
