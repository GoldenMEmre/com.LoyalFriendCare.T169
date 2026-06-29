package tests;

import org.testng.annotations.Test;
import pages.adminPages;
import utilities.ConfigReader;
import utilities.Driver;

public class US01 {

    adminPages adminPages=new adminPages();

    @Test
    public void US01(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        adminPages.signInButton.click();
        Driver.quitDriver();
        System.out.println("Merhaba Takım 169");
        System.out.println("hello world");
        System.out.println("t169");
        System.out.println("Projeye devam T169");
        System.out.println("Selamlar T159");
        System.out.println("automation");
    }

}
