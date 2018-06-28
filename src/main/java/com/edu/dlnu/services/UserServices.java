package com.edu.dlnu.services;

import com.edu.dlnu.been.User;
import org.springframework.stereotype.Service;

@Service
public interface UserServices {

    User searchUserByName(String name);

    boolean insert(String userName, String userPassword);

}
