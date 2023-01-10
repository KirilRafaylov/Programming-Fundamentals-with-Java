package Ex;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {
            //1. сумата от цифрите да се дели на 8
            //2. съдържа поне една нечетна цифра
            if (isSumDigitsDivisibleBy8(number) && isContainsOddDigit(number)) {
                System.out.println(number);
            }
        }
    }
    //метод, който проверява дали сумата от цифрите се дели на 8
    //true -> сумата от цифрите се дели на 8
    //false -> сумата от цифрите не се дели на 8
    private static boolean isSumDigitsDivisibleBy8 (int number) {
        //1. сумата от цифирите
        int sumDigits = 0; //сума от цифрите на числото
        while (number > 0) {
            //1. взимаме последната цифра
            int lastDigit = number % 10;
            //2. добавям към сумата
            sumDigits += lastDigit;
            //3. премахвам последната цифра от числото
            number = number / 10;
        }
        //2. проверка дали сумата се дели на 8
        return sumDigits % 8 == 0;
    }

    //метод, който проверява дали имаме поне 1 нечетна цифра в числото
    //true -> имаме поне 1 нечетна цифра в числото
    //false -> нямаме нито 1 нечетна цифра в числото
    private static boolean isContainsOddDigit (int number) {
        while (number > 0) {
            //1. взимам последната цифра
            int lastDigit = number % 10;
            //2. проверка дали е нечетна
            if (lastDigit % 2 == 1) {
                return true;
            }
            //3. премахвам цифрата
            number /= 10;
        }
        //минали през всички цифри и никоя не е нечетна
        return false;
    }
}