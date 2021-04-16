package org.newadactin;

import java.io.IOException;

import org.base.LibGlobal;

import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends LibGlobal {
	@Before
	public void beforeScenario() {
		launchBrowser();
		maxWindow();
		applyWaitTimeForAllLocs();
		removeAlCookies();
	}
	@After
	public  void afterSceanario(Scenario s) throws IOException {
		String name = s.getName();
		String filename = name.replace("", "");
		takeSnap(filename);
		closeBrowser();
		}
	
		@Before("@Sanity")
		private void beforeSantity() {
		System.out.println("Santiy sceranio stars");

		}
	
		@Before("@Regression")
		private void beforeRegression() {
			System.out.println("Regression Scenario Stars");

		}
		@After("@Sanity")
		private void afterSanity() {
		System.out.println("Santiy sceranio stars");

		}
	
		@After("@Regression")
		private void afterRegression() {
			System.out.println("Regression Scenario Stars");
		}
			@After(order=3)
			public void after3 () {
				System.out.println("Order3 @AfterRunning");
			}

			@After(order=1)
			public void after1() {
				System.out.println("Order1 @AfterRunning");
			}

			@After(order=2)
			public void after2 () {
				System.out.println("Order2 @AfterRunning");
			}
			

			@Before(order=3)
			public void before3 () {
				System.out.println("Order3 @BeforeRunning");
			}

			@Before(order=1)
			public void before1() {
				System.out.println("Order1 @BeforeRunning");
			}

			@Before(order=2)
			public void before2 () {
				System.out.println("Order2 @BeforeRunning");
			}

			
		}

	


