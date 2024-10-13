package com.voltz.patinhascompany.utils;

import java.util.regex.Pattern;

public class ValidationUtils {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";
    private static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-zA-Z]).{6,}$"; // Min. 6 caracteres, pelo menos 1 letra e 1 número

    // Método para validar e-mail
    public static boolean isValidEmail(String email) {
        return Pattern.compile(EMAIL_REGEX).matcher(email).matches();
    }

    // Método para validar senha
    public static boolean isValidPassword(String password) {
        return Pattern.compile(PASSWORD_REGEX).matcher(password).matches();
    }

    // Outros métodos de validação podem ser adicionados aqui
}
