package com.edu.dlnu.servicesImp;

import com.edu.dlnu.been.Car;
import com.edu.dlnu.mapper.CarMapper;
import com.edu.dlnu.services.CarServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CarImplement implements CarServices {
    @Autowired
    private CarMapper carMapper;


    public Map<String, Car> getAllCars() {
        return new HashMap<String, Car>(){
            {
                for (Car car : carMapper.findAllCars())
                    put(car.getCarid(), car);
            }
        };
    }
}
