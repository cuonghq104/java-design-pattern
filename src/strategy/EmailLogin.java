package strategy;

public class EmailLogin extends Login {
    public EmailLogin(String name) {
        super(name);
    }

    @Override
    protected void doLogin() {
        System.out.println("User " + name + " just login using email");
    }
}
