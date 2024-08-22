import java.util.Scanner;
public class Task52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        int length = text.length();
        System.out.println(text.substring(length-1).toLowerCase() + text.substring(0,length-2).toUpperCase());
    }
}
//Verilmiş mətndə son simvoldan başqa yerdə qalan simvolları böyük formada çap etməli