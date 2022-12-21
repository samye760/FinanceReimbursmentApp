package org.personal;

public class AuthService {

    public static void login(String email, String password) {
        AuthRepository.login(email, password);
    }
}
