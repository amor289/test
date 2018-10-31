package com.atguigu.gmall.service.impl;



import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress1 = new UserAddress(1, "北京", "1", "李老师", "1234", "1234");
        UserAddress userAddress2 = new UserAddress(2, "北京", "1", "李老师", "1234", "1234");
        return Arrays.asList(userAddress1,userAddress2);
    }
}
