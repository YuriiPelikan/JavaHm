package RedBox;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
    WebDriver driver;

    @BeforeTest
    public void start() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://redbox.lviv.ua/");
    }

    @Test
    public void purchase() throws InterruptedException {
        driver.manage().window().maximize();

        //choose burgers on menu
        driver.findElement(By.xpath("//a[@title=\"Бургери\"]")).click();
        String choose1 = driver.findElement(By.xpath("//a[@title=\"Бургери\"]")).getAttribute("title");
        Assert.assertTrue(choose1.equals("Бургери"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0, 400);");
        Thread.sleep(2300);

        //add second burger to the basket
        driver.findElement(By.xpath("//a[@id=\"add2379\"]")).click();
        String choose2 = driver.findElement(By.xpath("//a[@id=\"add2379\"]")).getAttribute("id");
        Assert.assertTrue(choose2.equals("add2379"));

        //go to the basket
        js.executeScript("scroll(350, 0);");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='Ваш кошик']")).click();
        String choose3 = driver.findElement(By.xpath("//span[.='Ваш кошик']")).getText();
        Assert.assertTrue(choose3.equals("Ваш кошик"));
        js.executeScript("scroll(0, 350);");
        Thread.sleep(2000);

        //clear window where we choose count
        //choose count 5
        driver.findElement(By.xpath("//*[@type=\"number\"]")).clear();
        driver.findElement(By.xpath("//*[@type=\"number\"]")).sendKeys("5");
        String choose4 = driver.findElement(By.xpath("//*[@type=\"number\"]")).getAttribute("Title");
        Assert.assertTrue(choose4.equals("Qty"));
        Thread.sleep(2500);

        //push button continue
        driver.findElement(By.xpath("//a[@href=\"/checkout\"]")).click();
        js.executeScript("scroll(0, 500);");
        Thread.sleep(1500);

        //enter name
        driver.findElement(By.id("billing_first_name")).sendKeys("Yuriy");
        String choose6 = driver.findElement(By.id("billing_first_name")).getAttribute("name");
        Assert.assertTrue(choose6.equals("name"));
        Thread.sleep(1000);

        //enter number of telephone
        driver.findElement(By.id("phone")).sendKeys("0971111223");
        String choose7 = driver.findElement(By.id("phone")).getAttribute("name");
        Assert.assertTrue(choose7.equals("phone"));
        Thread.sleep(1000);

        //enter address of delivering
        driver.findElement(By.id("billing_company")).sendKeys("Naykova 6 14");
        String choose8 = driver.findElement(By.id("billing_company")).getAttribute("name");
        Assert.assertTrue(choose8.equals("address"));
    }
}

