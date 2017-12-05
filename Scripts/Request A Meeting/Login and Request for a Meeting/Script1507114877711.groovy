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

WebUI.callTestCase(findTestCase('Request A Meeting/Request a Meeting Menu'), [('var_url') : findTestData('Request Meeting ').getValue(
            1, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Request A meeting/Login and Request Meeting/Login/Company Name'), '14', false)

WebUI.setText(findTestObject('Request A meeting/Login and Request Meeting/Login/Email address'), var_email)

WebUI.setText(findTestObject('Request A meeting/Login and Request Meeting/Login/Password'), var_password)

WebUI.click(findTestObject('Request A meeting/Login and Request Meeting/Login/Login Button'))

WebUI.delay(5)

WebUI.setText(findTestObject('Request A meeting/Login and Request Meeting/Requesting the Meeting/Staff Title'), var_staffTitle)

WebUI.setText(findTestObject('Request A meeting/Login and Request Meeting/Requesting the Meeting/Staff Firstname'), var_firstName)

WebUI.setText(findTestObject('Request A meeting/Login and Request Meeting/Requesting the Meeting/Staff Lastname'), var_lastName)

WebUI.setText(findTestObject('Request A meeting/Login and Request Meeting/Requesting the Meeting/Staff JobTitle'), var_staffJobTitle)

WebUI.setText(findTestObject('Request A meeting/Login and Request Meeting/Requesting the Meeting/Visit Purpose'), var_purpose)

WebUI.delay(5)

WebUI.click(findTestObject('Request A meeting/Login and Request Meeting/Requesting the Meeting/Send Button'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Request A meeting/Login and Request Meeting/Success Message/Success Message Meeting Request succesful'))

WebUI.delay(3)

WebUI.closeBrowser()

