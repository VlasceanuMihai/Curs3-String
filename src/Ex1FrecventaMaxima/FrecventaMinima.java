package Ex1FrecventaMaxima;

public class FrecventaMinima {
    public static void minFrequency(String string){
        string = string.toLowerCase();
        int min = Integer.MAX_VALUE;
        int counterMin;

        for (int i = 0; i < string.length(); i++){
            char character = string.charAt(i);

            if (Character.isWhitespace(character) || string.indexOf(string.charAt(i)) != i){
                continue;
            }

            counterMin = 1;
            for (int j = i + 1; j < string.length(); j++){
                if (character == string.charAt(j) || string.indexOf(character) != i){
                    counterMin++;
                }
            }

            if (counterMin < min){
                min = counterMin;
            }
        }

        for (int i = 0; i < string.length(); i++){
            char character = string.charAt(i);

            if (Character.isWhitespace(character)){
                continue;
            }

            counterMin = 1;
            for (int j = i + 1; j < string.length(); j++){
                if (character == string.charAt(j) || string.indexOf(character) != i){
                    counterMin++;
                }
            }

            if (counterMin == min){
                System.out.println("Character " + character + " appears " + min + " times.");
            }
        }
    }

    public static void main(String[] args) {
        String string = "Simple sentence.";
        minFrequency(string);
    }
}
