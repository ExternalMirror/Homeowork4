import java.util.Scanner;
public class Task57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String s3 = text.trim();
        String[] s1 = s3.split(" ");
        int Start = 0, EndIndex = 0, End = 0;
        String s2 = null;
        if (s1.length >2){
            for (int i =0; i <= s1.length;i++){
                Start = s1[0].length();
                EndIndex = s1[s1.length-1].length();
                s2 = s3.substring(Start, End);
            }
        }else {
            System.out.println("Enter more than 2 word");
            return;
        }
        System.out.println(s2);
    }
}
//Verilmiş mətndə sözlər boşluq(probel) simvolu ilə ayrılıb. İlk və son sözü silməli

// string s = "sama dayi baci"
// text  = s.substring(s.indexOf(" "),s.lastIndexOf(" "))

//bunu isded bunun evezine