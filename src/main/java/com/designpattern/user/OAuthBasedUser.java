package com.designpattern.user;

/**
 *
 * @author Pawinee Mahantamak
 */
public class OAuthBasedUser extends User implements OAuthAuthenticatable {
    private String provider; // Google, Facebook, Twitter, etc.
    private String accessToken;

    public OAuthBasedUser(String username, String email, String provider, String accessToken) {
        super(username, email);
        this.provider = provider;
        this.accessToken = accessToken;
    }

    @Override
    public boolean authenticateOAuth(String accessToken) {
        return this.accessToken.equals(accessToken);
    }
}
