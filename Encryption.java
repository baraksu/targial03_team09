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
        int a = reader.nextInt();
        int b = reader.nextInt();
        add(a,b);
    }
    public static int add (int a, int b){
        return a+b;
    }
}
