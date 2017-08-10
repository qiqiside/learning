package me.learn.DesignPattern.Structural.Facade;

import me.learn.DesignPattern.utils.Util;

public class AccessToken {

    private Boolean isAuthorized = false;

    public void requireAuth() {
        Util.show(this, "requireAuth");
        isAuthorized = true;
    }

    public void releaseAuth() {
        Util.show(this, "releaseAuth");
        isAuthorized = false;
    }

    public Boolean isAuthorized() {
        return isAuthorized;
    }

}
