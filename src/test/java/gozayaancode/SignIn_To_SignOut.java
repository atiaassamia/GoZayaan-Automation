package gozayaancode;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;


import static java.lang.Thread.sleep;


public class SignIn_To_SignOut {

    public static WebDriver driver = null;


    @Test
    public WebElement initialize() throws InterruptedException {



        WebDriverManager.chromedriver().setup();
        System.out.println("Static method");
        // System.setProperty("webDriver.chrome.driver", "src/main/resources/Resources/chromedriver.exe");
        // Create Driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.gozayaan.com");
        System.out.println("Page is opened.");

        // Sleep for 3 seconds

        sleep(3000);

        // ********* Click SignIn button *********

        System.out.println("sign in button");
        WebElement SigninButton = driver.findElement(By.cssSelector(".btn.btn-primary"));

        System.out.println("yes i got it");

        SigninButton.click();

        sleep(3000);

        // ********* Sign Up *********

        WebElement SignupBtn = driver.findElement(By.cssSelector(".suggestions .text-primary"));
        SignupBtn.click();

//********* Enter Email *********

        WebElement Email = driver.findElement(By.id("email"));
        Email.sendKeys("atia.as.samia49@gmai.com");

        //********* Enter Mobile Number *********


        WebElement MobileNumber = driver.findElement(By.cssSelector(".custom-phone-input.vue-tel-input > .phone-input.vti__input"));
        MobileNumber.sendKeys("01984316651");

        //********* Enter Password *********

        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("Atia@049");

        //********* Final Signup *********

        WebElement FinalSignup = driver.findElement(By.id("submitBtn"));
        FinalSignup.click();


//********* Login *********

        System.out.println("It's login Time....!!!!!");
        WebElement Login = driver.findElement(By.cssSelector("p > span"));
        Login.click();

//********* Enter Email *********

       WebElement UserName = driver.findElement(By.cssSelector("input#email"));
        UserName.sendKeys("atia.as.samia49@gmai.com");
//********* Enter password *********

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Atia@049");

        //********* Final Sign In *********

        WebElement FinalSignin = driver.findElement(By.cssSelector("button#submitBtn > span"));
        FinalSignin.click();
        Thread.sleep(3000);

        //********* Click on profile button *********

        System.out.println("Click on profile button");
        // WebElement ProfileButton = driver.findElement(By.xpath("//SPAN[@class='b-avatar badge-primary rounded-circle']"));
        // WebElement ProfileButton = driver.findElement(By.xpath("//a[@role='button']"));
//        WebElement ProfileButton = driver.findElement(By.xpath("//a[@role='button']"));

        WebElement ProfileButton = driver.findElement(By.cssSelector("a[role='button']"));

        //WebElement ProfileButton = driver.findElement(By.className("b-avatar badge-primary rounded-circle"));
        // WebElement ProfileButton = driver.findElement(By.id("__BVID__873"));

        ProfileButton.click();

        Thread.sleep(4000);

// ********* Log Out *********
        System.out.println("Logout from the Go Zayaan Site");
        WebElement Logout = driver.findElement(By.cssSelector("li:nth-of-type(3) > a[role='menuitem']"));
        Logout.click();

        Thread.sleep(4000);
        //Close browser

        driver.quit();

        WebElement element = null;
        return element;


    }

}
