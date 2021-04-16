package org.repository;

import org.base.LibGlobal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class Pojo extends LibGlobal {
	public  Pojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement txtEmail;
	
	@FindBy(id="password")
	private WebElement txtPass;
	
	@FindBy(name="login")
	private WebElement btnlogin;
	
	@FindBy(id="order_no")
	private WebElement orderNo;
	
	
	public WebElement getTxtloc() {
		
		return txtloc;
	}

	public WebElement getTxthotel() {
		return txthotel;
	}

	public WebElement getTxtroomtype() {
		return txtroomtype;
	}

	public WebElement getTxtroomnos() {
		return txtroomnos;
	}

	public WebElement getTxtadult() {
		return txtadult;
	}

	public WebElement getTxtchild() {
		return txtchild;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	@FindBy(id="location")
	private WebElement txtloc;
	
	@FindBy(id="hotels")
	private WebElement txthotel;
	
	@FindBy(id="room_type")
	private WebElement txtroomtype;
	
	@FindBy(id="room_nos")
	private WebElement txtroomnos;
	
	@FindBy(id="adult_room")
	private WebElement txtadult;
	
	@FindBy(id="child_room")
	private WebElement txtchild;
	
	
	@FindBy(id="Submit")
	private WebElement Submit;

	@FindBy(id="radiobutton_0")
	private WebElement radiobtn;

	@FindBy(id="continue")
	private WebElement continueBtn;

	@FindBy(id="first_name")
	private WebElement firname;

	@FindBy(id="last_name")
	private WebElement lastname;

	@FindBy(id="address")
	private WebElement addr;

	@FindBy(id="cc_num")
	private WebElement cardno;

	@FindBy(id="cc_type")
	private WebElement cardtype;

	@FindBy(id="cc_exp_month")
	private WebElement expmonth;
	

	@FindBy(id="cc_exp_year")
	private WebElement expyr;
	

	@FindBy(id="cc_cvv")
	private WebElement cvvno;
	
	@FindBy(id="book_now")
	private WebElement booknow;
	
	@FindBy(id="Submit")
	private WebElement search;
	
	@FindBy(name="logout")
	private WebElement logout;
	
	
		
	public WebElement getLogout() {
		return logout;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	

	public WebElement getSearch() {
		return search;
	}

	

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getFirname() {
		return firname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddr() {
		return addr;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyr() {
		return expyr;
	}

	public WebElement getCvvno() {
		return cvvno;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
}



