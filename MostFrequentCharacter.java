package tk.thilinadgunasekara.algorithems;

import java.util.Scanner;

public class MostFrequentCharacter {
    static final int ASCII_Size = 256;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text = input.next();

        System.out.println(mostFrequentCharacter(text));
    }

    static char mostFrequentCharacter(String text){

        int []count = new int[ASCII_Size];

        int max = -1;
        char chr = ' ';

        int length = text.length();
        for (int i = 0; i <length ; i++) {
            count[text.charAt(i)]++;
        }

        for (int i = 0; i <length ; i++) {
            if(max<count[text.charAt(i)]){
                max=count[text.charAt(i)];
                chr = text.charAt(i);
            }count[text.charAt(i)]++;
        }
        return chr;
    }
}


