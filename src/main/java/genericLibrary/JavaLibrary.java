package genericLibrary;

import java.util.Date;
import java.util.Random;

/**
 * This class consist of generic methods related java
 * @author T Pavan Kumar
 *
 */
public class JavaLibrary {
	/**
	 * This method will generate random number for every execution.
	 * @return
	 */
	public int genarateRandomNumber()
	{
		Random random=new Random();
		return random.nextInt(500);
	}
	
	/***
	 * This method will generate the System date.
	 * @return
	 */
	public String getSystemDate()
	{
		Date date=new Date();
		String dateUtil=date.toString();
		return dateUtil;
	}
	
	/**
	 * This method is used to get system date in format.
	 * @return
	 */
	public String getSystemDateInFormat()
	{
		Date d=new Date();
		String split[]=d.toString().split(" ");
		String month=split[1];
		String date=split[2];
		String year=split[5];
		String day=split[0];
		String time=split[3].replace(":","-");
		String dateInFormat=date+"-"+month+"-"+year+"_"+time+"_"+day;
		return dateInFormat;
	}
	
	
}
