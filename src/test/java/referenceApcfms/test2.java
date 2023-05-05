package referenceApcfms;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ObjectRepository.OTPRpage;

import genericLibrary.BaseClass;
@Listeners(genericLibrary.ListenerImplementationClass.class)
public class test2 extends BaseClass{
	
	@Test
	public void apcfms()
	{
		OTPRpage page=new OTPRpage(driver);
		page.getFatherNameTb().sendKeys("apcfss");
		page.getCanndidateNameTb().sendKeys("123");
		Assert.fail();
//		String name=page.getMotherName().getText();
//		Assert.assertEquals(name, "apcfmf");
		//Assert.fail();
	}

}
