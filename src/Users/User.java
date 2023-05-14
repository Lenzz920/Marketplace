package Users;

import Carts.Cart;

import java.util.ArrayList;
import java.util.List;

public class User {
    final private String username;
    final private String email;
    private String password;
    private boolean loggedIn;
    final private Cart userCart;
    private final static List<String> users = new ArrayList<>();

    public User(String username, String email, String password) {
        if (users.contains(username) || users.contains(email)) {
            throw new IllegalArgumentException("User already exists with this username or email");
        } else {
            this.username = username;
            this.email = email;
            this.password = password;
            this.loggedIn = false;
            this.userCart = new Cart(); //when the user is not logged in, the cart should not be initialized or accessed
            users.add(username);
            users.add(email);
        }
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public Cart getUserCart() {
        if (isLoggedIn()) {
            return userCart;
        } else {
            throw new IllegalStateException("User is not logged in");
        }
    }

    public void logIn(String username, String password) {
        if (loggedIn) {
            System.out.println("You are already logged in");
            System.out.println("------------------------");
        } else {
            System.out.println("Please enter your username and password to login");
            System.out.println("------------------------");
            if (username.equals(getUsername()) && password.equals(getPassword())) {
                System.out.println("Login was successfull");
                System.out.println("------------------------");
                this.loggedIn = true;
            } else {
                System.out.println("Wrong username or password, please try again with valid credentials");
                System.out.println("------------------------");
            }
        }

    }

    public void logOut() {
        System.out.println("You have successfully logged out");
        System.out.println("------------------------");
        this.loggedIn = false;
    }

    public void resetPassword(String password, String passwordRepeat) {
        System.out.println("Please insert a new password, and then repeat it");
        System.out.println("------------------------");
        if (password.equals(passwordRepeat)) {
            this.password = password;
        } else {
            System.out.println("Please make sure that the passwords match");
            System.out.println("------------------------");
        }
    }
}
