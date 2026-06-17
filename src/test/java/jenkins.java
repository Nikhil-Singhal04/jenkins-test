import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class jenkins {

    @Test
    public void testLogin() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        System.out.println(driver.getTitle());

        // Force failure for demo
        Assert.assertEquals(driver.getTitle(), "Google");

        driver.quit();
    }
}