package com.testclass;

import org.testng.annotations.Test;
import com.utility.NewExcelLibrary;

public class ExcelTest {

	NewExcelLibrary obj = new NewExcelLibrary("F:\\MWS\\ExcelLibrary\\TestData\\TestData.xlsx");

	@Test(priority = 1)
	public void testCase1() {
		int totalRows = obj.getRowCount("Items");
		System.out.println("Total rows: " + totalRows);
	}

	@Test(priority = 2)
	public void testCase2() {
		String salary = obj.getCellData("Items", "Item", 4);
		System.out.println("Item is: " + salary);
	}

	@Test(priority = 3)
	public void testCase3() {
		String rating = obj.getCellData("Items", 4, 5);
		System.out.println("Unit is: " + rating);
		int a = 1;
		Double sum = Double.valueOf(rating) + a;
		System.out.println("The Unit is now: " + sum);
	}

	@Test(priority = 4)
	public void testCase4() {
		obj.setCellData("Items", "Units", 2, "105");
	}
}