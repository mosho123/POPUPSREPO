package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandel {

	public static void main(String[] args) throws InterruptedException 
	{
		
       WebDriver driver = new ChromeDriver();
       
       driver.get("https://the-internet.herokuapp.com/javascript_alerts");
       driver.manage().window().maximize();
       
       
       driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
      Thread.sleep(1000);
       Alert alt = driver.switchTo().alert();
       alt.accept();
     
       
     // driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
     // Thread.sleep(1000);
    //  Alert alt = driver.switchTo().alert();
   //   alt.dismiss();
       
       
       // driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
       //Thread.sleep(1000);
       // Alert alt = driver.switchTo().alert();
       //System.out.println(alt.getText());
       
       Thread.sleep(1000);
       
       //System.out.println(driver.findElement(By.xpath("//p[text()=\"You successfully clicked an alert\"]")));
       
       String txt = driver.findElement(By.xpath("//p[text()=\"You successfully clicked an alert\"]")).getText();
       System.out.println(txt);
       
       
       
       
       
	}

}
