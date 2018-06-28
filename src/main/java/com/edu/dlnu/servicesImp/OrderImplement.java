package com.edu.dlnu.servicesImp;

import com.edu.dlnu.been.Order;
import com.edu.dlnu.mapper.OrderMapper;
import com.edu.dlnu.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderImplement implements OrderServices {

    @Autowired
    private OrderMapper orderMapper;

    public List<Order> getAllOrdersByOrderNum(final String orderNum) {
        if (orderNum.equals("")) {
            System.out.println("dsfsdf" + orderNum);
            System.out.println(orderMapper.findAllOrders().size());
            return orderMapper.findAllOrders();
        } else
            return new ArrayList<Order>(){
                {
                    add(orderMapper.selectByPrimaryKey(orderNum));
                }
            };
    }
}
