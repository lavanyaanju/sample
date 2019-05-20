import org.hello.Beforeclass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test {
	@BeforeClass
	public void launch() {
		System.out.println("launch");
}
	@AfterMethod
	public void Endtime() {
		System.out.println("endtime");

	}
	@BeforeMethod
	public void starttime() {
		System.out.println("starttime");

	}
	
	@Test(invocationCount=3)
	public void atest1()
	{
		System.out.println("atest");
		Assert.assertTrue(true);

	}
	@Test(priority=2)
	public void Ztest() {
		System.out.println("ztest");
		Assert.assertTrue(true);

	}
	@Test(priority=3)
	public void ctest() {
		System.out.println("ctest");
		Assert.assertTrue(true);

	}
	@AfterClass
	public void close() {
		System.out.println("quit");

	}
	

	
	

}
