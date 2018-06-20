package com.vardhan.springboot.swaggerexample.resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("rest/user")
public class UserResource {

    @GetMapping
    public List<User> getUsers() {
        return Arrays.asList(
                new User("Sam", 2000L),
                new User("Peter", 1000L)
        );
    }

    @GetMapping("/{userName}")
    public User getUser(@PathVariable("userName") final String userName){
        return new User(userName, 1000L);
    }


    private class User{
        private String username;
        private Long salary;

        public String getUsername() {
            return username;
        }

        public User(String username, Long salary) {
            this.username = username;
            this.salary = salary;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public Long getSalary() {
            return salary;
        }

        public void setSalary(Long salary) {
            this.salary = salary;
        }
    }
}
