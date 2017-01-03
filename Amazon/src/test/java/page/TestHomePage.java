package page;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


/**
 * Created by Karina on 1/1/2017.
 */
public class TestHomePage extends CommonAPI {

   @Test
   public void testHome(){
       System.out.println(driver.getCurrentUrl());
       clickByXpath("//*[@id='nav-xshop']/a[2]");

    }





}
