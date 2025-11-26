/**
 * Encryption & Decryption Program
 *
 * @author Yoav Panski and Ohad Hasson
 * @version 26/11/2025 17:00
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
        if (Encryption.checkNum(programNum)) reader.close(); return;

        reader.nextLine();
        System.out.println("Enter up to 3 words sentence");
        String sentence = reader.nextLine();
        
        int words = wordsNum(sentence);

        if (words > 3) {
            System.out.println(sentence + "is not a valid choice");
            reader.close();
            return;
        }
        if (programNum == 1) {
            System.out.println("The encrypted sentence: " + Encryption(sentence, words));
            reader.close();
            return;
        } else {
            System.out.println("The decrypted sentence: " + Decryption(sentence, words));
        }
        reader.close();
    }
    // יואב פנסקי
     public static int wordsNum(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        count++;
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
        int word1 = 0;
        int word2 = 0;
        int word3 = 0;
        String result = "";
        if (words = 2) {
            word1 = sentence.substring(0, sentence.indexOf(" "));
            word2 = sentence.substring(sentence.indexOf(" ") + 1, sentence.lastIndexOf(" "));
            result = word2 + ' ' + word1;
        } else {
            word1 = sentence.substring(0, sentence.indexOf(" "));
            word2 = sentence.substring(sentence.indexOf(" ") + 1, sentence.lastIndexOf(" "));
            word3 = sentence.substring(sentence.lastIndexOf(" ") + 1);
            result = word3 + ' ' + word1 + ' ' + word2;
        }
       
        char c = sentence.charAt(sentence.length() - words);
        result = c + sentence.substring(0, sentence.length() - words);
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
        String result = sentence.replace('@', 'a');
        result = result.replace('#', 'e');
        result = result.replace('1', 'i');
        result = result.replace('0', 'o');
        result = result.replace('&', 'u');

        char c = result.charAt(0);
        result = result.substring(1) + c;

        int word1 = 0;
        int word2 = 0;
        int word3 = 0;
        if (words == 2) {
            word1 = result.substring(0, result.indexOf(" "));
            word2 = result.substring(result.indexOf(" ") + 1, result.lastIndexOf(" "));
            result = word2 + ' ' + word1;
        } else {
            word1 = result.substring(0, result.indexOf(" "));
            word2 = result.substring(result.indexOf(" ") + 1, result.lastIndexOf(" "));
            word3 = result.substring(result.lastIndexOf(" ") + 1);
            result = word2 + ' ' + word3 + ' ' + word1;
        }
        return result;
    }
}
