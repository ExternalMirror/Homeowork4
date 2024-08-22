import java.util.Scanner;
public class Task58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        boolean check = false;
        String[] s1 = text.trim().split(" ");
        for (int i = 0; i< s1.length;i++){
            if (s1[i].charAt(0) == s1[i].charAt(s1[i].length() - 1)){
                System.out.println(s1[i]);
                check = true;
            }
        }
        if (!check){
            System.out.println("Condition can't be written");
        }
    }
}
//Verilmiş mətndə sözlər boşluq(probel) simvolu ilə ayrılıb. İlk və son simvolu eyni olan sözləri tapmalı