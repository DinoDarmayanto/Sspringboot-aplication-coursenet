package com.coursenet;


import com.coursenet.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UseRepositoryimpl  implements  UserRepository{







        @Autowired
        @Qualifier("mySQLDatabaseConnection")
        private DatabaseConnection databaseConnection;



        @Override
        public User getUser(String userId) {
            databaseConnection.select();
            return new User (userId, "Dino", "mypassword", "dinodarmayanto@gmail.com", "Jakarta", "08823737821");

        }

        @Override
        public List<User> getUsers() {
            databaseConnection.select();
            List<User> users = new ArrayList<>();
            users.add(new User(
                    "1",
                    "Dino",
                    "mypassword",
                    "dinodarmayanto@gmail.com",
                    "Jakarta",
                    "08823737821"
            ));
            users.add(
                    new User(
                            "2",
                            "Angga",
                            "mypassword",
                            "Anggayunanda@gmail.com",
                            "Jakarta",
                            "08372892772"
                    ));
            return users;
        }

        @Override
        public void insertUser(User user) {
            databaseConnection.insert();
        }

        @Override
        public void updateUser(User user) {
            databaseConnection.update();
        }

        @Override
        public void deleteUser(String userId) {
            databaseConnection.delete();
        }
    }


