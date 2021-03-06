import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Common/User Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Calendar Management/Calendar Menu'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Calendar Management/Add new Event/New Event'))

WebUI.setText(findTestObject('Calendar Management/Add new Event/Title'), var_title)

WebUI.setText(findTestObject('Calendar Management/Add new Event/Start Date'), var_startDate)

WebUI.setText(findTestObject('Calendar Management/Add new Event/Start Time'), var_startTime)

WebUI.setText(findTestObject('Calendar Management/Add new Event/End Date'), var_endDate)

WebUI.setText(findTestObject('Calendar Management/Add new Event/End Time'), var_endTime)

WebUI.selectOptionByValue(findTestObject('Calendar Management/Add new Event/Location'), '', false)

WebUI.setText(findTestObject('Calendar Management/Add new Event/Description'), var_description)

WebUI.click(findTestObject('Calendar Management/Add new Event/Save Event Button'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Calendar Management/Add new Event/Verify an Event is Added/Event created successfully Message'), 
    0)

WebUI.delay(5)

WebUI.closeBrowser()

