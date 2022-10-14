package com.SettingNegative;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsNegativeCases1 {

	public WebDriver driver;

	@FindBy(id = "normal_login_username")

	private WebElement username;

	public SettingsNegativeCases1(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}
	@FindBy(id = "normal_login_password")

	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath = "//button[@type='submit']")

	private WebElement signinbtn;

	public WebElement getSigninbtn() {
		return signinbtn;
	}
	@FindBy(xpath = "//a[text()='Settings']")
    private WebElement ClickSettingsModule;

    public WebElement getClickSettingsModule() {
	return ClickSettingsModule;
   }
    @FindBy(xpath = "//input[@name='phoneno']")
    private WebElement EnterMobileNumber;

    public WebElement getEnterMobileNumber() {
	return EnterMobileNumber;
   }
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]")
    private WebElement clickclinical;

    public WebElement getclickclinical() {
	return clickclinical;
   }
    @FindBy(xpath = "//input[@name='npinum']")
    private WebElement EnterMobileNPi;

    public WebElement getEnterMobileNPi() {
	return EnterMobileNPi;
   }
    @FindBy(xpath = "//a[@id='setting_nav_users']")
    private WebElement clickUseR;

    public WebElement getclickUser() {
	return clickUseR;
   }
    @FindBy(xpath = "//button[normalize-space()='Add User']")
    private WebElement clickAddProvider;

    public WebElement getclickAddProvider() {
	return clickAddProvider;
   }
    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/label[1]/span[1]/input[1]")
    private WebElement clickCheckForProvider;

    public WebElement getclickCheckForProvider() {
	return clickCheckForProvider;
   }
    @FindBy(xpath = "//button[contains(text(),'Close')]")
    private WebElement clickClose;

    public WebElement getclickClose() {
	return clickClose;
   }
    @FindBy(xpath = "(//div[@class='schedule-title m-t-10 f-s-16 for-set-nav-arrow2'])[1]")
    private WebElement ClickFeatures;

    public WebElement getClickFeatures() {
	return ClickFeatures;
   }	
    @FindBy(xpath = "//a[@id='setting_nav_document']")
    private WebElement ClickDocument;

    public WebElement getClickDocument() {
	return ClickDocument;
   }
    @FindBy(xpath = "(//input[@class='ant-checkbox-input'])[1]")
    private WebElement ClickRadioButton;

    public WebElement getClickRadioButton() {
	return ClickRadioButton;
   }
    @FindBy(xpath = "//div[@class='right-block m-l-250']//div[2]//div[5]//div[1]//textarea[1]")
    private WebElement EnterFooderInfo;

    public WebElement getEnterFooderInfo() {
	return EnterFooderInfo;
   }
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[3]/div[1]/button[1]")
    private WebElement ClickEdit;

    public WebElement getClickEdit() {
	return ClickEdit;
   }
    @FindBy(xpath = "(//select[contains(@class,'form-control')])[1]")
    private WebElement ClickClinicianOption;

    public WebElement getClickClinicianOption() {
	return ClickClinicianOption;
   }
    @FindBy(xpath = "(//select[contains(@class,'m-t-29 form-control')])[1]")
    private WebElement ClickPracticeOption;

    public WebElement getClickPracticeOption() {
	return ClickPracticeOption;
   }
    @FindBy(xpath = "(//select[contains(@class,'m-t-29 form-control')])[2]")
    private WebElement ClickClientOption;

    public WebElement getClickClientOption() {
	return ClickClientOption;
   }
    @FindBy(xpath = "(//select[contains(@class,'m-t-29 form-control')])[3]")
    private WebElement ClickAppointmentOption;

    public WebElement getClickAppointmentOption() {
	return ClickAppointmentOption;
   }
    @FindBy(xpath = "(//select[contains(@class,'m-t-29 form-control')])[4]")
    private WebElement ClickLinksOption;

    public WebElement getClickLinksOption() {
	return ClickLinksOption;
   }
    @FindBy(xpath = "(//textarea[@id='invoicemessage'])[1]")
    private WebElement EnterSubject;

    public WebElement getEnterSubject() {
	return EnterSubject;
   }
    @FindBy(xpath = "//button[text()='Cancel']")
    private WebElement ClickCancel;

    public WebElement getClickCancel() {
	return ClickCancel;
   } 
    @FindBy(xpath = "//button[text()='Save']")
    private WebElement ClickSave;

    public WebElement getClickSave() {
	return ClickSave;
   } 
    @FindBy(xpath = "//div[@class='sec_doc_marg_top_alt']//div[3]//div[1]//button[1]")
    private WebElement ClickEdit1;

    public WebElement getClickEdit1() {
	return ClickEdit1;
   }  
    @FindBy(xpath = "//select[@class='form-control']")
    private WebElement ClickClinicianOption1;

    public WebElement getClickClinicianOption1() {
	return ClickClinicianOption1;
   }   
    @FindBy(xpath = "//div[@class='modal-content']//div//div[2]//select[1]")
    private WebElement ClickPracticeOption1;

    public WebElement getClickPracticeOption1() {
	return ClickPracticeOption1;
   }  
    @FindBy(xpath = "//div[@class='m-t-10 form-row']//div[3]//select[1]")
    private WebElement ClickClientOption1;

    public WebElement getClickClientOption1() {
	return ClickClientOption1;
   }  
    @FindBy(xpath = "(//select[@class='m-t-29 form-control'])[3]")
    private WebElement ClickAppointmentOption1;

    public WebElement getClickAppointmentOption1() {
	return ClickAppointmentOption1;
   }   
    @FindBy(xpath = "(//select[@class='m-t-29 form-control'])[4]")
    private WebElement ClickLinksOption1;

    public WebElement getClickLinksOption1() {
	return ClickLinksOption1;
   }  
    @FindBy(xpath = "//input[@id='statemntsubject']")
    private WebElement EnterSubject1;

    public WebElement getEnterSubject1() {
	return EnterSubject1;
   } 
    @FindBy(xpath = "//textarea[@id='statemntmessage']")
    private WebElement Entermsg;

    public WebElement getEntermsg() {
	return Entermsg;
   }
    @FindBy(xpath = "//button[text()='Cancel']")
    private WebElement ClickCancel1;

    public WebElement getClickCancel1() {
	return ClickCancel1;
   }  
    @FindBy(xpath = "//button[text()='Save']")
    private WebElement ClickSave1;

    public WebElement getClickSave1() {
	return ClickSave1; 
    }
	@FindBy(xpath = "//div[@class='sec_doc_marg_top_alt']//div[3]//div[1]//button[1]")
    private WebElement clcickEditOption;

    public WebElement getclcickEditOption3() {
	return clcickEditOption;
   } 
    @FindBy(xpath = "//select[@class='form-control']")
    private WebElement ClickClinicianOption2;

    public WebElement getClickClinicianOption3() {
	return ClickClinicianOption2;
   }   
    @FindBy(xpath = "//div[@class='modal-content']//div//div[2]//select[1]")
    private WebElement ClickPracticeOption2;

    public WebElement getClickPracticeOption3() {
	return ClickPracticeOption2;
   }
    @FindBy(xpath = "//div[@class='m-t-10 form-row']//div[3]//select[1]")
    private WebElement ClickClientOption2;

    public WebElement getClickClientOption3() {
	return ClickClientOption2;
   } 
    @FindBy(xpath = "(//select[@class='m-t-29 form-control'])[3]")
    private WebElement ClickAppointmentOption2;

    public WebElement getClickAppointmentOption3() {
	return ClickAppointmentOption2;
   }  
    @FindBy(xpath = "(//select[@class='m-t-29 form-control'])[4]")
    private WebElement ClickLinksOption2;

    public WebElement getClickLinksOption3() {
	return ClickLinksOption2;
   }  
    @FindBy(xpath = "//input[@id='superbillsubject']")
    private WebElement clearSubject;

    public WebElement getclearSubject3() {
	return clearSubject;
   }  
    @FindBy(xpath = "//input[@id='superbillsubject']")
    private WebElement EnterSubject2;

    public WebElement getEnterSubject3() {
	return EnterSubject2;
   } 
    @FindBy(xpath = "//textarea[@id='superbillmessage']")
    private WebElement clearMsg;

    public WebElement getclearMsg3() {
	return clearMsg;
   }  
    @FindBy(xpath = "//textarea[@id='superbillmessage']")
    private WebElement Entermsg2;

    public WebElement getEntermsg3() {
	return Entermsg2;
    }
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    private WebElement ClickCancel2;

    public WebElement getClickCancel3() {
	return ClickCancel2;
   }  
    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement ClickSave2;

    public WebElement getClickSave3() {
	return ClickSave2;
   }  
	
	//////Billing and Services
	
	
    @FindBy(xpath = "//div[@id='setting_bill_service']")
    private WebElement ClickBilligandServices;

    public WebElement getClickBilligandServices(){
	return ClickBilligandServices;
   } 
    @FindBy(xpath = "//a[@id='setting_nav_services']")
    private WebElement clickServicesbutton;

    public WebElement getclickServicesbutton(){
	return clickServicesbutton;
   } 
    @FindBy(xpath = "//a[@id='setting_nav_payer']")
    private WebElement ClickPayerSearch;

    public WebElement getClickPayerSearch(){
	return ClickPayerSearch;
    }
    @FindBy(xpath = "//button[normalize-space()='New Payer']//*[name()='svg'][1]")
    private WebElement ClickNewpayer;

    public WebElement getClickNewpayer(){
	return ClickNewpayer;
    }
    @FindBy(xpath = "//button[normalize-space()='Close']")
    private WebElement Clickclose;

    public WebElement getClickclose(){
	return Clickclose;
    }
    @FindBy(xpath = "//div[@class='schedule-title m-t-10 f-s-16 for-set-nav-arrow4']")
    private WebElement ClickSchedule ;

    public WebElement getClickSchedule(){
	return ClickSchedule;
    }
    @FindBy(xpath = "//a[normalize-space()='Calendar Settings']")
    private WebElement ClickCalendorsettings ;

    public WebElement getClickCalendorsettings(){
	return ClickCalendorsettings;
    }
    @FindBy(xpath = "//select[@name='calendarfrom']//option[@value='9'][normalize-space()='09 AM']")
    private WebElement selecttime;

    public WebElement getselecttime(){
	return selecttime;
    }
    @FindBy(xpath = "//select[@name='calendarto']//option[@value='17'][normalize-space()='05 PM']")
    private WebElement selectEndtime;

    public WebElement getselectEndtime(){
	return selectEndtime;
    }
    @FindBy(xpath = "//option[@value='week']")
    private WebElement selectWeek;

    public WebElement getselectWeek(){
	return selectWeek;
    }
    @FindBy(xpath = "//option[@value=\"Don't show Sundays\"]")
    private WebElement select2nd;

    public WebElement getselect2nd(){
	return select2nd;
    }
    @FindBy(xpath = "//button[normalize-space()='Save information']")
    private WebElement ClickSave3;

    public WebElement getClickSavee(){
	return ClickSave3;
    }
    @FindBy(xpath = "//a[normalize-space()='Appointment Reminders']")
    private WebElement ClickAppointmentRemainder;

    public WebElement getClickAppointmentRemainder(){
	return ClickAppointmentRemainder;
    }  
    @FindBy(xpath = "//div[@class='ant-switch-handle']")
    private WebElement Clickenablebutton;

    public WebElement getClickenablebutton(){
	return Clickenablebutton;
    }
    @FindBy(xpath = "//button[@id='setting_email_editbtn']")
    private WebElement Clickedit;

    public WebElement getClickedit(){
	return Clickedit;
    }
    @FindBy(xpath = "(//option[@value=' {Clinician Full Name}'])[1]")
    private WebElement Clickclinician;

    public WebElement getClickclinician(){
	return Clickclinician;
    }
    @FindBy(xpath = "(//option[@value='{Practice Address}'])[1]")
    private WebElement ClickPractice;

    public WebElement getClickPractice(){
	return ClickPractice;
    }
    @FindBy(xpath = "(//option[@value='{Client Full Name}'])[1]")
    private WebElement Clickclient;

    public WebElement getClickclient(){
	return Clickclient;
    }
    @FindBy(xpath = "(//option[@value='{Appointment Start Time}'])[1]")
    private WebElement ClickAppointment;

    public WebElement getClickAppointment(){
	return ClickAppointment;
    }
    @FindBy(xpath = "(//option[@value='{Telehealth Zoom Link}'])[1]")
    private WebElement ClickLinks;

    public WebElement getClickLinks(){
	return ClickLinks;
    }
    
    @FindBy(xpath = "//button[normalize-space()='Save']")
    private WebElement ClickSaves;

    public WebElement getClickSaves(){
	return ClickSaves;
    }
/////////////// Voice ///////////////
@FindBy(xpath = "//div[@id='setting_reminder_tabs-tab-2']")

private WebElement voicear;

public WebElement getvoicear() {

return voicear;
}

@FindBy(xpath = "//button[@id='setting_voice_switch']")

private WebElement voicerad;

public WebElement getvoicerad() {

return voicerad;
}

@FindBy(xpath = "//button[@id='setting_voice_editbtn']")

private WebElement voiceedit;

public WebElement getvoiceedit() {

return voiceedit;
}
    @FindBy(xpath = "//button[@id='setting_voice_editbtn']")
    private WebElement Clickedit1;

    public WebElement getClickedit1(){
	return Clickedit1;
    }
    @FindBy(xpath = "//option[contains(@value,'{{last_name}}')]")
    private WebElement Clickclinician1;

    public WebElement getClickclinician1(){
	return Clickclinician1;
    }
    @FindBy(xpath = "//option[normalize-space()='Practice Full Name']")
    private WebElement ClickPractice1;

    public WebElement getClickPractice1(){
	return ClickPractice1;
    }
    @FindBy(xpath = "//option[normalize-space()='Client Home Number']")
    private WebElement Clickclient1;

    public WebElement getClickclient1(){
	return Clickclient1;
    }
    @FindBy(xpath = "//option[normalize-space()='Appointment Date Abbreviated']")
    private WebElement ClickAppointment1;

    public WebElement getClickAppointment1(){
	return ClickAppointment1;
    }
    @FindBy(xpath = "//option[contains(@value,'{{date}} {{today}} {{referring_doctor}}')]")
    private WebElement ClickLinks1;

    public WebElement getClickLinks1(){
	return ClickLinks1;
    }
    
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]")
    private WebElement ClickVoice;

    public WebElement getClickVoice(){
	return ClickVoice;
    }
    @FindBy(xpath = "//button[@class='ant-switch ant-switch-small switch-align-email ant-switch-checked']//div[@class='ant-switch-handle']")
    private WebElement Clickenablebutton1;

    public WebElement getClickenablebutton1(){
	return Clickenablebutton1;
    }
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]")
    private WebElement ClickText;

    public WebElement getClickText(){
	return ClickText;
    }
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]/div[2]/div[1]/button[1]/div[1]")
    private WebElement Clickenablebutton2;

    public WebElement getClickenablebutton2(){
	return Clickenablebutton2;
    }
	
	
	
	
    
    
    
   

	@FindBy(xpath = "(//a[normalize-space()='Settings'])[1]")

	private WebElement settneg;

	public WebElement getsettneg() {
		return settneg;
	}

	@FindBy(xpath = "(//div[@class='schedule-title m-t-10 f-s-16 for-set-nav-arrow4'])[1]")

	private WebElement clische;

	public WebElement getclische() {
		return clische;
	}

	@FindBy(xpath = "(//a[normalize-space()='Appointment Reminders'])[1]")

	private WebElement cliappre;

	public WebElement getcliappre() {
		return cliappre;
	}

	@FindBy(xpath = "(//div[contains(text(),'Voice')])[1]")

	private WebElement selevoi;

	public WebElement getselevoi() {
		return selevoi;
	}

	@FindBy(xpath = "(//div[contains(@class,'ant-switch-handle')])[2]")

	private WebElement selerad;

	public WebElement getselerad() {
		return selerad;
	}

	@FindBy(xpath = "(//button[contains(@type,'button')][normalize-space()='Edit'])[3]")

	private WebElement clied;

	public WebElement getclied() {

		return clied;
	}

	@FindBy(xpath = "(//select[@class='form-control'])[1]")

	private WebElement cliclima;

	public WebElement getcliclima() {

		return cliclima;
	}

	@FindBy(xpath = "(//select)[2]")

	private WebElement clipra;

	public WebElement getclipra() {

		return clipra;
	}

	@FindBy(xpath = "(//select)[2]")

	private WebElement cliclie;

	public WebElement getcliclie() {

		return cliclie;
	}

	@FindBy(xpath = "(//select)[4]")

	private WebElement cliapp;

	public WebElement getcliapp() {

		return cliapp;
	}

	@FindBy(xpath = "(//select)[5]")

	private WebElement clili;

	public WebElement getclili() {

		return clili;
	}

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")

	private WebElement clisav;

	public WebElement getclisav() {

		return clisav;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-1-tab-3'])[1]")

	private WebElement clitex;

	public WebElement getclitex() {

		return clitex;
	}

	@FindBy(xpath = "(//div[@class='ant-switch-handle'])[3]")

	private WebElement selerad1;

	public WebElement getselerad1() {

		return selerad1;
	}

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Edit'])[4]")

	private WebElement clied1;

	public WebElement getclied1() {

		return clied1;
	}

	@FindBy(xpath = "(//div[@class='schedule-title m-t-10 f-s-16 for-set-nav-arrow5'])[1]")

	private WebElement cliad;

	public WebElement getcliad() {

		return cliad;
	}

	@FindBy(xpath = "(//a[normalize-space()='eRx Settings'])[1]")

	private WebElement clier;

	public WebElement getclier() {

		return clier;
	}

	@FindBy(xpath = "(//*[name()='svg'][@class='fav-pr-ed-ic text-primary'])[1]")

	private WebElement cliedi;

	public WebElement getcliedi() {

		return cliedi;
	}

	@FindBy(xpath = "(//span[normalize-space()='�'])[1]")

	private WebElement cliclo;

	public WebElement getcliclo() {

		return cliclo;
	}

	@FindBy(xpath = "(//span[normalize-space()='Favourite Prescriptions'])[1]")

	private WebElement clifavp;

	public WebElement getclifavp() {

		return clifavp;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Find Medication'])[1]")

	private WebElement finmed;

	public WebElement getfinmed() {

		return finmed;
	}
	
	@FindBy(xpath = "(//div[contains(@class,'title')][normalize-space()='RETIN-A (Topical)'])[1]")

	private WebElement selmed1;

	public WebElement getselmed1() {

		return selmed1;
	}
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[4]")

	private WebElement sendi1;

	public WebElement getsendi1() {

		return sendi1;
	}
	

	@FindBy(xpath = "(//span[normalize-space()='Compound'])[1]")

	private WebElement clicom;

	public WebElement getclicom() {

		return clicom;
	}

	@FindBy(xpath = "(//span[normalize-space()='�'])[1]")

	private WebElement cliclo1;

	public WebElement getcliclo1() {

		return cliclo1;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-1-tab-2'])[1]")

	private WebElement clifavpar;

	public WebElement getclifavpar() {

		return clifavpar;
	}

	@FindBy(xpath = "(//button[normalize-space()='Add Pharmacies'])[1]")

	private WebElement addphar;

	public WebElement getaddphar() {

		return addphar;
	}

	@FindBy(xpath = "(//button[normalize-space()='Retail'])[1]")

	private WebElement clire;

	public WebElement getclire() {

		return clire;
	}

	@FindBy(xpath = "(//input[@class='form-control'])[1]")

	private WebElement senre;

	public WebElement getsenre() {

		return senre;
	}

	@FindBy(xpath = "(//span[@class='fv-ph-icon input-group-text'])[1]")

	private WebElement serre;

	public WebElement getserre() {

		return serre;
	}

	@FindBy(xpath = "(//span[@aria-hidden='true'])[1]")

	private WebElement clophar;

	public WebElement getclophar() {

		return clophar;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	
	
	
	
	
	}}
	

