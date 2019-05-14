package strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static LoginManager mManager;
    private static List<Login> mList;

    public static void main(String[] args) {
        mManager = new LoginManager();
        mList = new ArrayList<>();
        mList.add(new EmailLogin("Peter Parker"));
        mList.add(new FacebookLogin("Ariana Grande"));
        mList.add(new GoogleLogin("Harrison Ford"));
        mList.add(new GoogleLogin("Tywin Lannister"));
        mList.add(new EmailLogin("Pikachu"));
        mList.add(new EmailLogin("Kiếm sĩ đầu Y đuôi O"));

        for (Login login : mList) {
            mManager.loginControl(login);
        }
    }
}
