package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage
{
    WebDriver driver;

    @FindBy(css = "input#number1Field")
    public WebElement firstNumberField;

    @FindBy(css = "input#number2Field")
    public WebElement secondNumberField;

   @FindBy(id = "selectOperationDropdown")
    public WebElement dropdown;

   @FindBy(id = "calculateButton")
   public WebElement calculatebtn;

   @FindBy(id = "numberAnswerField")
   public WebElement answerField;


 public HomePage(WebDriver driver)
 {
     this.driver = driver;
     PageFactory.initElements(driver,this);
 }

 public void naviagteToUrl(String ul)
 {
     driver.navigate().to(ul);
 }

public void enterFirstNum(int numb1)
{
  firstNumberField.sendKeys(String.valueOf(numb1));
}

public void enterSecondNumber(int num2)
{
    secondNumberField.sendKeys(String.valueOf(num2));
}

public void selectAddFromDropDown()
{
    Select sadd = new Select(dropdown);
    sadd.selectByVisibleText("Add");
}

public void selectSubtractFromDropDown()
{
    Select ssubtract = new Select(dropdown);
    ssubtract.selectByVisibleText("Subtract");
}
public void selectMultiplyFromDropdown()
{
    Select smultiply = new Select(dropdown);
    smultiply.selectByVisibleText("Multiply");
}
public void selectDivideFromDropDown()
{
    Select sdivide = new Select(dropdown);
    sdivide.selectByVisibleText("Divide");
}
public void selectConcatenatefromDD()
{
    Select sconcatenate = new Select(dropdown);
    sconcatenate.selectByVisibleText("Concatenate");
}

public void clickCalculateBtn()
{
    calculatebtn.click();
}
public int getAnswer()
{
     System.out.println("Answer is Homepage"+answerField.getText());
     String s1 = answerField.getText();
     int i = Integer.parseInt(s1);
     return  i;

}

}
