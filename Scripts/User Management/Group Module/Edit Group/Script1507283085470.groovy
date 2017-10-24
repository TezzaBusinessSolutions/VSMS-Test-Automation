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

WebUI.callTestCase(findTestCase('Common/LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('User Management/Add New User/Module Dropdown Objects/Modules dropdown'))

WebUI.click(findTestObject('User Management/Add New User/Module Dropdown Objects/User Management Dropdown'))

WebUI.click(findTestObject('User Management/Add New Group/Group Module Selection/Group Module'))

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('User Management/Edit Group/Edit Group Details/a_Automation'))

WebUI.delay(10)

WebUI.setText(findTestObject('User Management/Edit Group/Edit Group Details/Groupname Input Field'), var_gpname)

WebUI.click(findTestObject('User Management/Edit Group/Edit Group Details/button_Update'))

WebUI.verifyElementPresent(findTestObject('User Management/Edit Group/Edit Group Details/Updated Automation1 successfully'), 
    3)

WebUI.closeBrowser()

