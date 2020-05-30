package testCermati;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class StepDefinitions {

    public static WebDriver driver;

    @Given("User in Register Page")
    public void user_in_Register_Page() {
        String exePath = "D:\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.cermati.com/gabung");
    }

    @When("User input email")
    public void user_input_email() {
        driver.findElement(By.id("email")).sendKeys("test123@gmail.com");
    }

    @When("User input kata sandi and konfirmasi kata sandi")
    public void user_input_kata_sandi_and_konfirmasi_kata_sandi() {
        driver.findElement(By.id("password")).sendKeys("12345");
        driver.findElement(By.id("confirm-password")).sendKeys("P@ssw0rd12345");
    }

    @When("User input nama depan and nama belakang")
    public void user_input_nama_depan_and_nama_belakang() {
        driver.findElement(By.id("first-name")).sendKeys("Ruth");
        driver.findElement(By.id("last-name")).sendKeys("Hutauruk");
    }

    @When("User input nomor telepon")
    public void user_input_nomor_telepon() {
        driver.findElement(By.id("mobile-phone")).sendKeys("089561616161");
    }

    @When("User input Kabupaten")
    public void user_input_Kabupaten() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("residence-city")).sendKeys("KOTA JAKARTA SELATAN");
    }

    @When("User klik button daftar akun")
    public void user_klik_button_daftar_akun() {
        driver.findElement(By.className("btn btn-full btn-submit btn-track")).click();
    }

    @Then("User successfully registered")
    public void user_successfully_registered() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String label = driver.getCurrentUrl();
        Assert.assertEquals("https://www.cermati.com/me", label);
        System.out.println("Registered Successfully");
    }

}
