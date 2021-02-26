package learnjava2;

import learnjava2.jdbc.JDBCExample;
import org.junit.Test;

public class JDBCTests {

    @Test
    public void TestConnection()
    {
        JDBCExample example = new JDBCExample();
        example.TestConnection();
    }

    @Test
    public void TestSelect() {
        JDBCExample example = new JDBCExample();
        example.TestSelect();
    }

    @Test
    public void TestCreate()  {
        JDBCExample example = new JDBCExample();
        example.TestCreate();    
    }   
}