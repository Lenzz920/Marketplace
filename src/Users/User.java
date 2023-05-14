package Users;

public class User {

    final private String username;
    final private String email;
    private String password;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
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

    public void logIn(String username, String password) {
        System.out.println("Please enter your username and password to log in");
        if(username.equals(getUsername())  && password.equals(getPassword())){
            System.out.println("Login was successfull");
        } else {
            System.out.println("Wrong username or password");
        }
    }

    public void logOut() {
        System.out.println("You have successfully logged out");
    }

    public void resetPassword (String password, String passwordRepeat) {
        System.out.println("Please insert a new password, and then repeat it");
        if(password.equals(passwordRepeat)){
            this.password = password;
        } else System.out.println("Please make sure that the passwords match");
    }
}
