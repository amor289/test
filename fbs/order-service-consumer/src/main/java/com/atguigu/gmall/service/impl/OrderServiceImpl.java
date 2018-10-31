package com.atguigu.gmall.service.impl;



import gmall.bean.UserAddress;
import gmall.service.OrderService;
import gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    UserService userService;
    @Override
    public void initOrder(String userId) {
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        System.out.println(userAddressList);
    }
}
