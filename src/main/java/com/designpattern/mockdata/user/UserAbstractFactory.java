package com.designpattern.mockdata.user;

import com.designpattern.user.User;

/**
 *
 * @author Pawinee Mahantamak
 */
public interface UserAbstractFactory {
       User createUser(String username, String password, Object... args);
}
