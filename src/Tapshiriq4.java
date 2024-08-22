import java.util.Scanner;
public class Tapshiriq4 {
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
        int deduction = Math.abs(LengthOfFirst-LengthOfSecond);
        int result =  (int) Math.pow(MaxLength,deduction);
        System.out.println(result);
        sc.close();
    }
}
//•	Her hansi 2 cumle klaviaturadan daxil edilecek.
// Bu cumlelerin uzunluqlari ferqinin modulunu tapib,uzunlugu boyuk olani ,
// ferqin modulu qeder quvvete yukseltmek teleb olunur.