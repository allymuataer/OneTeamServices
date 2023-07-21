package Utilitiez;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilitiez.Driver;

public class commonMethods extends pageInitializer{
	public static void sendKey(WebElement element, String text) {

		element.clear();
		element.sendKeys(text);

	}

	public static void wait(int seconds) {

		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}

	public static void clickRadioOrCheckBox(List<WebElement> radioOrCheckBox, String value) {
		String actualValue;

		for (WebElement eachElement : radioOrCheckBox) {
			actualValue = eachElement.getAttribute("value").trim();
			if (eachElement.isEnabled() && actualValue.equals(value)) {
				eachElement.click();
				break;
			}

		}
	}

	public static void clickRadioOrCheckBoxText(List<WebElement> radioOrCheckBox, String value) {
		String actualValue;

		for (WebElement eachElement : radioOrCheckBox) {
			actualValue = eachElement.getText().trim();
			if (eachElement.isEnabled() && actualValue.equals(value)) {
				eachElement.click();
				break;
			}

		}
	}

	public static void selectDropDownValue(WebElement element, String textToSelect) {

		try {

			Select select = new Select(element);

			List<WebElement> options = select.getOptions();

			for (WebElement el : options) {
				if (el.getText().equals(textToSelect)) {
					select.selectByVisibleText(textToSelect);
					break;
				}
			}

		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}

	}

	public static void selectDropDownIndex(WebElement element, int indexValue) {

		try {

			Select select = new Select(element);
			int size = select.getOptions().size();

			if (size > indexValue) {
				select.selectByIndex(indexValue);
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}

	}

	public static void acceptAlert() {
		try {
			Alert alert = Driver.getDriver().switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	public static void dismissAlert() {
		try {
			Alert alert = Driver.getDriver().switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	public String getTextAlert() {
		Alert alert = null;
		try {
			alert = Driver.getDriver().switchTo().alert();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
		return alert.getText();
	}

//  switch iframe by index
 public static void switchToIFrameByIndex(int iframeIndex) {
     try {
         Driver.getDriver().switchTo().frame(iframeIndex);

     } catch (NoSuchFrameException e) {
         e.printStackTrace();
     }
 }

//switch iframe by element
 public static void switchToIFrameByElement(WebElement iframeElement) {
     try {
         Driver.getDriver().switchTo().frame(iframeElement);

     } catch (NoSuchFrameException e) {
         e.printStackTrace();
     }
 }

//switchiframe by name
 public static void switchToIFrameByName(String iframeName) {
     try {
         Driver.getDriver().switchTo().frame(iframeName);

     } catch (NoSuchFrameException e) {
         e.printStackTrace();
     }
     
 }
 
	
	
    public static void switchToChildWindow(String parentWindowHandle) {
        try {
            // Get all window handles
            Set<String> windowHandles = Driver.getDriver().getWindowHandles();

            // Switch to the child window
            for (String handle : windowHandles) {
                if (!handle.equals(parentWindowHandle)) {
                    Driver.getDriver().switchTo().window(handle);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception occurred while switching to child window: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    
    public static WebDriverWait getWaitObject() {
    	WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30);
    	return wait;
    }
   
    public static WebElement waitForClickability(WebElement element) {
    	
    	return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
    }
    
   public static WebElement waitForVisibility(WebElement element) {
    	
    	return getWaitObject().until(ExpectedConditions.visibilityOf(element));
    }
 
    
    public static void hoverOver(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();   	
    	
    }
    
    
    
    public static void dragAndDrop(WebElement element1, WebElement element2) {
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(element1,element2).build().perform();   	
    	
    }
    
    public static void doubleClick(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(element).build().perform();   	
    	
    }
    
    public static void refresh() {
        Driver.getDriver().navigate().refresh();
    }
    

    public static String getCurrentURL() {
    	return Driver.getDriver().getCurrentUrl();
    }
    
    
	public static void scrollDown(WebElement Element) {
		((JavascriptExecutor) Driver.getDriver()).
		executeScript("arguments[0].scrollIntoView(true);",Element );
	}
    

}
