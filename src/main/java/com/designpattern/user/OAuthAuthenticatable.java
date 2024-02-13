package com.designpattern.user;

/**
 *
 * @author Pawinee Mahantamak
 */
public interface OAuthAuthenticatable {
   boolean authenticateOAuth(String accessToken);

}
