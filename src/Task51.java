import java.util.Scanner;
public class Task51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.println(text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase());
    }
}
//Verilmiş mətndə ilk simvoldan başqa yerdə qalan simvolları kiçik formada çap etməli