package strategy;

import sun.rmi.runtime.Log;

public class FacebookLogin extends Login {

    public FacebookLogin(String name) {
        super(name);
    }

    @Override
    protected void doLogin() {
        System.out.println("User " + name + " just login by Facebook");
    }
}
