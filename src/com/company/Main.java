package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*char letter = 'A';
        int number = letterToNumber(letter);
        System.out.printf("Bogstavet %c bliver til %d", letter, number);*/

        /*String plaintext = "ABEKAT";*/
        /*int[] cipher = textToListOfNumbers(plaintext);*/
        /*System.out.println(Arrays.toString(cipher));*/
        int number = 5;
        char letter = numberToLetter(number);
        System.out.printf("Tallet %d bliver til bogstavet %c\n", number, letter);

        int[] cipher = {1, 2, 3, 4, 5, 6,};
        String plaintext = listOfNumbersToText(cipher);
        System.out.println("Den virker: ");
        System.out.println(plaintext);
    }

    public static int[] textToListOfNumbers(String text){
        int[] numbers = new int[text.length()];
        char[] letters = text.toCharArray();

        for(int i=0; i < letters.length; i++){
            numbers[i] = letterToNumber(letters[i] );

        }

        return numbers;
    }

    public static String listOfNumbersToText(int[] numbers){
        String text = "";
        for (int i=0; i < numbers.length; i++){
            int number = numbers[i];

            char letter = numberToLetter(number);

            text = text + letter;
        }
        return text;

    }

    public static int letterToNumber(char letter) {
        /*   char[] alfabet = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'S', 'T', 'U', 'V', 'W', 'X', 'Z', 'Æ', 'Ø', 'Å'};
        int[] numre = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27,};

        int nummer = 0;
        for (int i = 0; i < alfabet.length; i++) {
            char bogstavetViTjekker = alfabet[i];
            if (letter == bogstavetViTjekker) {
                System.out.printf("Fundet bogstav %c på index %d ", bogstavetViTjekker, i);
                nummer = i;
                //nummer = numre[i];
                System.out.printf("og det har nummer: %d\n", nummer);
            }
        }
        */
        String alfabetet = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";
                int num = alfabetet.indexOf( letter );

        return num;
    }

    public static char numberToLetter(int number){
        String alfabetet = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";
        char letter = alfabetet.charAt(number);

        return letter;
    }
}


