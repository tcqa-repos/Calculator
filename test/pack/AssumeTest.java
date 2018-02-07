package pack;

import junit.framework.TestCase;
import static org.junit.Assume.*;

public class AssumeTest extends TestCase {

	public AssumeTest(String testName) {
		super(testName);
	}

    public void testAgentName_notAssume() {
        String OS = System.getProperty("os.name").toLowerCase();
        assertEquals(OS.indexOf("win"), 0);
    }

    public void test_assumeTrue() {
	    int sum = Calculation.add(2, 2);
	    assumeTrue( sum == 4);
	    assertEquals(sum,4);
    }

    public void test_assumeWrong() {
        int sum = Calculation.add(2, 2);
        assumeTrue( sum == 5);
        assertEquals(sum,4);
    }

    public void test_assumeWrong_assertWrong() {
        int sum = Calculation.add(2, 2);
        assumeTrue( sum == 5);
        assertEquals(sum,5);
    }


}
