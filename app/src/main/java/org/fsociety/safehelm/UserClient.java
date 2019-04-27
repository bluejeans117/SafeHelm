package org.fsociety.safehelm;

import android.app.Application;

import org.fsociety.safehelm.models.User;


public class UserClient extends Application {

    private User user = null;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
