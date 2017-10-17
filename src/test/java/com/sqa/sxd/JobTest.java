package com.sqa.sxd;

import org.testng.annotations.*;

public class JobTest {

	int loopCount = 0;

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after method " + this.loopCount);
		this.loopCount++;
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before method " + this.loopCount);
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 3, "teach Java" }, new Object[] { 5, "watch Movies" }, };
	}

	@Test(dataProvider = "dp")
	public void f(Integer n, String s) {
		Job job = new Job();
		job.setJobTitle(s);
		job.setNumDaysWorkingPerWeek(n);
		job.doWork(s);
	}
}
