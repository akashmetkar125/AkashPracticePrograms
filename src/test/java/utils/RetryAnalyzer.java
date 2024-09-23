package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		int retryCount = 0;
	    final int maxRetryCount = 2;
	    
	    if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
		return false;
	}

}
