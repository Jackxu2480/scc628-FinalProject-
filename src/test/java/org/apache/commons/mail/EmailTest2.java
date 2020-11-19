package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

public class EmailTest2 extends TestCase{
	Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	public void testAddNull() throws EmailException {
		System.out.println("This is a message from the template test.");
		String[] emails = null;
		try{
			testEmail.addBcc(emails);
			fail("Fail to throw excetption");
			
		}catch(EmailException e){
			
		}
	}

}
