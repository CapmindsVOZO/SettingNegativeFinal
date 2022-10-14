package com.SettingNegative;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SettingsNegativecases extends Base_class {

	public static WebDriver driver = getbrowser("chrome");

	public static Pom_Class pom = new Pom_Class(driver);

	public static void main(String[] args) throws InterruptedException {

		// Driver Maximize and Url Launch

		// Driver Maximize and Url Launch

		geturl("https://ehr1.vozo.xyz:444/");

		// Enter Username
		sendkeys(pom.getinstance().getUsername(), "Admin3");

		// Enter Password
		sendkeys(pom.getinstance().getPassword(), "Admin@123");

		// Click Signin Button '
		Clickonelement(pom.getinstance().getSigninbtn());

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// Click SignIn Button '
		Clickonelement(pom.getSettingsNegativeCases1().getSigninbtn());

		// click Settings Module
		Clickonelement(pom.getSettingsNegativeCases1().getClickSettingsModule());

		Thread.sleep(4000);

		// click Settings Module
		// Clickonelement(pom.getSettingsNegativeCases1().getClickSettingsModule());

//		// Enter Password
//		//sendkeys(pom.getSettingsNegativeCases1().getEnterMobileNumber(), "capminds@03");
//					 
//		//click Settings Module
//		Clickonelement(pom.getSettingsNegativeCases1().getclickclinical()); 
//        
//		// Enter Password
//		sendkeys(pom.getSettingsNegativeCases1().getEnterMobileNPi(), "capminds@03");
//		
///User	
		
		Thread.sleep(6000);
		// click User
		Clickonelement(pom.getSettingsNegativeCases1().getclickUser());

		// click clickAddProvider
		Clickonelement(pom.getSettingsNegativeCases1().getclickAddProvider());
		Thread.sleep(4000);
		// click CheckForProvider
		Clickonelement(pom.getSettingsNegativeCases1().getclickCheckForProvider());

		// click close
		Clickonelement(pom.getSettingsNegativeCases1().getclickClose());

// Document	

		Thread.sleep(6000);

//		//click Features Button
//		//flag
//			WebDriverWait wait2 = new WebDriverWait(driver, 10);
//			WebElement element2 = wait2
//					.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='schedule-title m-t-10 f-s-16 for-set-nav-arrow2'])[1]")));
//			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element2);

//		//Clickonelement(pom.getSettingsNegativeCases1().getClickFeatures());		
//		
		// click Document Button
		Thread.sleep(3000);

		Clickonelement(pom.getSettingsNegativeCases1().getClickDocument());

		Thread.sleep(2000);
		// click Include Logo Radio Button
		Clickonelement(pom.getSettingsNegativeCases1().getClickRadioButton());

		// click Edit option
		Clickonelement(pom.getSettingsNegativeCases1().getClickEdit());

		// click Macro Clinicion Option
		Clickonelement(pom.getSettingsNegativeCases1().getClickClinicianOption());

		// click Macro Practice Option
		Clickonelement(pom.getSettingsNegativeCases1().getClickPracticeOption());

		// click Macro client Option
		Clickonelement(pom.getSettingsNegativeCases1().getClickClientOption());

		// click Macro Appointment Option
		Clickonelement(pom.getSettingsNegativeCases1().getClickAppointmentOption());

		// click Macro Links Option
		Clickonelement(pom.getSettingsNegativeCases1().getClickLinksOption());

		// Enter Subject
		sendkeys(pom.getSettingsNegativeCases1().getEnterSubject(), "Hi All");

		// click Cancel Option
		Clickonelement(pom.getSettingsNegativeCases1().getClickCancel());

//		//click SAVE Option
//		Clickonelement(pom.getSettingsNegativeCases1().getClickSave());  		

/////Statement 		

		// click Edit option
		Clickonelement(pom.getSettingsNegativeCases1().getClickEdit1());

		// click Macro Clinicion Option
		Clickonelement(pom.getSettingsNegativeCases1().getClickClinicianOption1());

		// click Macro Practice Option
		Clickonelement(pom.getSettingsNegativeCases1().getClickPracticeOption1());

		// click Macro client Option
		Clickonelement(pom.getSettingsNegativeCases1().getClickClientOption1());

		// click Macro Appointment Option
		Clickonelement(pom.getSettingsNegativeCases1().getClickAppointmentOption1());

		// click Macro Links Option
		Clickonelement(pom.getSettingsNegativeCases1().getClickLinksOption1());

		// Enter Subject
		sendkeys(pom.getSettingsNegativeCases1().getEnterSubject1(), "Hi All");

		// Enter MSG
		sendkeys(pom.getSettingsNegativeCases1().getEntermsg(), "good morning to all");

		// click Cancel Option
		Clickonelement(pom.getSettingsNegativeCases1().getClickCancel1());

//		//click SAVE Option
//		Clickonelement(pom.getSettingsNegativeCases1().getClickSave1());  		

//Superbills

//Default Superbill Email Edit option
		Clickonelement(pom.getSettingsNegativeCases1().getclcickEditOption3());

//click Macro Clinicion Option
		Clickonelement(pom.getSettingsNegativeCases1().getClickClinicianOption3());

//click Macro Practice Option
		Clickonelement(pom.getSettingsNegativeCases1().getClickPracticeOption3());

//click Macro client Option
		Clickonelement(pom.getSettingsNegativeCases1().getClickClientOption3());

//click Macro Appointment Option
		Clickonelement(pom.getSettingsNegativeCases1().getClickAppointmentOption3());

//click Macro Links Option
		Clickonelement(pom.getSettingsNegativeCases1().getClickLinksOption3());

//clear the already stored text
//ClearText(pom.getSettingsNegativeCases1().getclearSubject3());  

//click Cancel Option
		Clickonelement(pom.getSettingsNegativeCases1().getClickCancel3());

//click SAVE Option
//Clickonelement(pom.getSettings().getClickSave3());  		

		///// Billing And Service

		Thread.sleep(4000);
		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		WebElement clinical1 = wait4
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='schedule-title m-t-10 f-s-16 for-set-nav-arrow3'])[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", clinical1);

//click Billing and services Option
//		Clickonelement(pom.getSettingsNegativeCases1().getClickBilligandServices());

//click Services Button	
		Thread.sleep(2000);

		Clickonelement(pom.getSettingsNegativeCases1().getclickServicesbutton());

		Thread.sleep(2000);

//click Payer Search 
		Clickonelement(pom.getSettingsNegativeCases1().getClickPayerSearch());
		
		Thread.sleep(2000);

//click new payer
		Clickonelement(pom.getSettingsNegativeCases1().getClickNewpayer());

//click close
		Clickonelement(pom.getSettingsNegativeCases1().getClickclose());

//click schedule
		Clickonelement(pom.getSettingsNegativeCases1().getClickSchedule());

//click Calendorsettings
		Clickonelement(pom.getSettingsNegativeCases1().getClickCalendorsettings());

//click seelct time
		Clickonelement(pom.getSettingsNegativeCases1().getselecttime());

//click select week
		Clickonelement(pom.getSettingsNegativeCases1().getselectWeek());

//click select Dont show sundays
		Clickonelement(pom.getSettingsNegativeCases1().getselect2nd());

//click select save
		Clickonelement(pom.getSettingsNegativeCases1().getClickSavee());

		Thread.sleep(2000);
//click AppointmentRemainder
		Clickonelement(pom.getSettingsNegativeCases1().getClickAppointmentRemainder());

		Thread.sleep(4000);
		
//click enable button
		Clickonelement(pom.getSettingsNegativeCases1().getClickenablebutton());

		Thread.sleep(3000);
//click edit
		Clickonelement(pom.getSettingsNegativeCases1().getClickedit());

//click clinician
		Clickonelement(pom.getSettingsNegativeCases1().getClickclinician());

//click Practice
		Clickonelement(pom.getSettingsNegativeCases1().getClickPractice());

//click client
		Clickonelement(pom.getSettingsNegativeCases1().getClickclient());

//click Appointment(
		Clickonelement(pom.getSettingsNegativeCases1().getClickAppointment());

//click links
		Clickonelement(pom.getSettingsNegativeCases1().getClickLinks());
		
		Clickonelement(pom.getSettingsNegativeCases1().getClickSaves());


		
		
		
		
		
		
		
		
		
		
		
		

		// cli sche
//
//		WebDriverWait wait2 = new WebDriverWait(driver, 10);
//		WebElement sche = wait2
//				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Scheduling')]")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", sche);
//
//		// Clickonelement(pom.getSettingsNegativeCases1().getclische());
//
//		// cli app re
//
//		Thread.sleep(3000);
//
//		Clickonelement(pom.getSettingsNegativeCases1().getcliappre());
//
//		// sele voi
//		Thread.sleep(3000);
//
//		Clickonelement(pom.getSettingsNegativeCases1().getselevoi());
//
//		// sele rad
//
//		Clickonelement(pom.getSettingsNegativeCases1().getselerad());
//
//		// ed
//
//		Clickonelement(pom.getSettingsNegativeCases1().getclied());
//
//		// cli clie
//
//		Clickonelement(pom.getSettingsNegativeCases1().getcliclima());
//
//		// cli clie
//
//		Clickonelement(pom.getSettingsNegativeCases1().getclipra());
//
//		// cli clie
//
//		Clickonelement(pom.getSettingsNegativeCases1().getcliclie());
//
//		// cli clie
//
//		Clickonelement(pom.getSettingsNegativeCases1().getcliapp());
//
//		// cli clie
//
//		Clickonelement(pom.getSettingsNegativeCases1().getclili());
//
//		// cli clie ******
//
//		Clickonelement(pom.getSettingsNegativeCases1().getclisav());
//
//		// cli clie
//
//		Thread.sleep(5000);
//
//		Clickonelement(pom.getSettingsNegativeCases1().getclitex());
//
//		// sele rad
//
//		Thread.sleep(2000);
//		Clickonelement(pom.getSettingsNegativeCases1().getselerad1());
//
//		// ed
//
//		Clickonelement(pom.getSettingsNegativeCases1().getclied1());
//
//		// cli clie
//
//		Clickonelement(pom.getSettingsNegativeCases1().getcliclima());
//
//		// cli clie
//
//		Clickonelement(pom.getSettingsNegativeCases1().getclipra());
//
//		// cli clie
//
//		Clickonelement(pom.getSettingsNegativeCases1().getcliclie());
//
//		// cli clie
//
//		Clickonelement(pom.getSettingsNegativeCases1().getcliapp());
//
//		// cli clie
//
//		Clickonelement(pom.getSettingsNegativeCases1().getclili());
//
//		// cli clie
//
//		Clickonelement(pom.getSettingsNegativeCases1().getclisav());
//
//		// cli admi
//		Thread.sleep(4000);
//
//		Clickonelement(pom.getSettingsNegativeCases1().getcliad());
//
//		// cli erx
//		Thread.sleep(3000);
//
//		Clickonelement(pom.getSettingsNegativeCases1().getclier());
//
//		// cli admi
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettingsNegativeCases1().getcliedi());
//
//		// cli admi
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettingsNegativeCases1().getcliclo());
//
//		// add fav pre
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettingsNegativeCases1().getclifavp());
//
//		// *******
//		// cli sup
//
////		Thread.sleep(2000);
////
////		Clickonelement(pom.getSettings_Module().getclisup());
//
//		// fin med
//
//		sendkeys(pom.getSettingsNegativeCases1().getfinmed(), "a");
//
//		// sel med
//
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettingsNegativeCases1().getselmed1());
//
//		// sen di
//
//		sendkeys(pom.getSettingsNegativeCases1().getsendi1(), "10");
//
//		// mov com
//
//		Clickonelement(pom.getSettingsNegativeCases1().getclicom());
//
//		// clo com
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettingsNegativeCases1().getcliclo1());
//
//		// clo com
//		WebDriverWait wait3 = new WebDriverWait(driver, 10);
//		WebElement faphar = wait3.until(
//				ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Favorite Pharmacies')]")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", faphar);
//
//		// Clickonelement(pom.getSettingsNegativeCases1().getclifavpar());
//
//		// clo com
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getSettingsNegativeCases1().getaddphar());
//
//		// c;i re
//
//		Clickonelement(pom.getSettingsNegativeCases1().getclire());
//
//		// c;i re
//
//		sendkeys(pom.getSettingsNegativeCases1().getsenre(), "a");
//
//		// sear
//
//		Clickonelement(pom.getSettingsNegativeCases1().getserre());
//
//		// clo
//
//		Clickonelement(pom.getSettingsNegativeCases1().getclophar());

		
		
		
		
		
		
		
		
		
		
	}
}