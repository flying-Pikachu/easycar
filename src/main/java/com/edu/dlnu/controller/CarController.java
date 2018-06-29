package com.edu.dlnu.controller;

import com.edu.dlnu.been.Car;
import com.edu.dlnu.services.CarServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;

@Controller
@RequestMapping("cars")
public class CarController {

    @Autowired
    private CarServices carServices;

    @RequestMapping("allCars")
    public String getAllCars(Model model) {
        model.addAttribute("cars", carServices.getCarsByBrand(""));
        for (Car c : carServices.getCarsByBrand(""))
            System.out.println(c);
        return "ManagerUpdate";
    }

    @RequestMapping("allCarsByBrand")
    public String getCarsByBrand(Model model, String carBrand) {
        model.addAttribute("cars", carServices.getCarsByBrand(carBrand));
        return "ManagerUpdate";
    }

    @RequestMapping("delete")
    public String delete(Model model, String carID) {
        int isDelete = carServices.delete(carID);
        if (isDelete > 0)
            model.addAttribute("isSucc", "true");
        else
            model.addAttribute("isSucc", "false");
        return getAllCars(model);
    }
}
