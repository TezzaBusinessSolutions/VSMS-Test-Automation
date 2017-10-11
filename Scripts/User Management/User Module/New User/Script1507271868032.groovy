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

WebUI.click(findTestObject('User Management/Add New User/Module Dropdown Objects/Modules dropdown'))

WebUI.click(findTestObject('User Management/Add New User/Module Dropdown Objects/User Management Dropdown'))

WebUI.click(findTestObject('User Management/Add New User/Module Dropdown Objects/User Link'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('User Management/Add New User/Add New User Objects/Add New Button'))

WebUI.delay(5)

WebUI.setText(findTestObject('User Management/Add New User/Add New User Objects/input_firstname'), var_firstname)

WebUI.setText(findTestObject('User Management/Add New User/Add New User Objects/input_lastname'), var_lastname)

WebUI.setText(findTestObject('User Management/Add New User/Add New User Objects/input_job_title'), var_jobtitle)

WebUI.selectOptionByValue(findTestObject('User Management/Add New User/Add New User Objects/select_department_id'), 'number:71', 
    true)

WebUI.setText(findTestObject('User Management/Add New User/Add New User Objects/input_email3'), var_email)

WebUI.click(findTestObject('User Management/Add New User/Add New User Objects/div_selected-flag'))

WebUI.click(findTestObject('User Management/Add New User/Add New User Objects/li_country highlight'))

WebUI.setText(findTestObject('User Management/Add New User/Add New User Objects/input_phone'), var_phone)

WebUI.click(findTestObject('User Management/Add New User/Add New User Objects/input_is_staff'))

WebUI.click(findTestObject('User Management/Add New User/Add New User Objects/input_IsEnabled'))

WebUI.click(findTestObject('User Management/Add New User/Add New User Objects/button_Create User'))

WebUI.verifyElementPresent(findTestObject('User Management/Add New User/Add New User Objects/New user has been added successfully'), 
    5)

WebUI.closeBrowser()

