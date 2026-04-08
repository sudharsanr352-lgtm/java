package com.user;

public class UserService {

    public static void register(User user) {

        if (!Validation.isValidEmail(user.email)) {
            System.out.println("Invalid Email");
            return;
        }

        if (!Validation.isValidPassword(user.password)) {
            System.out.println("Password must be at least 6 characters");
            return;
        }

        System.out.println("User Registered Successfully");
    }
}