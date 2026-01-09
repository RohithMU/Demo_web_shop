package elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elements {

	public WebDriver driver;
	private WebDriverWait wait;

//	*******************************Home-page-elements***************************************
	public static By register = By.xpath("(//*[.='Register'])[2]");
	public static By login = By.xpath("(//*[.='Log in'])[1]");
	public static By shoppingcarttop = By.xpath("(//*[.='Shopping cart'])[1]");
	public static By wishlist = By.xpath("//*[.='Wishlist']/../span[1]");
	public static By searchstore = By.xpath("//*[@id='small-searchterms']");
	public static By searchbutton = By.xpath("//*[@value='Search']");
	public static By tricentis = By.xpath("//*[.='Tricentis']");
//	*******************************Top menu in home page*************************************
	public static By books = By.xpath("//*[@class='top-menu']/li[1]");
	public static By computers = By.xpath("//*[@class='top-menu']/li[2]");
	public static By electronics = By.xpath("//*[@class='top-menu']/li[3]");
	public static By apparelandshoes = By.xpath("//*[@class='top-menu']/li[4]");
	public static By digitaldownloads = By.xpath("//*[@class='top-menu']/li[5]");
	public static By jewelary = By.xpath("//*[@class='top-menu']/li[6]");
	public static By giftcards = By.xpath("//*[@class='top-menu']/li[7]");
//	*******************************Information***********************************************
	public static By sitemap = By.xpath("//*[.='Sitemap']/../li[1]");
	public static By shippingandreturns = By.xpath("//*[.='Sitemap']/../li[2]");
	public static By privacynotice = By.xpath("//*[.='Sitemap']/../li[3]");
	public static By conditionsofuse = By.xpath("//*[.='Sitemap']/../li[4]");
	public static By aboutus = By.xpath("//*[.='Sitemap']/../li[5]");
	public static By contactus = By.xpath("//*[.='Sitemap']/../li[6]");
//	*******************************Customer service******************************************
	public static By search = By.xpath("//*[.='Search']/../../li[1]");
	public static By news = By.xpath("//*[.='Search']/../../li[2]");
	public static By blog = By.xpath("//*[.='Search']/../../li[3]");
	public static By recentlyviewedproducts = By.xpath("//*[.='Search']/../../li[4]");
	public static By compareproductlist = By.xpath("//*[.='Search']/../../li[5]");
	public static By newproducts = By.xpath("//*[.='Search']/../../li[6]");
//	*******************************My account************************************************
	public static By myaccount = By.xpath("//*[.='My account']/../../li[1]");
	public static By orders = By.xpath("//*[.='My account']/../../li[2]");
	public static By addresses = By.xpath("//*[.='My account']/../../li[3]");
	public static By shoppingcartbottom = By.xpath("//*[.='My account']/../../li[4]");
	public static By wishlistbottom = By.xpath("//*[.='My account']/../../li[5]");
//	*******************************Follow us*************************************************
	public static By facebook = By.xpath("//*[.='Facebook']/../../li[1]");
	public static By twitter = By.xpath("//*[.='Facebook']/../../li[2]");
	public static By rss = By.xpath("//*[.='Facebook']/../../li[3]");
	public static By youtube = By.xpath("//*[.='Facebook']/../../li[4]");
	public static By google = By.xpath("//*[.='Facebook']/../../li[5]");
//	*******************************Register*************************************************
	public static By male = By.xpath("//*[@id='gender-male']");
	public static By female = By.xpath("//*[@id='gender-female']");
	public static By firstname = By.xpath("//*[@id='FirstName']");
	public static By lastname = By.xpath("//*[@id='LastName']");
	public static By registeremail = By.xpath("//*[@id='Email']");
	public static By registerpassword = By.xpath("//*[@id='Password']");
	public static By confirmpassword = By.xpath("//*[@id='ConfirmPassword']");
	public static By registerbutton = By.xpath("//*[@id='register-button']");
	public static By result = By.xpath("//*[@class='result']");
	public static By emailalreadyexist = By.xpath("//*[.='The specified email already exists']");
//	*******************************Login*************************************************
	public static By email = By.xpath("//*[@id='Email']");
	public static By password = By.xpath("//*[@id='Password']");
	public static By rememberme = By.xpath("//*[@id='RememberMe']");
	public static By forgotpassword = By.xpath("//*[@class='forgot-password']");
	public static By login1 = By.xpath("//*[@value='Log in']");
	public static By register1 = By.xpath("(//*[@value='Register'])[1]");
	public static By newsletter = By.xpath("//*[@id='newsletter-email']");
	public static By subscribe = By.xpath("//*[@id='newsletter-subscribe-button']");
	public static By verifymailid = By.xpath("(//*[.='rohithpatilmu@gmail.com'])[2]");
//	*******************************Shopping cart******************************************
	public static By remove = By.xpath("//*[.='Remove:']");
	public static By quantity = By.xpath("//*[.='Qty.:']");
	public static By price = By.xpath("//*[.='Price:']");
	public static By total = By.xpath("//*[.='Total:']");
	public static By updateshoppingcart = By.xpath("//*[@value='Update shopping cart']");
	public static By continueshopping = By.xpath("//*[@value='Continue shopping']");
	public static By coupencode = By.xpath("//*[@name='discountcouponcode']");
	public static By applydiscountcode = By.xpath("//*[@name='applydiscountcouponcode']");
	public static By selectcountry = By.xpath("//*[.='Select country']");
	public static By state = By.xpath("//*[.='Other (Non US)']");
	public static By zippostalcode = By.xpath("//*[@id='ZipPostalCode']");
	public static By estimateshipping = By.xpath("//*[@name='estimateshipping']");
	public static By giftcardcoupencode = By.xpath("//*[@name='giftcardcouponcode']");
	public static By addgiftcard = By.xpath("//*[@name='applygiftcardcouponcode']");
	public static By termsofservice = By.xpath("//*[@id='termsofservice']");
	public static By checkout = By.xpath("//*[@id='checkout']");
	public static By billingaddresscontinue = By.xpath("//*[@onclick='Billing.save()']");
	public static By instorepickup = By.xpath("//*[@onclick='Shipping.togglePickUpInStore(this)']");
	public static By shippingaddresscontinue = By.xpath("//*[@onclick='Shipping.save()']");
	public static By shippingaddressback = By.xpath("//*[@id='shipping-buttons-container']/p/a");
	public static By ground = By.xpath("//*[@id='shippingoption_0']");
	public static By nextdayair = By.xpath("//*[@id='shippingoption_1']");
	public static By seconddayair = By.xpath("//*[@id='shippingoption_2']");
	public static By shippingmethodback = By.xpath("//*[@id='shipping-method-buttons-container']/p/a");
	public static By shippingmetjodcontinue = By.xpath("//*[@onclick='ShippingMethod.save()']");
	public static By cashondelivery = By.xpath("//*[@id='paymentmethod_0']");
	public static By checkormoneyorder = By.xpath("//*[@id='paymentmethod_1']");
	public static By creditcard = By.xpath("//*[@id='paymentmethod_2']");
	public static By purchaseorder = By.xpath("//*[@id='paymentmethod_3']");
	public static By paymentmethodback = By.xpath("//*[@id='payment-method-buttons-container']/p/a");
	public static By paymentmethodcontinue = By.xpath("//*[@onclick='PaymentMethod.save()']");
	public static By paymentinfoback = By.xpath("//*[@id='payment-info-buttons-container']/p/a");
	public static By paymentinfocontinue = By.xpath("//*[@onclick='PaymentInfo.save()']");
	public static By confirmorderback = By.xpath("//*[@id='confirm-order-buttons-container']/p/a");
	public static By confirm = By.xpath("//*[@onclick='ConfirmOrder.save()']");
	public static By clickherefororderdetails = By.xpath("//*[.='Click here for order details.']");
	public static By thankyoucontinue = By.xpath("//*[@value='Continue']");


//	public static By purchaseorder = By.xpath("");

    public Elements(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement getElement(By locator)
    {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void click(By locator)
    {
        getElement(locator).click();
    }

    public void sendKeys(By locator, String text)
    {
        WebElement element = getElement(locator);
        element.clear();
        element.sendKeys(text);
    }

	public String getText(By locator) {
		return getElement(locator).getText();
	}
}

