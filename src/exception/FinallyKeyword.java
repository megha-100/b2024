package exception;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class FinallyKeyword {
	//try-catch,multiple catch block,finally
	//catch-try
	//finally-try,try-catch,try-catch-catch
	//
	public static void main(String[] args) throws IOException {
	try {
	int a=1/0;
	//nested try-catch
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	}
//	catch(Exception e)
//	{
//		e.printStackTrace();
//	}
	//finally-is always executed weather we handled exception or not in a catch block
	//clean up code
	finally
	{
		
		System.out.println("in a finally block");
	}
	//use case
	/*make the connection with the db
	 * hit the sql query-try-catch
	 * result from database-try-catch
	 * display the data on ui-try-catch
	 * logout-try-catch
	 * finally{
	 * close the connection with the db
	 * }
	 */
	/*reading the data from excel sheet
	 * 
	 */
	URL url=new URL("https://www.google.com");
	HttpURLConnection Httpsurl = (HttpURLConnection) url.openConnection();
	Httpsurl.connect();
	
	System.out.println(Httpsurl.getResponseCode());
	Httpsurl.disconnect();

}
}
