package org.apache.commons.mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import junit.framework.TestCase;

public class EmailTest extends TestCase{
	Email testEmail;
	public void setUp() {
		testEmail = new SimpleEmail();
	}
	public void testAddEmpty() throws EmailException {
		System.out.println("This is a message from the template test by scc628.");
		String[] emails = {}
		try{
			testEmail.addBcc(emails);
			fail("Fail to throw exceptions")
			
		}catch(emailException e){
			
		}
	}

}
