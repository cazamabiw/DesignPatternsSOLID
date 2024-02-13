package com.designpattern.mockdata.user;

import com.designpattern.user.OAuthBasedUser;
import com.designpattern.user.PasswordBasedUser;
import com.designpattern.user.User;


/**
 *
 * @author Pawinee Mahantamak
 */
public class ConcreteUserFactory implements UserAbstractFactory{

    @Override
    public User createUser(String username, String email, Object... args) {
            String type = (String) args[0]; 
        switch (type) {
            case "PasswordBased":
                String password = (String) args[1];
                return new PasswordBasedUser(username,email,password);
            case "OAuthBased":
                 String provider = (String) args[1];
                 String accessToken = (String) args[2];
                return new OAuthBasedUser(username, email,provider,accessToken);
            default:
                throw new IllegalArgumentException("Invalid task type: " + type);
        }
    }
    
}
