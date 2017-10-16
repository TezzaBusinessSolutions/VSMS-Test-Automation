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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Visitor Management/common objects/a_Modules'))

WebUI.click(findTestObject('Visitor Management/common objects/a_Visitor Management'))

WebUI.click(findTestObject('Visitor Management/common objects/a_Visitor'))

WebUI.click(findTestObject('Visitor Management/Add Visitor/button_Add New'))

WebUI.setText(findTestObject('Visitor Management/Add Visitor/Page_Visitor Security Management Sy/input_first_name'), var_firstname)

WebUI.setText(findTestObject('Visitor Management/Add Visitor/visitor_last_name'), var_lastname)

WebUI.selectOptionByValue(findTestObject('Visitor Management/Add Visitor/visitor_gender'), var_gender, false)

WebUI.setText(findTestObject('Visitor Management/Add Visitor/visitor_email'), var_email)

WebUI.setText(findTestObject('Visitor Management/Add Visitor/visitor_phone'), var_phoneNumber)

WebUI.selectOptionByLabel(findTestObject('Visitor Management/Add Visitor/visitor_type'), var_visitorType, false)

WebUI.setText(findTestObject('Visitor Management/Add Visitor/Visitor_company_name'), var_companyName)

WebUI.setText(findTestObject('Visitor Management/Add Visitor/Visitor city'), var_city)

WebUI.selectOptionByValue(findTestObject('Visitor Management/Add Visitor/visitor_country'), var_country, false)

WebUI.selectOptionByValue(findTestObject('Visitor Management/Add Visitor/visitor_state'), var_state, false)

WebUI.setText(findTestObject('Visitor Management/Add Visitor/visitor_address1'), var_address1)

WebUI.setText(findTestObject('Visitor Management/Add Visitor/visitor_address2'), var_address2)

WebUI.delay(3)

WebUI.click(findTestObject('Visitor Management/Add Visitor/Save Visitor'))

WebUI.closeBrowser()

