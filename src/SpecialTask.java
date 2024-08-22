import java.util.Scanner;
public class SpecialTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        int length = text.length();
        for (int i = 0;i<length;i++){
            char GetSymbol = text.charAt(i);
            if (GetSymbol >= 65 && GetSymbol <= 90){
                System.out.print((char) (GetSymbol + 32));
            } else if (GetSymbol >= 97 && GetSymbol <= 122) {
                System.out.print((char) (GetSymbol - 32));
            }else {
                System.out.print(GetSymbol);
            }
        }
        sc.close();
    }
}
//it doesn't work with o letter for some reason, fix it

//daxil edilmis setirde, boyuk herferi kici, kicik herfleri boyuk yaz
//hazir method istifade eleme
//        for (int i ='A';i<='Z';i++){
//                System.out.print(i+" ");
//                }
//                System.out.println("");
//                for (int i = 'a';i<='z';i++){
//                System.out.print(i+" ");
//                }
