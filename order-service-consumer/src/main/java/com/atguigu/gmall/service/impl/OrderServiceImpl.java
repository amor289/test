package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.UserAddress;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    UserService userService;
    @Override
    public void initOrder(String userId) {
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        System.out.println(userAddressList);
    }
}
