import org.junit.Assert;
import org.junit.Test;

public class ReversedStringTests {


    @Test
    public void reverseStringWithNull(){
        Assert.assertNull(ReverseString.reverseString(null));
        System.out.println("reverseStringWithNull passed");

    }

    @Test
    public void reverseWithDigits(){
        Assert.assertEquals("random", ReverseString.reverseString("Abc123"));
        System.out.println("reverseWithDigits passed");
    }

    @Test
    public void reverseTestHappyPath(){
        Assert.assertEquals("elppa", ReverseString.reverseString("apple"));
        System.out.println("ReverseTestHappyPath test added");
    }
}
