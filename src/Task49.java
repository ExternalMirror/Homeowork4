import java.util.Scanner;
public class Task49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        int count=0;
        Character letter = 'B';
        int length = text.length();
        for (int i = length -1 ; i>=length-15;i--){
            if(letter.equals(text.charAt(i))){
                count++;
            }
        }
        if (count > 0){
            System.out.println("Yes, There are B symbols");
            System.out.println("Amount of B symbols from last 15 symbols are "+count);
        }else {
            System.out.println("No, There is no B symbol");
            return;
        }
        sc.close();
    }
}
//substring ele axir 15 tapmaga, loop isletme
//Verilmiş mətndə son 15 simvolun daxilində 'B' simvolu varmı?