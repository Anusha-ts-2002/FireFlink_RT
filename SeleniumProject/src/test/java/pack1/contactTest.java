package pack1;

import org.testng.annotations.Test;

//using maven profiling an parameter in cmd line to run the suite in pom.xml and in cmd line by usng -Durl=value -Dun=manager
public class contactTest {

	@Test
	public void createContact()
	{
		
		
		String Url = System.getProperty("url");
		String Browser=System.getProperty("browser", "chrome");//default data is chrome
		String Username = System.getProperty("username");
		String Password=System.getProperty("password");
		
		System.out.println(Url);
		System.out.println(Browser);
		System.out.println(Username);

		System.out.println("Contact Created");
	}
	@Test
	public void createContactWithDate()
	{
		System.out.println("Contact Created with Date");
	}
}
