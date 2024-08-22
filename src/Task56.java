import java.util.Scanner;
public class Task56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        int max = 0, min = 0;
        String[] word = text.trim().split(" ");
        max = word[0].length();
        min = word[0].length();
        String MaxWord = word[0];
        String MinWord = word[0];
        for (int i = 0; i< word.length;i++){
            if (word[i].length()>max){
                max = word[i].length();
                MaxWord = word[i];
            }
            if (word[i].length()<min){
                min = word[i].length();
                MinWord = word[i];
            }
        }
        System.out.println("Max Length is "+MaxWord);
    }
}
//Verilmiş mətndə sözlər boşluq(probel) simvolu ilə ayrılıb. Ən uzun və ən qısa sözü tapmalı


//    int Start = 0;
//        int EmptySpace = text.indexOf(' ');
//        int length = text.length();
//        for (int i=0;i<length;i++){
//            String word = text.substring(Start,EmptySpace);
//            System.out.println(word);
//            Start = EmptySpace+1;
//            EmptySpace = text.indexOf(' ',Start);
//        }
//        if (Start < length) {
//            String lastWord = text.substring(Start);
//            System.out.println(lastWord);
//        }