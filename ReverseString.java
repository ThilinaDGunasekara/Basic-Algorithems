package tk.thilinadgunasekara.algorithems;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter String For Reverse:");
        String text = input.next();
        String reverse = "";

        for (int i = text.length()-1; i >=0 ; i--) {
            reverse += text.charAt(i);
        }

        System.out.println("Need Reverse : "+ text);
        System.out.println(" Reverse text: "+ reverse);
    }
}
