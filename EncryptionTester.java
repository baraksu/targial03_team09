import static org.junit.Assert.*;
import org.junit.Test;

// :)
/**
 * Write a description of class EncryptionTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EncryptionTester
{
    @Test
    public void testWordsNum(){
        
        int result = Encryption.wordsNum("word1 word2");
        assertEquals(2,result);
        
        result = Encryption.wordsNum("word1 word2 word3");
        assertEquals(3,result);
        
        result = Encryption.wordsNum("word1");
        assertEquals(1,result);
        
        result = Encryption.wordsNum("I'm boared");
        assertEquals(2,result);
        
        result = Encryption.wordsNum("hi");
        assertEquals(1,result);
    }
 @Test
    public void testdecryption(){
        String str = Encryption.decryption("t#rsc1#nc# b#tt#r c0mp&", 3);
        assertEquals("better computer science", str);
        
        str = Encryption.decryption("ryc00l v#", 2);
        assertEquals("very cool", str);
        
        str = Encryption.decryption("'mb0@r#d I", 2);
        assertEquals("I'm boared", str);
        
        str = Encryption.decryption("1h", 1);
        assertEquals("hi", str);
        
        str = Encryption.decryption("db1r", 1);
        assertEquals("bird", str);}
     @Test
    public void testEncrypcion(){
    str = Encryption.encryption("better computer science", 3);
        assertEquals(str, "t#rsc1#nc# b#tt#r c0mp&");
        
        str = Encryption.encryption("very cool", 2);
        assertEquals(str, "ryc00l v#");
        
        str = Encryption.encryption("I'm boared", 2);
        assertEquals(str, "'mb0@r#d I");
        
        str = Encryption.encryption("hi", 1);
        assertEquals(str, "1h");
        
        str = Encryption.encryption("bird", 1);
        assertEquals(str, "db1r");}
    @Test
    public void testCeckNum(){        
        boolean bool = Encryption.checkNum(1);
        assertEquals(bool, false);
        
        bool = Encryption.checkNum(2);
        assertEquals(bool, false);
        
        bool = Encryption.checkNum(3);
        assertEquals(bool, true);
        
        bool = Encryption.checkNum(4);
        assertEquals(bool, true);
        
        bool = Encryption.checkNum(5);
        assertEquals(bool, true);}
}
