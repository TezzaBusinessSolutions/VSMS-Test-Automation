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

WebUI.navigateToUrl('https://sandbox.vsms.tezzasolutions.com/index')

WebUI.click(findTestObject('Create New User/Login Page Objects/a_Log in'))

WebUI.setText(findTestObject('Create New User/Login Page Objects/input_email'), 'clarinenyauncho@gmail.com')

WebUI.setText(findTestObject('Create New User/Login Page Objects/input_password'), 'changeme')

WebUI.click(findTestObject('Create New User/Login Page Objects/button_Login'))

WebUI.click(findTestObject('Create New User/Module Dropdown Objects/Modules dropdown'))

WebUI.click(findTestObject('Create New User/Module Dropdown Objects/User Management Dropdown'))

WebUI.click(findTestObject('Create New User/Module Dropdown Objects/a_User'))

WebUI.click(findTestObject('Create New User/Add New User Objects/a_Add New'))

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Create New User/Add New User Objects/input_firstname'), 'Chalo')

WebUI.setText(findTestObject('Create New User/Add New User Objects/input_lastname'), 'Chalo')

WebUI.setText(findTestObject('Create New User/Add New User Objects/input_job_title'), 'Tester')

WebUI.selectOptionByValue(findTestObject('Create New User/Add New User Objects/select_department_id'), 'number:71', true)

WebUI.setText(findTestObject('Create New User/Add New User Objects/input_email (3)'), 'chweyaacharles@gmail.com')

WebUI.click(findTestObject('Create New User/Add New User Objects/div_selected-flag'))

WebUI.click(findTestObject('Create New User/Add New User Objects/li_country highlight'))

WebUI.setText(findTestObject('Create New User/Add New User Objects/input_phone'), '0725165229')

WebUI.click(findTestObject('Create New User/Add New User Objects/input_is_staff'))

WebUI.click(findTestObject('Create New User/Add New User Objects/input_IsEnabled'))

WebUI.click(findTestObject('Create New User/Add New User Objects/button_Create User'))

WebUI.verifyElementPresent(findTestObject('Create New User/Add New User Objects/p_New user has been added succ'), 5)

WebUI.closeBrowser()

