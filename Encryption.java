/**
 * Write a description of class Encryption here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Encryption
{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to the Encryption / Decryption Program");
        System.out.println("Enter 1 for Encrypt | 2 for Decrypt");

        int programNum = reader.nextInt();

        System.out.println("Enter")
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
}