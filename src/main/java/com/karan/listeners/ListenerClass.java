/**
 * 
 */
package com.karan.listeners;

import java.util.Arrays;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static com.karan.enums.LogType.*;
import static com.karan.reports.FrameworkLogger.log;

import com.karan.annotations.FrameworkAnnotation;
import com.karan.reports.ExtentReport;

/**
 * @author karansonkar
 *
 */
public class ListenerClass implements ITestListener, ISuiteListener{
	
	/**
	 * Initialise the reports with the file name
	 * @see com.karan.reports.ExtentReport
	 */
	@Override
	public void onStart(ISuite suite) {
			ExtentReport.initReports();
	}

	/**
	 * Terminate the reports
	 * @see com.karan.reports.ExtentReport
	 */
	@Override
	public void onFinish(ISuite suite) {
			ExtentReport.flushReports();
			
	}

	/**
	 * Starts a test node for each testng test
	 * @see com.karan.reports.ExtentReport
	 * @see com.karan.annotations.FrameworkAnnotation
	 */
	@Override
	public void onTestStart(ITestResult result) {
	
		ExtentReport.createTest(result.getMethod().getDescription());
		ExtentReport.addAuthors(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameworkAnnotation.class)
			.author());
		ExtentReport.addCategories(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameworkAnnotation.class)
			.category());
	}

	/**
	 * Marks the test as pass and logs it in the report
	 * @see com.karan.reports.FrameworkLogger
	 */
	@Override
	public void onTestSuccess(ITestResult result) {
		//ExtentLogger.pass(result.getMethod().getMethodName() +" is passed");
		log(PASS,result.getMethod().getMethodName() +" is passed");
	}

	/**
	 * Marks the test as fail,append base64 screenshot and logs it in the report
	 * @see com.karan.reports.FrameworkLogger
	 * @see com.karan.utils.ScreenshotUtils
	 */
	@Override
	public void onTestFailure(ITestResult result) {
			log(FAIL,result.getMethod().getMethodName() +" is failed");
			log(FAIL,result.getThrowable().toString());
			log(FAIL,Arrays.toString(result.getThrowable().getStackTrace()));
	}

	/**
	 * Marks the test as skip and logs it in the report
	 * @see com.karan.reports.FrameworkLogger
	 */
	@Override
	public void onTestSkipped(ITestResult result) {
		//ExtentLogger.skip(result.getMethod().getMethodName() +" is skipped");
		log(SKIP,result.getMethod().getMethodName() +" is skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		/*
		 * For now, we are not using this.
		 */
	}

	@Override
	public void onStart(ITestContext context) {
		/*
		 * We are having just one test in our suite. So we dont have any special implementation as of now
		 */
	}

	@Override
	public void onFinish(ITestContext context) {
		/*
		 * We are having just one test in our suite. So we dont have any special implementation as of now
		 */
		
	}

}
