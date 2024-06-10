package test;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidTest {


    @BeforeTest
    public void setUp() throws InterruptedException, MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setDeviceName("HTZAndroid");
        options.setApp(System.getProperty("user.dir")+"/apps/Android-MyDemoAppRN.1.3.0.build-244.apk");

        AndroidDriver driver =   new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        Thread.sleep(4000);

    }


    @Test
    public void sampleTest() {
        System.out.println("this is my first Appium test");

    }


}
