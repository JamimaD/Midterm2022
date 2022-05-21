package math.problems;

import org.junit.Assert;
import org.junit.Test;

//Apply Unit testing into each classes and methods in this package.

public class UnitTestingMath {

    @Test
    public void test1() {
        int actual = 5;
        int expected = 5;

    Assert.assertEquals(expected,actual);
    }

    @Test
    public void test2() {
        int actual = 10;
        int expected = 9;

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3() {
        int actual = 7;
        int expected = 7;

        Assert.assertEquals(expected, actual);
    }
}
