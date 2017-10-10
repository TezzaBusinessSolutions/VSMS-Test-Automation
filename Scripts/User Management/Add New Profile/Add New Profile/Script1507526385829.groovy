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

WebUI.navigateToUrl(GlobalVariable.var_URL)

WebUI.click(findTestObject('User Management/Add New User/Login Page Objects/a_Log in'))

WebUI.setText(findTestObject('User Management/Add New User/Login Page Objects/input_email'), GlobalVariable.var_Loginemail)

WebUI.setText(findTestObject('User Management/Add New User/Login Page Objects/input_password'), GlobalVariable.var_Password)

WebUI.click(findTestObject('User Management/Add New User/Login Page Objects/button_Login'))

WebUI.click(findTestObject('User Management/Add New User/Module Dropdown Objects/Modules dropdown'))

WebUI.click(findTestObject('User Management/Add New User/Module Dropdown Objects/User Management Dropdown'))

WebUI.click(findTestObject('User Management/Add New Profile/Profile Link/a_Profile'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('User Management/Add New Profile/Add New Profile/a_Add New'))

WebUI.delay(5)

WebUI.setText(findTestObject('User Management/Add New Profile/Add New Profile/input_profilename'), var_profilename)

WebUI.setText(findTestObject('User Management/Add New Profile/Add New Profile/textarea_profiledescription'), var_profiledesc)

WebUI.click(findTestObject('User Management/Add New Profile/Add New Profile/button_Save'))

WebUI.click(findTestObject('User Management/Add New Profile/Add New Profile/New profile has been added successfully'))

WebUI.delay(3)

WebUI.closeBrowser()

