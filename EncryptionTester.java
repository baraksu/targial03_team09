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
    public void testAdd(){
        
        int result = Encryption.wordsNum("word1 word2");
        assertEquals(2,result);

        boolean bool = Encryption.checkNum(3);
        assertEquals(bool, true);

        String str = Encryption.encryption("very cool", 2);
        assertEquals(str, "ryc00l v#");

        str = Encryption.decryption("ryc00l v#", 2);
        assertEquals("very cool", str);
    }
}
