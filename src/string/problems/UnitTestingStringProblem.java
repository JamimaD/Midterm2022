package string.problems;

import org.junit.Assert;
import org.junit.Test;

public class UnitTestingStringProblem {

        //Apply Unit Test into all the methods in this package.

        @Test
        public void test1() {
            String actual = "Hello D";
            String expected = "Hello C";

            Assert.assertEquals(expected,actual);
        }

    @Test
    public void test2() {
        String actual = "Hello D";
        String expected = "Hello D";

        Assert.assertEquals(expected,actual);
    }

}

