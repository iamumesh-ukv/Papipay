package new_package_facebooklogin;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTryClass implements IRetryAnalyzer {

	int curent_count =0;
	int retry_count =1;

	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub

		if (curent_count<retry_count)
		{
			curent_count++;
			return true;
		}
		return false;
	}


}
