package com.edu.dlnu.controller;
import com.edu.dlnu.been.Car;
import com.edu.dlnu.services.CarServices;
import com.edu.dlnu.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;

import java.util.Map;


@Controller
@RequestMapping("orders")
public class OrdersController {
    @Autowired
    private OrderServices orderServices;

    @Autowired
    private CarServices carServices;

    @RequestMapping("allOrders")
    public String getAllOrders(Model model) {
        model.addAttribute("allOrders", orderServices.getAllOrdersByOrderNum(""));
        model.addAttribute("allCars", carServices.getAllCars());
        for (Map.Entry<String, Car> entry : carServices.getAllCars().entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        return "OrderCenter";
    }

    @RequestMapping("allOrdersByOrderNum")
    public String getAllOrdersByOrderNum(Model model, String orderNum) {
        model.addAttribute("allOrders", orderServices.getAllOrdersByOrderNum(orderNum));
        model.addAttribute("allCars", carServices.getAllCars());
        return "OrderCenter";
    }
}
