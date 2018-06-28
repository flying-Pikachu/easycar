package com.edu.dlnu.servicesImp;
import com.edu.dlnu.been.User;
import com.edu.dlnu.mapper.UserMapper;
import com.edu.dlnu.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImplement implements UserServices {

    @Autowired
    private UserMapper userMapper;
    public User searchUserByName(String name) {
        System.out.println(userMapper.selectByPrimaryKey(name));
        return userMapper.selectByPrimaryKey(name);
    }
}
