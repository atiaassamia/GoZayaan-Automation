package gozayaancode;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import static java.lang.Thread.sleep;
import static org.openqa.selenium.Keys.ENTER;


public class Searchflight {

    public static WebDriver driver = null;



    @Test

    public static void initialize() throws InterruptedException {

     WebDriverManager.chromedriver().setup();
     System.out.println("Static method");
     // System.setProperty("webDriver.chrome.driver", "src/main/resources/Resources/chromedriver.exe");
     // Create Driver
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.gozayaan.com");
     System.out.println("Page is opened.");

     // Sleep for 3 second

     sleep(3000);



        //********* Login *********

        System.out.println("Login...!!!!!");
        WebElement Login = driver.findElement(By.cssSelector("button[class='btn btn-primary']"));
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
        sleep(3000);


     //********* Search Flight *********

        WebElement FlightSearch = driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
        FlightSearch.click();
        sleep(7000);

//********* Select Flight *********
        //WebElement SelectFlight = driver.findElement(By.cssSelector("body > div:nth-child(8) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > button:nth-child(2)"));

        WebElement SelectFlight = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]"));
        SelectFlight.click();
        sleep(5000);

        //__________________________________________*********  Enter Traveller Details *********_______________________________________________

        //__________________________________________  Passenger _______________________________________________
        System.out.println("Select New Traveler Option...");

        WebElement dropdown = driver.findElement(By.xpath("//input[@placeholder='Select']"));
        dropdown.click();


        // *********  Choose a option *********
       // Select options = new Select(driver.findElement(By.id("//ul[@id='vs1__listbox']")));
        WebElement options = driver.findElement(By.xpath("//input[@placeholder='Select']"));
        options.sendKeys("New Traveler");
        options.sendKeys(Keys.ENTER);

//__________________________________________  Personal Details _______________________________________________
        // *********  Select Title *********
        WebElement SelectTitle = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/span[1]/div[1]/div[2]/label[1]/div[1]/span[1]"));
        SelectTitle.click();

//*********  First Name *********

 WebElement  FirstName = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]/div[2]/div[1]/div[1]/div[4]/fieldset[1]/div[1]/span[1]/div[1]/input[1]"));
        FirstName.sendKeys("Atia");

//*********  Last Name ***********

        WebElement  LastName = driver.findElement(By.xpath("//input[@id='last-name-0']"));
        LastName.sendKeys("As Samia");


//__________________________________________  Contact Details _______________________________________________

//********* Enter Email *********

 WebElement Email = driver.findElement(By.xpath("//input[@id='email-0']"));
        Email.sendKeys("atia.as.samia49@gmai.com");

        sleep(3000);
        //********* Enter phone Number *********

        WebElement phoneNumber = driver.findElement(By.cssSelector("#phone-number-0"));
        phoneNumber.sendKeys("01234567890");
        sleep(3000);
//__________________________________________ Travel Insurance _______________________________________________
       WebElement TravelInsurancer = driver.findElement(By.xpath("//body/div[@id='app']/div/div[@class='flight-booking-container']/div[@class='container']/div[@class='row mb-reverse']/div[@class='col-lg-8']/div[@class='passenger-info-wrapper insurance-wrapper']/div[@id='travel-insurance-form']/div[@class='form-details-wrapper']/div[@class='form-label confirmation-label']/div[@class='form-item confirmation-item']/div[2]"));
        TravelInsurancer.click();
        sleep(3000);
        WebElement LostBaggageProtection = driver.findElement(By.xpath("//div[@class='form-options']//div[1]"));
        LostBaggageProtection.click();

        sleep(5000);


//__________________________________________  Lost Baggage Protection _______________________________________________
        System.out.println("Press on continue button");
        WebElement continueButton = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]"));
        continueButton.click();
        sleep(3000);

        //********* Confirm Booking *********
        System.out.println("Press on Confirm Booking button");
        WebElement ConfirmBooking = driver.findElement(By.xpath("//button[@class='btn btn-secondary']"));
        ConfirmBooking.click();


driver.close();


 }





}
