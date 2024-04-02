package com.TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class WorkingWithTestNG {
	
	//Executes Sequentially 3 times(For Sequential Run)
	@Test(invocationCount = 3)
	public void cart()
	{
		Reporter.log("Add to cart...",true);
		
	}
	
	// 4 Threads will be created and executes parallel 3 times(For Parallel Execution)
	@Test(threadPoolSize = 4)
	public void wishList()
	{
		Reporter.log("Add to cart...",true);
		
	}
	// 4 Threads will be created and executes parallel 3 times(For Parallel Execution)
	@Test(invocationCount = 3,threadPoolSize = 4) 
	public void order()
	{
		Reporter.log("Add to cart...",true);
		
	}
	
	
	@Test(priority = 2)
	public void search()
	{
		Reporter.log("Hello TestNG",true);
		
	}
	
	@Test(priority = 1)
	public void login()
	{
		Reporter.log("Hello TestNG",true);
		
	}
	
	
	
}
