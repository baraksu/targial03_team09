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
        int chose = reader.nextInt();
        System.out.println("enter the string")
        String str = reader.nextLine();
    }
    //אוהד חסון
    public static int wordsNum(string){
        int wordsNum = 0;
        int num1 = string.indexOf(" ");
        int num2 = String.lastIndexOf(" ");
        if (num1 == -1)
            return 1;
        else if (num1 == num2)
            return 2;
        else
            return 3;
    }

}
