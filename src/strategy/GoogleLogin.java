package strategy;

public class GoogleLogin extends Login {

    public GoogleLogin(String name) {
        super(name);
    }

    @Override
    protected void doLogin() {
        System.out.println("User " + name + " just login by Google Account");
    }
}
