/**
 * Encryption & Decryption Program
 *
 * @author Yoav Panski (219338951)and Ohad Hasson(217803477)
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
        if (checkNum(programNum)) {
            return;
        }
        reader.nextLine();
        System.out.println("Enter up to 3 words sentence");
        String sentence = reader.nextLine();
        int words = wordsNum(sentence);

        if (words > 3) {
            System.out.println(sentence + "is not a valid choice");
            return;
        }
        if (programNum == 1) {
            System.out.println("The encrypted sentence: " + Encryption(sentence, words));
            return;
        } else {
            System.out.println("The decrypted sentence: " + Decryption(sentence, words));
        }
    }
    // יואב פנסקי
    public static int wordsNum(String str) {
        int withSpace = str.length();
        str = str.replace(" ", "");
        int withoutspace = str.length();
        int count = withSpace - withoutspace - 1;
        return count;
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
    //ע"י יואב פנסקי ואוהד חסון
    public static String Encryption(String sentence, int words) {
        String word1 = "";
        String word2 = "";
        String word3 = "";
        String result = "";
        if (words == 1)
            result = sentence;
        else if (words == 2){
            word1 = sentence.substring(0, sentence.indexOf(" "));
            word2 = sentence.substring(sentence.indexOf(" ")+1);
            result = word2 + ' ' + word1;
        } else {
            word1 = sentence.substring(0, sentence.indexOf(" "));
            word2 = sentence.substring(sentence.indexOf(" ")+1, sentence.lastIndexOf(" "));
            word3 = sentence.substring(sentence.lastIndexOf(" ")+1);
            result = word3 + ' ' + word1 + ' ' + word2;
        }
        
        String c = result.substring(result.length() - words);
        result = result.substring(0, result.length() - words);
        result = c + result;
        result = result.replace('a', '@');
        result = result.replace('e', '#');
        result = result.replace('i', '1');
        result = result.replace('o', '0');
        result = result.replace('u', '&');
        return result;
    }
    //תוכנה לפענוח
    //ע"י יואב פנסקי ואהד חסון
    public static String Decryption(String sentence, int words) {
        String result = sentence.replace('@', 'a');
        result = result.replace('#', 'e');
        result = result.replace('1', 'i');
        result = result.replace('0', 'o');
        result = result.replace('&', 'u');

        String c = result.substring(0, words);
        result = result.substring(words) + c;
        
        String word1 = "";
        String word2 = "";
        String word3 = "";
        if (words == 1){}
        else if (words == 2) {
            word1 = result.substring(0, result.indexOf(" "));
            word2 = result.substring(result.indexOf(" ") + 1);
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
