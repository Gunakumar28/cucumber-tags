package pom.def;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.clas.LibGlobal;

public class AdactinPomClas extends LibGlobal {
	 public AdactinPomClas() {
		 PageFactory.initElements(driver, this);
		
	 }
	 @FindBy(xpath="//*[@id='username']")
		private WebElement txtusername;
		
		@FindBy(id="password")
		private WebElement txtPassword;
		
		@FindBy(xpath="//*[@id='login']")
		private WebElement btnLogin;
		
		@FindBy(xpath="//*[@id='location']")
		private WebElement txtLocation;
		
		@FindBy(xpath="//*[@id='hotels']")
		private WebElement txtHotelName;
		
		@FindBy(xpath="//*[@id='room_type']")
		private WebElement txtRoomType;
		
		@FindBy(xpath="//*[@id='room_nos']")
		private WebElement txtRoomNo;
		
		@FindBy(xpath="//*[@id='datepick_in']")
		private WebElement txtDatePick;
		
		@FindBy(xpath="//*[@id='datepick_out']")
		private WebElement txtDatePickOut;
		
		@FindBy(xpath="//*[@id='adult_room']")
		private WebElement txtAdultRoom;
		
		@FindBy(xpath="//*[@id='child_room']")
		private WebElement txtChildRoom;
		
		@FindBy(xpath="//*[@id='Submit']")
		private WebElement btnSubmit;
		
		@FindBy(xpath="//input[@id='radiobutton_0']")
		private WebElement rdnBtn;
		
		@FindBy(xpath="//*[@id='continue']")
		private WebElement btnContinue;
		
		@FindBy(id="first_name")
		private WebElement txtFirstname;
		
		@FindBy(id="last_name")
		private WebElement txtLastName;
		
		public WebElement getTxtusername() {
			return txtusername;
		}

		public WebElement getTxtPassword() {
			return txtPassword;
		}

		public WebElement getBtnLogin() {
			return btnLogin;
		}

		public WebElement getTxtLocation() {
			return txtLocation;
		}

		public WebElement getTxtHotelName() {
			return txtHotelName;
		}

		public WebElement getTxtRoomType() {
			return txtRoomType;
		}

		public WebElement getTxtRoomNo() {
			return txtRoomNo;
		}

		public WebElement getTxtDatePick() {
			return txtDatePick;
		}

		public WebElement getTxtDatePickOut() {
			return txtDatePickOut;
		}

		public WebElement getTxtAdultRoom() {
			return txtAdultRoom;
		}

		public WebElement getTxtChildRoom() {
			return txtChildRoom;
		}

		public WebElement getBtnSubmit() {
			return btnSubmit;
		}

		public WebElement getRdnBtn() {
			return rdnBtn;
		}

		public WebElement getBtnContinue() {
			return btnContinue;
		}

		public WebElement getTxtFirstname() {
			return txtFirstname;
		}

		public WebElement getTxtLastName() {
			return txtLastName;
		}

		public WebElement getTxtAddress() {
			return txtAddress;
		}

		public WebElement getTxtCcNum() {
			return txtCcNum;
		}

		public WebElement getTxtType() {
			return txtType;
		}

		public WebElement getTxtMonth() {
			return txtMonth;
		}

		public WebElement getTxtExpireYear() {
			return txtExpireYear;
		}

		public WebElement getTxtCvvNumber() {
			return txtCvvNumber;
		}

		public WebElement getBtnBookNow() {
			return btnBookNow;
		}

		public WebElement getTxtOrderNumber() {
			return txtOrderNumber;
		}
		@FindBy(xpath="//*[@id='address']")
		private WebElement txtAddress;
		
		@FindBy(xpath="//*[@id='cc_num']")
		private WebElement txtCcNum;
		
		@FindBy(xpath="//*[@id='cc_type']")
		private WebElement txtType;
		
		@FindBy(xpath="//*[@id='cc_exp_month']")
		private WebElement txtMonth;
		
		@FindBy(xpath="//*[@id='cc_exp_year']")
		private WebElement txtExpireYear;
		
		@FindBy(xpath="//*[@id='cc_cvv']")
		private WebElement txtCvvNumber;
		
		@FindBy(xpath="//*[@id='book_now']")
		private WebElement btnBookNow;
		
		@FindBy(xpath="//*[@id='order_no']")
		private WebElement txtOrderNumber;


}
