package com.alexgroot.deel1.week2.narrative2;

public class PasswordValidator {
    public static void main(String[] args) {
        PasswordValidator passwordValidator = new PasswordValidator();
        System.out.println(passwordValidator.isValidPassword("fout"));
        System.out.println(passwordValidator.isValidPassword("goedeWachw6"));
        System.out.println(passwordValidator.isValidPassword("checked"));

    }

    public boolean isValidPassword(String password) {

        boolean upperCheck = false;
        boolean lowerCheck = false;
        boolean digitCheck = false;

        if (password.length() < 6 || password.length() > 13) {
            return false;
        }

        for (char c : password.toCharArray()) {
            if (!upperCheck) {
                upperCheck = upperCheck(c);
            }

            if (!lowerCheck) {
                lowerCheck = lowerCheck(c);
            }

            if (!digitCheck) {
                digitCheck = digitCheck(c);
            }


        }

        return upperCheck && lowerCheck && digitCheck;

    }

    private boolean upperCheck(char c) {
        return c >= 'A' && c <= 'Z';
    }

    private boolean lowerCheck(char c) {
        return c >= 'a' && c <= 'z';
    }

    private boolean digitCheck(char c) {
        return c >= '0' && c <= '9';
    }
}
