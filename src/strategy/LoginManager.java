package strategy;

public class LoginManager {

    void loginControl(Login login) {
        if (login != null) {
            System.out.println("----------Start login------------------");
            login.doLogin();
            System.out.println("----------Done-------------------------");
        }
    }
}
