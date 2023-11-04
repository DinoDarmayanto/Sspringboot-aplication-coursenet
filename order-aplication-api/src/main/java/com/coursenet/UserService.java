package com.coursenet;


import com.coursenet.model.UserDTO;

import java.util.List;

public interface UserService {

        void  createNewUser(String username, String password, String email,String address, String noHp );
        List<UserDTO> getUserList();
        UserDTO getUser(String orderId);

    }


