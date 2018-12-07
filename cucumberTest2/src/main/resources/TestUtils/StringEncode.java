package TestUtils;

import org.codehaus.plexus.util.Base64;

public class StringEncode {
	
	
	public static void main(String[] args)
	{
		String password = "abhi_123";
		
		byte[] encodedPassword = Base64.encodeBase64(password.getBytes());
		System.out.println(new String(encodedPassword));
		
		
	}

}
