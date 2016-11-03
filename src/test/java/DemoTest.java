import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.Assert;
import org.junit.Test;

public class DemoTest {

    @Data
    @AllArgsConstructor
    class LombokTestPojo {
        private String text;
    }

    @Test
    public void oneMustBeEqualOne() {
        Assert.assertEquals(1, 1);
    }

    @Test
    public void lombokMustGenerateMethods() {
        final String someContent = "someContent";
        LombokTestPojo l = new LombokTestPojo(someContent);
        Assert.assertEquals(someContent, l.getText());
    }
}
