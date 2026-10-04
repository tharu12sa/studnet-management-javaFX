package Contoller.login;

public class LoginContoller {
    public boolean cheakUserNameandPasswod(String name, String password) {
        if (name.equals("saman") && password.equals("saman12")){
            return true;
        }
        return  false;
    }
}
