package Users;

import Carts.Cart;

public class User {
    final private String username;
    final private String email;
    private String password;
    private boolean loggedIn;
    private final Cart userCart;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.loggedIn = isLoggedIn();
        this.userCart = new Cart();
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
        return userCart;
    }

    public void logIn(String username, String password) {
        if(loggedIn) {
            System.out.println("You are already logged in");
            System.out.println("------------------------");
        } else {
            System.out.println("Please enter your username and password to login");
            System.out.println("------------------------");
            if(username.equals(getUsername())  && password.equals(getPassword())){
                System.out.println("Login was successfull");
                System.out.println("------------------------");
                loggedIn = true;
            } else {
                System.out.println("Wrong username or password, please try again with valid credentials");
                System.out.println("------------------------");
            }
        }

    }

    public void logOut() {
        System.out.println("You have successfully logged out");
        System.out.println("------------------------");
        loggedIn = false;
    }

    public void resetPassword (String password, String passwordRepeat) {
        System.out.println("Please insert a new password, and then repeat it");
        System.out.println("------------------------");
        if(password.equals(passwordRepeat)){
            this.password = password;
        } else System.out.println("Please make sure that the passwords match");
        System.out.println("------------------------");
    }

}
