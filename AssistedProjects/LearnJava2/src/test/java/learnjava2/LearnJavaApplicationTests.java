package learnjava2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LearnJavaApplicationTests 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void TestHttpsGetRequest()
    {
       HttpExample example = HttpExample();
       example.doGet();
    }

    @Test
    public void TestHttpPostRequest() {
        HttpExample example = HttpExample();
        example.doPost();
    }
}
