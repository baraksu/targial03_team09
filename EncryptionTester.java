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
        
        String result = Encryption.wordsNum("word1 word2");
        assertEquals(2,result);
        
    }
    
}
