import java.util.Scanner;
public class Tapshiriq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();
        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();
        int LengthOfFirst = text1.length();
        int LengthOfSecond = text2.length();
        int MaxLength = Math.max(LengthOfFirst,LengthOfSecond);
        System.out.println("Length of first text is "+LengthOfFirst);
        System.out.println("Length of second text is "+LengthOfSecond);
        if (LengthOfFirst>LengthOfSecond){
            System.out.println("Longest text is "+LengthOfFirst);
        } else if (LengthOfFirst<LengthOfSecond) {
            System.out.println("Longest text is "+LengthOfSecond);
        }else {
            System.out.println("Their length is the same");
        }
        sc.close();
    }
}

//•	"komputerle mesgul oluram."
// Ve "Men Adnada tehsil aliram," cumlelerinin uzunluqlarini muqayise ele ve uzunlugu max olani cap et