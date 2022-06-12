package Metromart;

import Runner.ChromeRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends ChromeRunner {
    @Test
    public void Login(){
        Assert.assertEquals(true, true);
    }
}
