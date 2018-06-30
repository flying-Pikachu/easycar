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

    /**
     * create by: xzp
     * description: 通过订单号得到全部的订单，如果好吗是空，返回全部订单
     * create time: 下午10:20 2018/6/28
     *
     * @param orderNum 订单号
     * @return java.util.List<com.edu.dlnu.been.Order>
     * @throws
     */
    public List<Order> getAllOrdersByOrderNum(final String orderNum) {
        if (orderNum.equals("")) {
            return orderMapper.selectByExample(null);
        } else
            return new ArrayList<Order>(){
                {
                    if (orderMapper.selectByPrimaryKey(orderNum) != null)
                        add(orderMapper.selectByPrimaryKey(orderNum));
                }
            };
    }

    /**
     * create by: xzp
     * description: 添加一个订单
     * create time: 下午9:08 2018/6/29
     *
     * @param order
     * @return int
     */
    public int add(Order order) {
        return orderMapper.insert(order);
    }


}
