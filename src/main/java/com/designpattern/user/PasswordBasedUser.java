package com.designpattern.user;

/**
 *
 * @author Pawinee Mahantamak
 */
public class PasswordBasedUser  extends User implements Authenticatable{
      private String password;

    public PasswordBasedUser(String username, String email, String password) {
        super(username, email);
        this.password = password;
    }

    @Override
    public boolean authenticate(String username, String password) {
        return getUsername().equals(username) && this.password.equals(password);
    }
}
