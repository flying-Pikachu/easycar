package com.edu.dlnu.services;

import com.edu.dlnu.been.User;

public interface UserServices {

    User searchUserByName(String name);

    boolean insert(String userName, String userPassword);

}
