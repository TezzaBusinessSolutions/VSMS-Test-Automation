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

WebUI.openBrowser('')

WebUI.navigateToUrl(var_url)

WebUI.maximizeWindow()

WebUI.acceptAlert()

WebUI.click(findTestObject('Request A meeting/Request meeting Page/button_REQUEST A MEETING'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Request A meeting/Login and Request a Meeting/select_tenant_id'), '3', false)

WebUI.setText(findTestObject('Request A meeting/Login and Request a Meeting/input_email'), var_email)

WebUI.setText(findTestObject('Request A meeting/Login and Request a Meeting/input_password'), var_password)

WebUI.click(findTestObject('Request A meeting/Login and Request a Meeting/button_Login'))

WebUI.delay(5)

WebUI.setText(findTestObject('Request A meeting/Login and Request a Meeting/input_staff_title'), var_staffTitle)

WebUI.setText(findTestObject('Request A meeting/Login and Request a Meeting/input_staff_firstname'), var_firstName)

WebUI.setText(findTestObject('Request A meeting/Login and Request a Meeting/input_staff_lastname'), var_lastName)

WebUI.setText(findTestObject('Request A meeting/Login and Request a Meeting/input_staff_jobtitle'), var_staffJobTitle)

WebUI.setText(findTestObject('Request A meeting/Login and Request a Meeting/textarea_purpose'), var_purpose)

WebUI.delay(5)

WebUI.click(findTestObject('Request A meeting/Login and Request a Meeting/button_Send'))

WebUI.closeBrowser()

