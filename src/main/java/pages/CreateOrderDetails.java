package pages;

import java.util.List;

import Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by avantrik1 on 22/03/2016.
 */
public class CreateOrderDetails extends BasePage {

    public CreateOrderDetails()
    {
        PageFactory.initElements(driver, this);

    }
    @FindBy(how= How.XPATH,using="html/body/div[2]/div[1]/ul/li[3]/a")
    public WebElement orderManagement;

    @FindBy(how= How.XPATH,using="html/body/div[2]/div[1]/ul/li[3]/ul/li[1]/a")
    public WebElement createOrder;

    @FindBy(how= How.XPATH,using=".//*[@id='supplier']")
    public WebElement supplier;

    @FindBy(how= How.XPATH,using=".//*[@id='quality']")
    public WebElement quality;

    @FindBy(how= How.XPATH,using=".//*[@id='quality']/option[27]")
    public WebElement qualitydisplay;


    @FindBy(how= How.XPATH,using=".//*[@id='buyer']")
    public WebElement buyer;

    @FindBy(how= How.XPATH,using=".//*[@id='createorder']/div[2]/div[2]/div/div[2]/div[1]/div/input")
    public WebElement cusRef;

    @FindBy(how= How.XPATH,using=".//*[@id='date_timepicker_start']")
    public WebElement orderdate;

    @FindBy(how= How.XPATH,using=".//*[@id='season']")
    public WebElement season;

    @FindBy(how= How.XPATH,using=".//*[@id='createorder']/div[2]/div[2]/div/div[3]/div[2]/div/input")
    public WebElement styleRef;

    @FindBy(how= How.XPATH,using=".//*[@id='createorder']/div[1]/div/div[2]/input")
    public WebElement next;

   //Step-2 Page
    @FindBy(how = How.XPATH,using = ".//*[@id='color']")
    public WebElement color;

    @FindBy(how = How.XPATH,using = ".//*[@id='comments']")
    public WebElement comments;

    @FindBy(how = How.XPATH,using = ".//*[@id='quantity']")
    public WebElement quantity;


    @FindBy(how = How.XPATH,using = ".//*[@id='units']")
    public WebElement units;

    @FindBy(how = How.XPATH,using = ".//*[@id='uprice']")
    public WebElement uprice;

    @FindBy(how = How.XPATH,using = ".//*[@id='currency']")
    public WebElement currency;

    @FindBy(how = How.XPATH,using = ".//*[@id='shipping']")
    public WebElement shippingMode;

    @FindBy(how = How.XPATH,using = ".//*[@id='pterms']")
    public WebElement payments;

    @FindBy(how = How.XPATH,using = ".//*[@id='createorder']/div[2]/div[2]/div/div/div[2]/div[3]/div[1]/div/select")
    public WebElement deliveryMode;

    @FindBy(how = How.XPATH,using = ".//*[@id='deldate']")
    public WebElement dDate;

    @FindBy(how = How.XPATH,using = ".//*[@id='createorder']/div[2]/div[2]/div/div/div[3]/div/div[3]/select")
    public WebElement deliverAdd;

    @FindBy(how = How.XPATH,using = ".//*[@id='group']")
    public WebElement selectGroup;

    @FindBy(how = How.XPATH,using = ".//*[@id='careword']")
    public WebElement careword;

    @FindBy(how = How.XPATH,using = ".//*[@id='createorder']/div[2]/div[2]/div/div/div[3]/div/div[6]/div/div[1]/div")
    public WebElement symbol;

    @FindBy(how = How.XPATH,using = ".//*[@id='createorder']/div[1]/div/div[2]/input")
    public WebElement pNext;



    public void goToCreateOrder()throws InterruptedException{

        orderManagement.click();
        createOrder.click();
        createOrder.click();

    }
    public void orderDetails_Step1() throws InterruptedException {

        supplier.sendKeys("SwapnaTraders");
        Thread.sleep(3000);
        Utils.selectFromDropDown(By.id("quality"),"Jeans");
//        Select select = new Select(driver.findElement(By.id("quality")));
//        select.selectByVisibleText("Jeans");

        Thread.sleep(4000);
        buyer.sendKeys("Santosh");
        cusRef.sendKeys("Xyz");
        orderdate.sendKeys("22");
        season.sendKeys("Winter");
        styleRef.sendKeys("123");
        next.click();

    }

    public void orderDetails_Step2()throws InterruptedException{
        color.sendKeys("Red");
        comments.sendKeys("Hello");
        quantity.sendKeys("1234");
        units.sendKeys("500");
        uprice.sendKeys("20");
        currency.sendKeys("Rs");
        shippingMode.sendKeys("Road");
        payments.sendKeys("Debit Card");
        deliveryMode.sendKeys("Sea");
        dDate.sendKeys("22");
        deliverAdd.sendKeys("D.No-56-67-78,Complex,Chenni india");
        Thread.sleep(3000);
        selectGroup.sendKeys("Group A");
        Thread.sleep(3000);
        careword.sendKeys("Dry Clean");
        Thread.sleep(3000);
        symbol.click();
        Thread.sleep(3000);
        pNext.click();
        Thread.sleep(3000);
    }
}
