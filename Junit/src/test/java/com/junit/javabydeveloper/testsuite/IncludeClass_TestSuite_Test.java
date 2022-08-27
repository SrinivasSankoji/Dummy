package com.junit.javabydeveloper.testsuite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

import com.junit.javabydeveloper.payment.SurchargeTest;

@RunWith(JUnitPlatform.class)
@SelectClasses(SurchargeTest.class)
public class IncludeClass_TestSuite_Test {

}
