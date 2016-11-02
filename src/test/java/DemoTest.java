import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

    @Test
    public void oneMustBeEqualOne() {
        Assert.assertEquals(1, 1);
    }
}
