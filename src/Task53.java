import java.util.Scanner;
public class Task53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        int length = text.length();
        char FirstLetter = text.charAt(0);
        char LastLetter = text.charAt(length-1);
        char LetterA = 'A';
        char LetterB = 'B';
        String NewText = text.replace('A',FirstLetter).replace('B',LastLetter);
        System.out.println(NewText);
    }
}
//Verilmiş mətndəki bütün 'A' simvollarını ilk ve 'B' simvollarını isə son simvol ilə əvəz etməli