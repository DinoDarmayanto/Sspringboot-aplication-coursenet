package com.coursenet;


import com.coursenet.model.User;

import java.util.List;

public interface UserRepository {

        User getUser(String userId);
        List<User> getUsers();
        void  insertUser(User user);
        void  updateUser(User user);
        void  deleteUser(String userId);

    }


