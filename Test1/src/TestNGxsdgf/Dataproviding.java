package TestNGxsdgf;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviding {
	@Test(dataProvider="dp")
	public void f(Integer n,String s) {
		System.out.println("In:"+n+"and s"+s);
		
	}
@BeforeMethod
public void beforemethod()
{
	
}
@DataProvider public Object[][]dp()

{
	return new Object[][]
			{
		new Object[] {1,"a"},
		new Object[] {2,"b"},};
			

}
}


