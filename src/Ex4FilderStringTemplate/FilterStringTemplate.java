package Ex4FilderStringTemplate;

import javax.imageio.ImageTranscoder;
import javax.print.attribute.standard.PresentationDirection;
import java.util.Arrays;
import java.util.Scanner;

public class FilterStringTemplate {
    public static String[] writeWords(){
        Scanner scan = new Scanner(System.in);
        String stopKeyWord = "stop";

        int initCapacity = 2;
        String[] wordsArray = new String[initCapacity];
        int numberOFElements = 0;

        String word = scan.next();
        while (!word.equalsIgnoreCase(stopKeyWord)){
            wordsArray[numberOFElements] = word;
            numberOFElements++;

            if (numberOFElements == wordsArray.length){
                wordsArray = Arrays.copyOf(wordsArray, 2 * wordsArray.length);
            }

            word = scan.next();
        }

        return Arrays.copyOf(wordsArray, numberOFElements);
    }


    public static String[] selectiveFilter(String[] wordsArray, String key, int matchKey) {
        StringBuilder keyBuilder = new StringBuilder(key.toLowerCase());

        int initCapacity = 2;
        String[] result = new String[initCapacity];
        int numberOfElements = 0;

        int dimension = 0;
        int counter = 0;
        for (int i = 0; i < wordsArray.length; i++) {
            if (key.length() >= wordsArray[i].length()) {
                dimension = wordsArray[i].length();
            } else {
                dimension = keyBuilder.length();
            }

            String currentWord = wordsArray[i].toLowerCase();
            counter = 0;
            for (int j = 0; j < dimension; j++) {
                if (currentWord.charAt(j) == keyBuilder.charAt(j)) {
                    counter++;
                }
            }

            if (counter >= matchKey) {
                result[numberOfElements] = wordsArray[i];
                numberOfElements++;

                if (numberOfElements == result.length) {
                    result = Arrays.copyOf(result, 2 * result.length);
                }
            }
        }

        return Arrays.copyOf(result, numberOfElements);
    }


    public static void displayArray(String[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " | ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] wordsArray = writeWords();
        displayArray(wordsArray);
        System.out.println();

        String key = scan.next();
        System.out.print("The key: " + key + "\n");

        int matchKey = scan.nextInt();
        if (matchKey > 0) {
            System.out.print("The match key: " + matchKey + "\n");
        }else {
            System.out.println("The match key is not valid!");
        }

        String[] result;
        result = selectiveFilter(wordsArray, key, matchKey);
        displayArray(result);



    }
}
