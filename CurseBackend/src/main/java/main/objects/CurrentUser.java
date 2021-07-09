package main.objects;

public class CurrentUser {
    private boolean userActiveStatus;
    private String userlogin;

    public CurrentUser(String userLogin, boolean userActiveStatus) {
        this.userlogin = userLogin;
        this.userActiveStatus = userActiveStatus;
    }

    public static void userDisconnected() {
        //обработка выхода пользователя из игры
    }
}
