package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Karina on 1/1/2017.
 */
public class TestCNNHome extends CommonAPI {

    @Test
    public void testHome(){
        clickByXpath(".//*[@id='nav']/div[2]/div[2]/a[2]");
        clickByXpath(".//*[@id='nav']/div[2]/div[2]/a[3]");

    }
}