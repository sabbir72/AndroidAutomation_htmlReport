package testCase;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HomePageTest {

    public static AndroidDriver<MobileElement> driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        // Set up desired capabilities for Android emulator/device
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "b4176af8");
//        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.portonics.aarong");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.ranosys.aarong.ui.SplashActivity");

        // Initialize Appium driver
        URL appiumServerURL = new URL("http://localhost:4723/wd/hub");
//        driver = new AndroidDriver<AndroidElement>(appiumServerURL, capabilities);
        driver = new AndroidDriver<MobileElement>(appiumServerURL, capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Test
    public void testAppAutomation() throws InterruptedException {
        // start to longin page
       MobileElement Next01= driver.findElement(By.id("com.portonics.aarong:id/tvNext"));
       Next01.click();
        Thread.sleep(2000);

        MobileElement Next02=  driver.findElement(By.id("com.portonics.aarong:id/tvNext"));
        Next02.click();
        Thread.sleep(2000);

        MobileElement Next03=  driver.findElement(By.id("com.portonics.aarong:id/tvNext"));
        Next03.click();
        Thread.sleep(2000);


    }
    @Test
    public void LoginPages() throws InterruptedException {
        // start  longin
        MobileElement LoginBtn= driver.findElement(By.id("com.portonics.aarong:id/btnLoginNow"));
        LoginBtn.click();
        Thread.sleep(3000);

      MobileElement EmailFiled= driver.findElement(By.id("com.portonics.aarong:id/textinput_placeholder"));
      EmailFiled.click();
      Thread.sleep(2000);
      driver.getKeyboard().pressKey("st201907@gmail.com");


       MobileElement loginContext= driver.findElement(By.id("com.portonics.aarong:id/tvHeading"));
      loginContext.click();
      Thread.sleep(2000);
      MobileElement CONTINUEButton =driver.findElement(By.id("com.portonics.aarong:id/btnLogin"));
      CONTINUEButton.click();


      MobileElement PassWordFiled =driver.findElement(By.id("com.portonics.aarong:id/etPassword"));
      PassWordFiled.click();
      Thread.sleep(2000);
//      PassWordFiled.sendKeys("121212");
      driver.getKeyboard().pressKey("121212");

      MobileElement loginContext01= driver.findElement(By.id("com.portonics.aarong:id/tvHeading"));
      loginContext01.click();
      Thread.sleep(2000);

      MobileElement loginBtn= driver.findElement(By.id("com.portonics.aarong:id/btnLogin"));
      loginBtn.click();
      Thread.sleep(2000);



    }
@Test
    public void HomeMenuPage() throws InterruptedException {

        MobileElement MenuIcon =driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.widget.ImageView"));
        MenuIcon.click();
        Thread.sleep(2000);

        MobileElement MenProduct =driver.findElement(By.xpath("//android.widget.TextView[@text='MEN']"));
        MenProduct.click();
        Thread.sleep(2000);



        MobileElement MenProductListCoaty =driver.findElement(By.xpath("//android.widget.TextView[@text='COATY']"));
        MenProductListCoaty.click();
        Thread.sleep(2000);

        MobileElement MenCoatySelect =driver.findElement(By.xpath("//android.widget.TextView[@text='White Printed and Embroidered Cotton Coaty']"));
        MenCoatySelect.click();
        Thread.sleep(2000);

}
@Test
    public void AddCardPart() throws InterruptedException {

    MobileElement ProductAddWishLish =driver.findElement(By.id("com.portonics.aarong:id/btnAddToWishList"));
    ProductAddWishLish.click();
    Thread.sleep(2000);

    MobileElement AddToBag =driver.findElement(By.xpath("//android.widget.Button[@text='ADD TO BAG']"));
    AddToBag.click();
    Thread.sleep(2000);

    MobileElement SelectSize =driver.findElement(By.xpath("//android.widget.Spinner[@text='Select Size']"));
    SelectSize.click();
    Thread.sleep(2000);
//// problem
////    MobileElement SelectSizeSelect =driver.findElement(By.xpath("//*[contains(@text,'44')]"));
////    MobileElement SelectSizeSelect =driver.findElement(By.xpath("//*[@text='44']"));
////    SelectSizeSelect.click();

    MobileElement  SelectSizeSelect = driver.findElement(By.xpath("//*[@text='Select Size']"));
    SelectSizeSelect.clear();
    SelectSizeSelect.sendKeys("44");
    Thread.sleep(2000);

    MobileElement ProductQuantity =driver.findElement(By.xpath("//android.widget.Button[@index='2']"));
    ProductQuantity.click();
    Thread.sleep(2000);


    MobileElement ProductAddDone =driver.findElement(By.id("com.portonics.aarong:id/btnAddToCart"));
    ProductAddDone.click();
    Thread.sleep(2000);

    MobileElement ContinueShoping =driver.findElement(By.xpath("//android.widget.Button[@text='CONTINUE SHOPPING']"));
    ContinueShoping.click();
    Thread.sleep(2000);

    MobileElement BackCoatyManu = driver.findElement(By.className("android.widget.ImageButton"));
    BackCoatyManu.click();
    Thread.sleep(2000);
}

@Test
        public void WishListRemove() throws InterruptedException {

        MobileElement MyAccount = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"My Account\"]/android.widget.ImageView"));
        MyAccount.click();
        Thread.sleep(2000);

        MobileElement WishList = driver.findElement(By.id("com.portonics.aarong:id/tvWishlist"));
        WishList.click();
        Thread.sleep(2000);

        MobileElement WishListProductCloseBtn = driver.findElement(By.id("com.portonics.aarong:id/btnClose"));
        WishListProductCloseBtn.click();
        Thread.sleep(2000);

        MobileElement WishListBackHomePage = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]") );
        WishListBackHomePage.click();
        Thread.sleep(2000);
}
@Test
public void NewAddressAdd() throws InterruptedException {
    MobileElement NewMyAccount = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"My Account\"]/android.widget.ImageView"));
    NewMyAccount.click();
    Thread.sleep(2000);


    MobileElement NewMyAccountUpdateInfo = driver.findElement(By.id("com.portonics.aarong:id/tvMyAccount"));
    NewMyAccountUpdateInfo.click();
    Thread.sleep(2000);


    MobileElement NewAddressBook = driver.findElement(By.id("com.portonics.aarong:id/tvAddressBook"));
    NewAddressBook.click();
    Thread.sleep(2000);

    MobileElement NewAddress = driver.findElement(By.xpath("//android.widget.TextView[@text='ADD NEW ADDRESS']"));
    NewAddress.click();
    Thread.sleep(2000);

    MobileElement NewAddressLine01 = driver.findElement(By.id("com.portonics.aarong:id/textAddressOne"));
    NewAddressLine01.clear();
    NewAddressLine01.sendKeys("Sector 03");
    Thread.sleep(2000);
    MobileElement NewAddressLine02 = driver.findElement(By.id("com.portonics.aarong:id/textAddressTwo"));
    NewAddressLine02.clear();
    NewAddressLine02.sendKeys("Uttara,Dhaka");
    Thread.sleep(2000);
    //     scroll part
    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().textContains(\"Address type\").instance(0))").click();

    MobileElement NewAddressState = driver.findElement(By.id("com.portonics.aarong:id/textDistrictState"));
    NewAddressState.clear();
    NewAddressState.sendKeys("Chandpur");
    Thread.sleep(2000);

    MobileElement NewAddressCity = driver.findElement(By.id("com.portonics.aarong:id/textCityArea"));
    NewAddressCity.clear();
    NewAddressCity.sendKeys("Kachua");
    Thread.sleep(2000);

    MobileElement NewAddressPostCode = driver.findElement(By.id("com.portonics.aarong:id/textPostalCode"));
    NewAddressPostCode.clear();
    NewAddressPostCode.sendKeys("1710");
    Thread.sleep(2000);

   MobileElement NewAddressType = driver.findElement(By.id("com.portonics.aarong:id/textAddressType"));
    NewAddressType.clear();
    NewAddressType.sendKeys("Shipping address");
    Thread.sleep(2000);

    MobileElement ClickBox = driver.findElement(By.id("com.portonics.aarong:id/checkBoxShipping"));
    ClickBox.click();
    Thread.sleep(2000);

    MobileElement SaveAddress = driver.findElement(By.id("com.portonics.aarong:id/btnSaveAddress"));
    SaveAddress.click();
    Thread.sleep(2000);

//    MobileElement SaveAddressDoneAndBank = driver.findElement(By.className("android.widget.ImageButton"));
//    SaveAddressDoneAndBank.click();
//    Thread.sleep(2000);

}
@Test
    public void UpdateMyAccountInfo() throws InterruptedException {

//    MobileElement MyAccount = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"My Account\"]/android.widget.ImageView"));
//    MyAccount.click();
//    Thread.sleep(2000);
//
//
//    MobileElement MyAccountUpdateInfo = driver.findElement(By.id("com.portonics.aarong:id/tvMyAccount"));
//    MyAccountUpdateInfo.click();
//    Thread.sleep(2000);
//
//
//    MobileElement AddressBook = driver.findElement(By.id("com.portonics.aarong:id/tvAddressBook"));
//    AddressBook.click();
//    Thread.sleep(2000);

    MobileElement AddressChange = driver.findElement(By.id("com.portonics.aarong:id/changeAddress"));
    AddressChange.click();
    Thread.sleep(2000);

    MobileElement AddressEdit = driver.findElement(By.id("com.portonics.aarong:id/btnEdit"));
    AddressEdit.click();
    Thread.sleep(5000);

    MobileElement FName = driver.findElement(By.id("com.portonics.aarong:id/textFirstName"));
    FName.clear();
    FName.sendKeys("Abdullah");
    Thread.sleep(2000);

    MobileElement LName = driver.findElement(By.id("com.portonics.aarong:id/textLastName"));
    LName.clear();
    LName.sendKeys("Al Noman");
    Thread.sleep(2000);

    MobileElement Address01 = driver.findElement(By.id("com.portonics.aarong:id/textAddressOne"));
    Address01.clear();
    Address01.sendKeys("Tongi RailStation");
    Thread.sleep(2000);

//     scroll part
    driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
            ".scrollIntoView(new UiSelector().textContains(\"Address type\").instance(0))").click();

    MobileElement UPDATE_BTN= driver.findElement(By.xpath("//android.widget.Button[@text='UPDATE']") );
    UPDATE_BTN.click();
    Thread.sleep(2000);


}
@Test
    public void DeleteAddress() throws InterruptedException {
        MobileElement D_ChangeAddress =driver.findElement(By.xpath("//android.widget.FrameLayout[@index='2']//android.widget.Button[@resource-id='com.portonics.aarong:id/button2']"));
        D_ChangeAddress.click();
        Thread.sleep(2000);
      MobileElement SureDeleteAddress =driver.findElement(By.id("com.portonics.aarong:id/btnPositive"));
       SureDeleteAddress.click();
        Thread.sleep(2000);
      MobileElement Back01 =driver.findElement(By.className("android.widget.ImageButton"));
       Back01.click();
        Thread.sleep(2000);
        MobileElement Back02 =driver.findElement(By.className("android.widget.ImageButton"));
       Back02.click();
        Thread.sleep(2000);
}

@Test
    public void CardProductDelete() throws InterruptedException {
    MobileElement CardIcon =driver.findElement(By.id("com.portonics.aarong:id/cartFragment"));
   CardIcon.click();
    Thread.sleep(2000);

    MobileElement CardIconDelete =driver.findElement(By.id("com.portonics.aarong:id/btnRemove"));
   CardIconDelete.click();
    Thread.sleep(2000);

    MobileElement CardIconFinalDelete =driver.findElement(By.id("com.portonics.aarong:id/btnPositive"));
   CardIconFinalDelete.click();
    Thread.sleep(2000);

    MobileElement CardBack =driver.findElement(By.className("android.widget.ImageButton"));
    CardBack.click();
    Thread.sleep(2000);
//    System.out.println("Done All TestCase Complete.");
}
//    @AfterTest
//    public void tearDown() {
//        // Close the app and quit the driver
//        driver.quit();
    }

