package RedBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
    WebDriver driver;
    public static final String count = "//*[@id=\"post-8\"]/div/div/form/table/tbody/tr/td[5]/div/div/input";

    @BeforeTest
    public void start() {
        System.setProperty("webdriver.chrome.driver", "/Users/Юрий/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://redbox.lviv.ua/");
    }

    @Test
    public void purchase() throws InterruptedException {
        driver.manage().window().maximize();
        //choose burgers on menu
        driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div[2]/nav/ul/li[3]/a")).click();
        Thread.sleep(2000);
        //choose second burger
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[2]/div/div/div[1]/a")).click();
        Thread.sleep(2000);
        //add to the basket
        driver.findElement(By.id("add2379")).click();
        Thread.sleep(2000);
        //go to the basket
        driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div[1]/div[2]/ul/li/a")).click();
        Thread.sleep(2000);
        //clear window where we choose count
        //choose count 5
        driver.findElement(By.xpath(count)).clear();
        driver.findElement(By.xpath(count)).sendKeys("5");
        Thread.sleep(2000);
        //push button continue
        driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/div/div/a")).click();
        Thread.sleep(2000);
        //enter name
        driver.findElement(By.id("billing_first_name")).sendKeys("Yuriy");
        Thread.sleep(2000);
        //enter number of telephone
        driver.findElement(By.id("phone")).sendKeys("0971111223");
        Thread.sleep(2000);
        //enter address of delivering
        driver.findElement(By.id("billing_company")).sendKeys("Naykova 6 14");
        Thread.sleep(2000);
    }

}