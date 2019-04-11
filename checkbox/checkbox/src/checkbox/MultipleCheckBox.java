package checkbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class MultipleCheckBox {
    public static void main(String[] args) throws InterruptedException {
    	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\976810\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       
        driver.get("http://browsershots.org/");
        
       // List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
//        int i1 = 0;
//        for (WebElement we:driver.findElements(By.xpath("//input[@type='checkbox']"))) {
//            if (we.isSelected()) { i1++; }
//        }
//        System.out.println(i1
//                    + " Number of checked count check boxes present in the page");
        
        
        int i=0,j = 0;
        for (WebElement we:driver.findElements(By.xpath("//input[@type='checkbox']"))) {
            if (we.isSelected())
            { 
            	i++; 
            	}
            else {
            	j++;
        }
        }
            System.out.println("number of selected checkbox: "+i);
            System.out.println("number of not selected checkbox: "+j);
        
        
        
        
        
//        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
//        Thread.sleep(1000);
//        for(int i=0; i<checkBoxes.size(); i=i+2){
//            checkBoxes.get(i).click();
//        }
//        Thread.sleep(1000);
//        int checkedCount=0, uncheckedCount=0;
//        for(int i=0; i<checkBoxes.size(); i++){
//            System.out.println(i+" checkbox is selected "+checkBoxes.get(i).isSelected());
//            if(checkBoxes.get(i).isSelected()){
//                checkedCount++;
//            }else{
//                uncheckedCount++;
//            }
//        }
//        System.out.println("number of selected checkbox: "+checkedCount);
//        System.out.println("number of unselected checkbox: "+uncheckedCount);
//    }
        }
}
