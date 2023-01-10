package Ex;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String passwordInput = scanner.nextLine ();

        boolean isPasswordLengthValid = isValidLength (passwordInput);
        if (!isPasswordLengthValid) {
            System.out.println ("Password must be between 6 and 10 characters");
        }

        boolean isPasswordContentValid = isValidContent (passwordInput);
        if (!isPasswordContentValid) {
            System.out.println ("Password must consist only of letters and digits");
        }

        boolean isPasswordCountDigitsValid = isValidCountDigits (passwordInput);
        if (!isPasswordCountDigitsValid) {
            System.out.println ("Password must have at least 2 digits");
        }
        if (isPasswordContentValid && isPasswordLengthValid && isPasswordCountDigitsValid) {
            System.out.println ("Password is valid");
        }

    }

    public static boolean isValidLength(String password) {
        if (password.length () >= 6 && password.length () <= 10) {
            return true;
        } else {
            return false;
        }
        //  return password.length () >= 6 && password.length () <= 10;

    }

    public static boolean isValidContent(String password) {
        for (char symbol : password.toCharArray ()) {
            if (!Character.isLetterOrDigit (symbol)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidCountDigits(String password) {
        int countDigits = 0;
        // Pesho123
        for (char symbol : password.toCharArray ()) {
            if (Character.isDigit (symbol)) {
                countDigits++;
            }
        }
        /* if (countDigits >= 2 ) {
        return true;
        } else {
        return false;
        }
         */
        return countDigits >= 2;
    }
}

