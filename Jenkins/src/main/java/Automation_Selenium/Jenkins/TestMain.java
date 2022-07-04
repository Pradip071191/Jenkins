package Automation_Selenium.Jenkins;

import org.testng.annotations.Test;

public class TestMain {

	@Test
	public void testInputIsEven(){
	assertTrue(Main.checkIfInputIsAnEvenNumber(23)); //Assertion
}

	
}