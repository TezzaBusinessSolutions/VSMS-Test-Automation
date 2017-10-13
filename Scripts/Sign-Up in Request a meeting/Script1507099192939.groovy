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

WebUI.navigateToUrl('https://sandbox.vsms.tezzasolutions.com/index')

WebUI.click(findTestObject('Sign-Up in Request a Meeting/button_REQUEST A MEETING'))

WebUI.setText(findTestObject('Sign-Up in Request a Meeting/input_title'), 'Miss')

WebUI.setText(findTestObject('Sign-Up in Request a Meeting/input_firstname'), 'Shila')

WebUI.setText(findTestObject('Sign-Up in Request a Meeting/input_lastname'), 'Zahra')

WebUI.selectOptionByValue(findTestObject('Sign-Up in Request a Meeting/select_tenant_id'), '3', false)

WebUI.setText(findTestObject('Sign-Up in Request a Meeting/input_email'), 'dennisgituto1@gmail.com')

WebUI.setText(findTestObject('Sign-Up in Request a Meeting/input_password'), 'desteg')

WebUI.setText(findTestObject('Sign-Up in Request a Meeting/input_password_confirmation'), 'desteg')

WebUI.click(findTestObject('Sign-Up in Request a Meeting/button_Sign Up'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

