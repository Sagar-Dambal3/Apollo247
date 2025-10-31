package com.apollo247.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PharmacyModule {
	@Test
	public void orderMedicine() {
		Reporter.log("Medicine has been ordered",true);
	}
}
