package com.junit.javabydeveloper;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

import com.junit.javabydeveloper.SurchargeTest;

@RunWith(JUnitPlatform.class)
@SelectClasses(SurchargeTest.class)
public class IncludeClass_TestSuite_Test {

}
