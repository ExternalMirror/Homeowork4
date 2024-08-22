import java.sql.SQLOutput;
import java.util.Scanner;
public class Task48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        int count=0;
        int length = text.length();
        Character letter = 'A';
        for (int i = 0; i<length;i++){
            if(letter.equals(text.charAt(i))){
                count++;
            }
        }
        int result = length - count;
        System.out.println("There is total of "+length+"symbols");
        System.out.println("Amount of A letter in here is "+ count);
        System.out.println("So excluding A letter, Amount of symbols are "+result);
        sc.close();
    }
}
// Verilmiş mətndə 'A'-dan fərqli neçə simvol var?
// find a way to make it like it also works with words as well