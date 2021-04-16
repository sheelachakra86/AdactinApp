package org.newadactin;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.base.LibGlobal;
import org.repository.Pojo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinHotel extends LibGlobal {
	public static Pojo p;

	@Given("User is in Adactin Hotel login page")
	public void user_is_in_Adactin_Hotel_login_page() {
		launchBrowser();
		loadUrl("https://adactinhotelapp.com/");
		maxWindow();

	}

	@When("User enter valid username and password")
	public void user_enter_valid_username_and_password(DataTable d) {
		p = new Pojo();
		List<String> li = d.asList();
		String user = li.get(0);
		String pass = li.get(1);
		fill(p.getTxtEmail(), user);
		fill(p.getTxtPass(), pass);

	}

	@When("User click login button")
	public void user_click_login_button() {
		btnClick(p.getBtnlogin());

	}

	@When("User select {string},{string},{string},{string},{string},{string}and Click SearchButton")
	public void user_select_and_Click_SearchButton(String string, String string2, String string3, String string4,
			String string5, String string6) throws IOException {

		System.out.println("location value is" + string);
		fill(p.getTxtloc(), string);
		fill(p.getTxthotel(), string2);
		fill(p.getTxtroomtype(), string3);
		fill(p.getTxtroomnos(), string4);
		fill(p.getTxtadult(), string5);
		fill(p.getTxtchild(), string6);
		p.getSearch().click();
	}

	@When("User select the hotel and click continue")
	public void user_select_the_hotel_and_click_continue() {
		p.getRadiobtn().click();
		p.getContinueBtn().click();

	}

	@When("User enters {string},{string},{string},{string},{string},{string},{string},{string}and click book now")
	public void user_enters_and_click_book_now(String string, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8) throws InterruptedException {

		fill(p.getFirname(), string);
		fill(p.getLastname(), string2);
		fill(p.getAddr(), string3);
		fill(p.getCardno(), string4);
		fill(p.getCardtype(), string5);
		fill(p.getExpmonth(), string6);
		fill(p.getExpyr(), string7);
		fill(p.getCvvno(), string8);

		p.getBooknow().click();
		
		Thread.sleep(9000);
	}

	@Then("User should be in confirmation page")
	public void user_should_be_in_confirmation_page() throws IOException {
		takeSnap("booked");
		System.out.println("OrderNo "+p.getOrderNo().getAttribute("value"));
		p.getLogout().click();
		System.out.println("Done");

	}

}
