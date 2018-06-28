package com.edu.dlnu.controller;
import com.edu.dlnu.been.Order;
import com.edu.dlnu.services.CarServices;
import com.edu.dlnu.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;

import java.util.List;


@Controller
@RequestMapping("orders")
public class OrdersController {
    @Autowired
    private OrderServices orderServices;

    @Autowired
    private CarServices carServices;

    @RequestMapping("allOrders")
    public String getAllOrders(Model model) {
        System.out.println(orderServices.getAllOrdersByOrderNum("").size());
        model.addAttribute("allOrders", orderServices.getAllOrdersByOrderNum(""));
        return "OrderCenter";
    }

    @RequestMapping("allOrdersByOrderNum")
    public String getAllOrdersByOrderNum(Model model, String orderNum) {
        model.addAttribute("allOrders", orderServices.getAllOrdersByOrderNum(orderNum));
        model.addAttribute("allCars", carServices.getAllCars());
        return "OrderCenter";
    }
}
