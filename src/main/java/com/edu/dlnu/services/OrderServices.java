package com.edu.dlnu.services;

import com.edu.dlnu.been.Order;

import java.util.List;

public interface OrderServices {

    List<Order> getAllOrdersByOrderNum(String OrderNum);
}
