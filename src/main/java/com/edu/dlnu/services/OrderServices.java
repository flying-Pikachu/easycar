package com.edu.dlnu.services;

import com.edu.dlnu.been.Order;

import java.util.List;

public interface OrderServices {

    List<Order> getAllOrdersByOrderNum(String OrderNum);

    int add(Order order);

    int cancel(String orderNum);

    int update(Order order);
}
