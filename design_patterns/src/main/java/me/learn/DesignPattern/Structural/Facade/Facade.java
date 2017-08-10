package me.learn.DesignPattern.Structural.Facade;

public class Facade {

    private AccessToken accessToken;
    private Service service;

    public Facade() {
        this.accessToken = new AccessToken();
        this.service = new Service();
    }

    public void operationA() {
        if (! accessToken.isAuthorized()) {
            accessToken.requireAuth();
        }

        service.operationA();

        accessToken.releaseAuth();
    }

    public void operationB() {
        if (! accessToken.isAuthorized()) {
            accessToken.requireAuth();
        }

        service.operationB();

        accessToken.releaseAuth();
    }

}
