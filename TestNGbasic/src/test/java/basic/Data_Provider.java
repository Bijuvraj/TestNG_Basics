package basic;

import org.testng.annotations.DataProvider;

public class Data_Provider {
	@DataProvider(name="Items")
	public Object[][] amazonProduct()
	{
		return new Object [][] {{"shoe"},{"watch"},{"phone"},{"headphones"}};
	}
	
	@DataProvider(name="UserNamePassword")
	public Object[][] login()
	{
		return new Object [][] {{"usrname1","pass1"},{"usrnm3","pass3"}};
	}
	@DataProvider(name="Amazonlogin")
	public Object[][] amazonlogin()
	{
		return new Object [][] {{"usrname1","pass1"},{"usrnm3","pass3"},{"usrnm2","paswd2"}};
	}
	
	@DataProvider(name="FormSubmit")
	public Object[][] submitData()
	{
		return new Object [][] {{"Biju","V","qwert","Tvm","Kerala","123455"},{"Aji","Jo","ghty","KK","TN","567676"}};
	}
}
