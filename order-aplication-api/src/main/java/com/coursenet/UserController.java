package com.coursenet;

import com.coursenet.model.User;
import com.coursenet.model.UserDTO;

import java.util.List;

public interface UserController {


    void  createNewUser(String username, String password, String email,String address, String noHp);
    List<UserDTO> getUserList();

    UserDTO getUser(String userId);
}
