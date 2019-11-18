package Ex2AnagramsSolver;

import java.util.Arrays;

public class AnagramsSolver {
    public static boolean anagramsSolver(String firstString, String secondString){
        StringBuilder anag1 = new StringBuilder();
        StringBuilder anag2 = new StringBuilder();

        //* Remove whitespaces, or any other characters
        //* anag1
        for (int i = 0; i < firstString.length(); i++){
            char character = firstString.charAt(i);
            if (Character.isLetter(character)){
                anag1.append(character);
            }
        }


        //* anag2
        for (int i = 0; i < secondString.length(); i++){
            char character = secondString.charAt(i);
            if (Character.isLetter(character)){
                anag2.append(character);
            }
        }

        char[] anag1Array = anag1.toString().toCharArray();
        Arrays.sort(anag1Array);
        StringBuilder anag1Updated = new StringBuilder(String.valueOf(anag1Array));
        System.out.println("Check anag1Updated: " + anag1Updated);
        char[] anag2Array = anag2.toString().toCharArray();
        Arrays.sort(anag2Array);
        StringBuilder anag2Updated = new StringBuilder(String.valueOf(anag2Array));
        System.out.println("Check anag2Updated: " + anag2Updated);

        return anag1Updated.toString().equals(anag2Updated.toString());

        /*
        for (int i = 0; i < anag1Updated.length(); i++){
            if (anag1Updated.charAt(i) != anag2Updated.charAt(i)){
                return false;
            }
        }
        return true;
         */
    }

    public static void main(String[] args) {
        String firstString = "The Eyes";
        String secondString = "They see!";

        boolean isAnagram = anagramsSolver(firstString.toLowerCase(), secondString.toLowerCase());
        System.out.println("Are the strings " + firstString + " & " + secondString + " anagrams?\n" + isAnagram);
    }
}
