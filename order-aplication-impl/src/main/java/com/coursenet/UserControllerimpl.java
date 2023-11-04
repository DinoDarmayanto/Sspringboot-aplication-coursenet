package com.coursenet;


import com.coursenet.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserControllerimpl  implements  UserController{


        @Autowired
        UserService userService;

        @Override
        public  void createNewUser(String username, String password, String email, String address, String noHp){

        }

        @Override
        public List<UserDTO> getUserList(){
            return  userService.getUserList();
        }

        @Override
        public  UserDTO getUser(String userId){
            return  userService.getUser(userId);
        }
    }


