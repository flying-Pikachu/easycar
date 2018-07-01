package com.edu.dlnu.controller;
import com.edu.dlnu.been.Order;
import com.edu.dlnu.services.CarServices;
import com.edu.dlnu.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


@Controller
@RequestMapping("orders")
public class OrdersController {
    @Autowired
    private OrderServices orderServices;

    @Autowired
    private CarServices carServices;

    /**
     * create by: xzp
     * description:得到全部的订单
     * create time: 下午8:55 2018/6/29
     *
     * @param model
     * @return java.lang.String
     */
    @RequestMapping("allOrders")
    public String getAllOrders(Model model) {
        model.addAttribute("allOrders", orderServices.getAllOrdersByOrderNum(""));
        model.addAttribute("allCars", carServices.getCarsByBrand(""));
        return "OrderCenter";
    }

    /**
     * create by: xzp
     * description: 通过订单号得到全部的订单
     * create time: 下午8:56 2018/6/29
     *
     * @param orderNum
     * @return java.lang.String
     */
    @RequestMapping("allOrdersByOrderNum")
    public String getAllOrdersByOrderNum(Model model, String orderNum) {
        model.addAttribute("allOrders", orderServices.getAllOrdersByOrderNum(orderNum));
        model.addAttribute("allCars", carServices.getCarsByBrand(""));
        return "OrderCenter";
    }

    @RequestMapping({"allOrdersByUserName", "/"})
    public String getAllOrdersByUserName(Model model, @RequestParam int pn, @RequestParam String userName) {
        System.out.println("userName===" + userName);
        model.addAttribute("page", orderServices.getAllOrdersByUserName(pn, userName));
        model.addAttribute("userName", userName);
        return "UserOrderCenter";
    }

    @RequestMapping({"updateGetOrder", "/"})
    public String updateGetOrder(Model model, @RequestParam String orderNum) {
        model.addAttribute("order", orderServices.getAllOrdersByOrderNum(orderNum).get(0));
        model.addAttribute("car", carServices.getCarByCarID(orderServices.getAllOrdersByOrderNum(orderNum).get(0).getCarid()));
        return "OrderModify";
    }

    @RequestMapping({"update", "/"})
    public String update(Model model, String orderNum, String userName, final String pickUpTime, final String returnTime){
        Order order = orderServices.getAllOrdersByOrderNum(orderNum).get(0);
        System.out.println("123" + pickUpTime);
        System.out.println("456" + returnTime);
        String[] subPick = pickUpTime.split("-");
        String[] retPick = returnTime.split("-");
        order.setPickuptime(new Date(Integer.parseInt(subPick[0]) - 1900, Integer.parseInt(subPick[1]) - 1, Integer.parseInt(subPick[2])));
        order.setReturntime(new Date(Integer.parseInt(retPick[0]) - 1900, Integer.parseInt(retPick[1]) - 1, Integer.parseInt(retPick[2])));
        orderServices.update(order);
        model.addAttribute("order", orderServices.getAllOrdersByOrderNum(orderNum).get(0));
        model.addAttribute("car", carServices.getCarByCarID(order.getCarid()));
        model.addAttribute("userName", userName);
        return "UserOrder";
    }

    @RequestMapping({"cancel", "/"})
    public String orderCancel(Model model, @RequestParam String orderNum, @RequestParam String userName) {
        int isCancel = orderServices.cancel(orderNum);
        model.addAttribute("order", orderServices.getAllOrdersByOrderNum(orderNum).get(0));
        model.addAttribute("car", carServices.getCarByCarID(orderServices.getAllOrdersByOrderNum(orderNum).get(0).getCarid()));
        model.addAttribute("userName", userName);
        return "OrderCancel";
    }

    @RequestMapping({"orderByOrderNum", "/"})
    public String getOrderByOrderNum(Model model, @RequestParam String orderNum, @RequestParam String userName) {
        model.addAttribute("order", orderServices.getAllOrdersByOrderNum(orderNum).get(0));
        model.addAttribute("car", carServices.getCarByCarID(orderServices.getAllOrdersByOrderNum(orderNum).get(0).getCarid()));
        model.addAttribute("userName", userName);
        return "UserOrder";
    }
    /**
     * create by: xzp
     * description: 添加订单
     * create time: 下午9:19 2018/6/29
     *
     * @param model
     * @param carID
     * @param userName
     * @param pickUpTime
     * @param returnTime
     * @param orderCost
     * @return java.lang.String
     */
    @RequestMapping("add")
    public String add(Model model, final String carID, final String userName, final String pickUpTime, final String returnTime, final double orderCost) {
        int i = 1;
        while (orderServices.getAllOrdersByOrderNum(""+i).size() != 0) {
            i++;
        }
        System.out.println("userName = " + userName);
        final String orderNum = i + "";
        int isAdd = orderServices.add(new Order(){
            {
                setOrdernum(orderNum);
                setCarid(carID);
                setUsername(userName);
                String[] subPick = pickUpTime.split("-");
                String[] retPick = returnTime.split("-");
                setPickuptime(new Date(Integer.parseInt(subPick[0]) - 1900, Integer.parseInt(subPick[1]) - 1, Integer.parseInt(subPick[2])));
                setReturntime(new Date(Integer.parseInt(retPick[0]) - 1900, Integer.parseInt(retPick[1]) - 1, Integer.parseInt(retPick[2])));
                setOrdercost(orderCost);
                setOrderstatus(0);
            }
        });
        if (isAdd > 0)
            model.addAttribute("isSucc", "true");
        else
            model.addAttribute("isSucc", "false");
        return getOrderByOrderNum(model, orderNum, userName);
    }
}
