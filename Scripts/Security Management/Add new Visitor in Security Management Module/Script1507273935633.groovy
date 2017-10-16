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

WebUI.callTestCase(findTestCase('LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('Dashboard Page/a_Modules'))

WebUI.click(findTestObject('Dashboard Page/a_Security Management'))

WebUI.click(findTestObject('Dashboard Page/a_Security'))

WebUI.click(findTestObject('Add Visitor Page/New Visitor Button'))

WebUI.setText(findTestObject('Add Visitor Page/input_email'), var_email)

WebUI.setText(findTestObject('Add Visitor Page/input_first_name'), var_firstName)

WebUI.setText(findTestObject('Add Visitor Page/input_last_name'), var_lastName)

WebUI.setText(findTestObject('Add Visitor Page/input_phone'), var_phone)

WebUI.delay(5)

WebUI.click(findTestObject('Add Visitor Page/button_Add Visitor'))

WebUI.delay(5)

WebUI.closeBrowser()

