package com.coursenet.confriguration;


import com.coursenet.DatabaseConnection;
import com.coursenet.MYSQLDatabaseConnection;
import com.coursenet.PostgresSQLDatabaseConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocalConfiguration {
    @Bean
    public DatabaseConnection mySQLDatabaseConnection(){
        return  new MYSQLDatabaseConnection();
    }

    @Bean

    public DatabaseConnection postgreSQLDatabaseConnection(){
        return  new PostgresSQLDatabaseConnection();
    }

//    @Bean
//    public OrderRepository orderRepository (){
//        return  new OderRepositoryimpl();
//    }

}
