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

WebUI.openBrowser('')

WebUI.navigateToUrl(var_url)

WebUI.click(findTestObject('Creating New Account/Login Link/a_Log in'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Creating New Account/Dont have account link/a_Dont have an account'))

WebUI.click(findTestObject('Creating New Account/Subscribe/a_Subscribe'))

WebUI.setText(findTestObject('Creating New Account/Sign Up/input_tenant_name'), var_tenantname)

WebUI.setText(findTestObject('Creating New Account/Sign Up/input_first_name'), var_firstname)

WebUI.setText(findTestObject('Creating New Account/Sign Up/input_last_name'), var_lastname)

WebUI.setText(findTestObject('Creating New Account/Sign Up/input_tenant_email'), var_email)

WebUI.setText(findTestObject('Creating New Account/Sign Up/input_tenant_phone'), var_phone)

WebUI.delay(5)

WebUI.click(findTestObject('Creating New Account/Sign Up/span_select2-selection__arrow'))

WebUI.setText(findTestObject('Creating New Account/Sign Up/input_select2-search__field'), var_timezone)

WebUI.click(findTestObject('Creating New Account/Sign Up/li_AfricaNairobi - (UTC0300) N'))

WebUI.selectOptionByValue(findTestObject('Creating New Account/Sign Up/select_currency'), 'KES', true)

WebUI.click(findTestObject('Creating New Account/Sign Up/input_terms'))

WebUI.click(findTestObject('Creating New Account/Sign Up/button_Subscribe'))

WebUI.delay(6)

WebUI.closeBrowser()

