package Ex3StringToNumber;

import java.util.Scanner;

public class StringToNumber {
    public static int convertStringToNumber(String numberStr){
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // 1996
        int numValue = 0;

        for (int i = 0; i < numberStr.length(); i++){
            for (int j = 0; j < digits.length; j++){
                if (numberStr.charAt(i) == digits[j] ){
                    numValue = numValue * 10 + j;
                }
            }
        }

        return numValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberStr = scanner.next();
        System.out.println("Converted string to number: " + convertStringToNumber(numberStr));
    }
}
