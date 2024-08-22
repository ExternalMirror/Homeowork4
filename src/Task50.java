import java.util.Scanner;
public class Task50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        int length = text.length();
        if (length<=1){
            System.out.println("Text should have minimum 2 symbol");
            return;
        }
        char FirstLetter = text.charAt(0);
        char LastLetter = text.charAt(length-1);
        String Middle = text.substring(1,length-2);
        String NewText = LastLetter+Middle+FirstLetter;
        System.out.println(NewText);
    }
}
//Verilmiş mətndə son simvol ile ilk simvolun yerini dəyişməli