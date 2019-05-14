package strategy;

public abstract class Login {

    protected String name;

    protected abstract void doLogin();

    public Login(String name) {
        this.name = name;
    }
}
