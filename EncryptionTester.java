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
        
        int result = encryption.wordsNum("word1 word2");
        assertEquals(2,result);

        boolean bool = encription.chekNum(3);
        assertEquals(bool, true);

        String str = encription.encriptipon("very cool", 2);
        assertEquals(str, "ryc00l v#");

        str = encrption.decription("ryc00l v#", 2);
        assertEquls("very cool");
    }
    
}
