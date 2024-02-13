package com.designpattern.mockdata.user;

import com.designpattern.controller.UserManager;
import com.designpattern.user.User;
import java.util.List;

/**
 *
 * @author Pawinee Mahantamak
 */
public class MockUser {

    public static List<User> Users() {

        UserAbstractFactory factory = new ConcreteUserFactory();


        User passwordBasedUser1 = factory.createUser("Bill", "bill@xzy.com", "PasswordBased", "aBcz%4");
        User passwordBasedUser2 = factory.createUser("Bo", "bo@xzy.com", "PasswordBased", "elR&8");
        User passwordBasedUser3 = factory.createUser("Jo", "jo@xzy.com", "PasswordBased", "fSw@d");
        User OAuthdBasedUser1 = factory.createUser("Jessy", "jessy@xzy.com", "OAuthBased", "Facebook", "token1");
        User OAuthdBasedUser2 = factory.createUser("Bob", "bob@xzy.com", "OAuthBased", "Google", "token2");
        User OAuthdBasedUser3 = factory.createUser("Alice", "alice@xzy.com", "OAuthBased", "Twitter", "token3");


        UserManager userManager = UserManager.Instance();


        userManager.addUser(passwordBasedUser1);
        userManager.addUser(passwordBasedUser2);
        userManager.addUser(passwordBasedUser3);
        userManager.addUser(OAuthdBasedUser1);
        userManager.addUser(OAuthdBasedUser2);
        userManager.addUser(OAuthdBasedUser3);

        return userManager.getUsers();
    }

}
