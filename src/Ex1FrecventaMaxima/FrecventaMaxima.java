package Ex1FrecventaMaxima;

public class FrecventaMaxima {
    public static void maxFreq(String string){
        StringBuilder stringBuilder = new StringBuilder(string.toLowerCase());

        int counter;
        int max = 0;

        for (int i = 0; i < stringBuilder.length(); i++){
            char character = stringBuilder.charAt(i);

            if (Character.isWhitespace(character)){
                continue;
            }

            counter = 1;
            for (int j = i + 1; j < stringBuilder.length(); j++){
                if (character == stringBuilder.charAt(j)){
                    counter++;
                }
            }

            if (counter > max){
                max = counter;
            }
        }

        for (int i = 0; i < stringBuilder.length(); i++){
            char character = stringBuilder.charAt(i);

            if (Character.isWhitespace(character)){
                continue;
            }

            counter = 1;
            for (int j = i + 1; j < stringBuilder.length(); j++){
                if (character == stringBuilder.charAt(j)){
                    counter++;
                }
            }

            if (counter == max){
                System.out.println("Character " + character + " appears " + max + " times.");
            }
        }
    }

    public static void main(String[] args) {
        String string = "Becoming a programmer is like gaining super powers!";
        maxFreq(string);
    }
}
