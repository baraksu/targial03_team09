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
    }
    //אוהד חסון + קצת תיקונים(יואב פנסקי)
    public static int wordsNum(String string){
        int num1 = string.indexOf(" ");
        int num2 = string.lastIndexOf(" ");
        if (num1 == -1)
            return 1;
        else if (num1 == num2)
            return 2;
        else
            return 3;
    }
    //תוכנה לבדיקה האם המספר שהוכנס הוא 1 או 2
    //ע"י יואב פנסקי
    public static boolean checkNum(int num) {
        if (num != 1 && num != 2) {
            System.out.println(num + "is not a valid choice");
            return true;
        } else return false;
    }
}