package tk.thilinadgunasekara.algorithems;

import java.util.Scanner;

public class SearchVowelCount {

    static final int ASCII_SIZE = 256;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Something : ");
        String text = input.next();

        vowel(text);
    }

    static void vowel(String text){

        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;
        int totalCount = 0;

        for (int i = 0; i <text.length() ; i++) {
            char ch = text.charAt(i);

            if(ch == 'A' ||'a'==ch){
                countA++;
            }
            if('E'==ch||'e'==ch){
                countE++;
            }
            if('I'==ch||'i'==ch){
                countI++;
            }
            if('O'==ch||'o'==ch){
                countO++;
            }
            if('U'==ch||'u'==ch){
                countU++;
            }
        }


            System.out.println("A :"+countA);
            System.out.println("E :"+countE);
            System.out.println("I :"+countI);
            System.out.println("O :"+countO);
            System.out.println("U :"+countU);

            totalCount = countA+countE+countI+countO+countU;

        System.out.println("Total vowel count : "+ totalCount);
        }

}
