package task02;

public class Main {
    public static void main(String[] args) {

       final String[] strings = {"HTTPS", "yOu", "IP", "DNS"};

        //================================================================

        String firstWord = strings[0];
        String tempWord;
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (CountUpperLetters(strings[i]) > CountUpperLetters(strings[j])) {
                    tempWord = strings[i];
                    strings[i] = strings[j];
                    strings[j] = tempWord;
                }
            }
        }
        for (String s : strings) {
            System.out.println(s);
        }
    }

    public static int CountUpperLetters(final String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }
}
