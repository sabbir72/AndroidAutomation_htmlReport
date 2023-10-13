package testCase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class testClass {
    public static AndroidDriver<MobileElement> driver;
    @Test
    public void WishList() throws InterruptedException {

        MobileElement BackCoatyManu = driver.findElement(By.className("android.widget.ImageButton"));
        BackCoatyManu.click();
        Thread.sleep(2000);

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
    public void UpdateMyAccountInfo() throws InterruptedException {
        MobileElement MyAccountUpdateInfo= driver.findElement(By.id("com.portonics.aarong:id/tvMyAccount") );
        MyAccountUpdateInfo.click();
        Thread.sleep(2000);


        MobileElement AddressBook= driver.findElement(By.id("com.portonics.aarong:id/tvAddressBook") );
        AddressBook.click();
        Thread.sleep(2000);

        MobileElement FName= driver.findElement(By.id("com.portonics.aarong:id/textFirstName") );
        FName.clear();
        FName.sendKeys("Abdullah");
        Thread.sleep(2000);

        MobileElement LName= driver.findElement(By.id("com.portonics.aarong:id/textLastName") );
        FName.clear();
        LName.sendKeys("Al Noman");
        Thread.sleep(2000);

        MobileElement Address= driver.findElement(By.id("com.portonics.aarong:id/textAddressOne") );
        Address.clear();
        Address.sendKeys("Tongi RailStation");
        Thread.sleep(2000);
    }
}
