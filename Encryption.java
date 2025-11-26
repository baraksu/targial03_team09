/**
 * Write a description of class Encryption here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Encryption
{
    public static void main(String[] args){
       Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to the Encryption / Decryption Program");
        System.out.println("Enter 1 for Encrypt | 2 for Decrypt");

        int programNum = reader.nextInt();
        reader.close();
        if (Encryption.checkNum(programNum)) return;

        System.out.println("Enter up to 3 words sentence");
        String sentence = reader.next();
        int words = countChar(sentence) + 1;
        if (words > 3) {
            System.out.println(sentence + "is not a valid choice");
            return;
        }
        if (words == 1) EncryptionOneWord(sentence);
        else if (words == 2) EncryptionTwoWords(sentence);
        else EncryptionThreeWords(sentence);
    }
    // יואב פנסקי
     public static int countChar(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
    //תוכנה לבדיקה האם המספר שהוכנס הוא 1 או 2
    //ע"י יואב פנסקי
    public static boolean checkNum(int num) {
        if (num != 1 && num != 2) {
            System.out.println(num + "is not a valid choice");
            return true;
        } else return false;
    }
    //תוכנה להצפנת מילה אחת
    //ע"י יואב פנסקי
    public static String EncryptionOneWord(String sentence){
        last letter = sentence.charAt(sentence.length() - 1);
        String result = sentence.substring(1, sentence.length() - 1) + sentence.charAt(0);
        return result;
    }
}
