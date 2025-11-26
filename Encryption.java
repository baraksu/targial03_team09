/**
 * Write a description of class Encryption here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
//תוכנה ראשית
//ע"י יואב פנסקי ואוהד חסון
public class Encryption
{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to the Encryption / Decryption Program");
        System.out.println("Enter 1 for Encrypt | 2 for Decrypt");

        int programNum = reader.nextInt();
        if (Encryption.checkNum(programNum)) return;

        reader.nextLine();
        System.out.println("Enter up to 3 words sentence");
        String sentence = reader.nextLine();
        
        int words = countChar(sentence) + 1;

        if (words > 3) {
            System.out.println(sentence + "is not a valid choice");
            reader.close();
            return;
        }
        if (programNum == 1) {
            System.out.println("The encrypted sentence is: " + Encryption(sentence, words));
            reader.close();
            return;
        } else {
            System.out.println("The decrypted sentence is: " + Decryption(sentence, words));
        }
        reader.close();
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
    //תוכנה להצפנת
    //ע"י יואב פנסקי
    public static String Encryption(String sentence, int words) {
        char c = sentence.charAt(sentence.length() - words);
        String result = c + sentence.substring(0, sentence.length() - words);
        result = result.replace('a', '@');
        result = result.replace('e', '#');
        result = result.replace('i', '1');
        result = result.replace('o', '0');
        result = result.replace('u', '&');
        return result;
    }
    //תוכנה לפענוח
    //ע"י יואב פנסקי
    public static String Decryption(String sentence, int words) {
        char c = sentence.charAt(0);
        String result = sentence.substring(1) + c;
        result = result.replace('@', 'a');
        result = result.replace('#', 'e');
        result = result.replace('1', 'i');
        result = result.replace('0', 'o');
        result = result.replace('&', 'u');
        return result;
    }
}
