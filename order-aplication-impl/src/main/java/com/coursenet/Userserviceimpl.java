package com.coursenet;



import com.coursenet.model.User;
import com.coursenet.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userserviceimpl implements  UserService{





        @Autowired
        private  UserRepository userRepository;

        @Override
        public  void createNewUser(String username, String password, String email, String address, String noHp){
            userRepository.insertUser(new User("1", username,  password , email, address, noHp));
            // add data to table order_user
            // reduce stock from table product
        }
        @Override
        public List<UserDTO> getUserList(){
            List<User> users = userRepository.getUsers();
            List<UserDTO> userDTOS = users.stream().map(order -> new UserDTO(order.getUserName(), order.getPassword())).toList();
            return  userDTOS;
        }

        @Override
        public  UserDTO getUser (String userId){
            User user = userRepository.getUser(userId);
            return  new UserDTO(
                    user.getUserName(),
                    user.getPassword()
            );

        }
    }


