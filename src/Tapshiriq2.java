import java.util.Scanner;
import java.util.Random;
public class Tapshiriq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.print("Enter amount of letter of words: ");
        int LetterNumber = sc.nextInt();
        System.out.print("Enter amount of words in text: ");
        int WordNumber = sc.nextInt();
        int length = text.length();
        for (int  i = 0;i<WordNumber;i++){
            StringBuilder GeneratedWord = new StringBuilder();
            for (int j = 0;j<LetterNumber;j++){
                int RandomLetter;
                char symbol;
                do {
                    RandomLetter = r.nextInt(length);
                    symbol = text.charAt(RandomLetter);
                }while (symbol==' ');

                GeneratedWord.append(symbol); //just changed += with this if I fixed yellow error
            }
            System.out.println(GeneratedWord);
        }
        sc.close();

    }
}
//•	"Men Adnada tehsil aliram,komputerle mesgul oluram.
// " Cumlesinden herfler goturerek soz duzelt .Herfler ixtiyari goturulecek ve ixtiyari soz alina biler.
// n herfli m soz

//        String result = "";
//        for (int i = 0; i< text.length();i++){
//            int index = r.nextInt(text.length());
//
//            result += result + text.charAt(index);
//        }
//        System.out.println(result);
//        sc.close();