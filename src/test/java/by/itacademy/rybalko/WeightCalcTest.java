package by.itacademy.rybalko;

import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeightCalcTest {
    @Test
    public void testFormWithEmptyValues() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input  ";
        By inputCalculateBy = By.xpath(inputCalculateXpath);
        WebElement inputCalculateWebElement = driver.findElement(inputCalculateBy);
        inputCalculateWebElement.click();

        String getResultXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b";
        By getResultBy = By.xpath(getResultXpath);
        WebElement getResultWebElement = driver.findElement(getResultBy);

        String actual = getResultWebElement.getText();
        Assertions.assertEquals("Не указано имя." + "Рост должен быть в диапазоне 50-300 см." +
                        "Вес должен быть в диапазоне 3-500 кг." + "Не указан пол.",
                actual);
    }
}

