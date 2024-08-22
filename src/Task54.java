import java.util.Scanner;
public class Task54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        int length = text.length();
        int count = 0;
        for (int  i=0;i<length-1;i++){
            if (text.charAt(i)>='0'&&text.charAt(i)<='9') {
                count++;
            }
        }
        System.out.println("There are "+count+" numbers in text");
    }
}
//Verilmiş mətndəki bütün rəqəmlərin sayını tapmalı