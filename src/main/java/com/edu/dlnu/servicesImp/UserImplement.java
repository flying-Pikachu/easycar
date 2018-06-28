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

    /**
     * create by: xzp
     * description: 通过用户名查找用户
     * create time: 上午11:37 2018/6/28
     *
     * @param name 查询需要的用户名
     * @return com.edu.dlnu.been.User
     */
    public User searchUserByName(String name) {
        return userMapper.selectByPrimaryKey(name);
    }

    /**
     * create by: xzp
     * description: 通过用户名和用户密码插入用户信息
     * create time: 下午12:57 2018/6/28
     *
     * @param userName 插入的用户名
     * @param userPassword 插入的用户密码
     * @return boolean
     * @throws
     */
    public boolean insert(String userName, String userPassword) {
        User user = new User();
        user.setUsername(userName);
        user.setUserpassword(userPassword);
        user.setIsmanager(0);
        int i = userMapper.insert(user);
        return i > 0;
    }
}
