import org.testng.Assert;
import org.testng.annotations.Test;

public class Lesson1_firstTest {
    @Test
    public void test1 () {
        Assert.assertEquals(getValue (45),"S");
    }
    @Test
    public void test2 () {
        Assert.assertNotEquals(getValue (42), "S");
    }
    @Test
    public void test3 () {
        Assert.assertEquals(getValue (40),"M");
    }
    @Test
    public void test4 () {
        Assert.assertNotEquals(getValue (36), "M");
    }
    @Test
    public void test5 () {
        Assert.assertEquals(getValue (33),"T");
    }
    @Test
    public void test6 () {
        Assert.assertNotEquals(getValue (2), "T");
    }
    @Test
    public void test7 () {
        Assert.assertEquals(getValue (24), "F");
    }

    private String getValue (int value) {
        if (value%15 == 0) {
            return "S";
        } else if (value%5==0) {
            return "M";
        } else if (value%3==0) {
            return "T";
        } return "F";
    }
}
