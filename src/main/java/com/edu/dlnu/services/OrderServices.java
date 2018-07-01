package com.edu.dlnu.services;

import com.edu.dlnu.been.Order;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface OrderServices {

    List<Order> getAllOrdersByOrderNum(String OrderNum);

    PageInfo<Order> getAllOrdersByUserName(int pn, String userName);

    int add(Order order);

    int cancel(String orderNum);

    int update(Order order);
}
