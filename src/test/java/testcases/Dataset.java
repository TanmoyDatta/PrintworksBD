package testcases;

import org.testng.annotations.DataProvider;

public class Dataset {
	
	@DataProvider(name = "ValidCredensial")
	public static Object dataset() {
		Object [][] objects = {{"tanmoycse3@gmail.com","pass123#"}
	};
		return objects;
	}
}