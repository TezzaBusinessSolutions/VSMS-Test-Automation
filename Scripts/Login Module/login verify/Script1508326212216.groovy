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

WebUI.openBrowser(findTestData('Login Credentials').getValue(1, 1))

WebUI.click(findTestObject('login/a_Log in'))



WebUI.setText(findTestObject('login/input_password'), wrongPassword)

WebUI.click(findTestObject('login/button_Login'))

WebUI.verifyElementPresent(findTestObject('exemption/strong_These credentials do no'), 5)

WebUI.setText(findTestObject('login/input_password'), wrongPassword)

WebUI.click(findTestObject('login/button_Login'))

WebUI.verifyElementPresent(findTestObject('exemption/strong_These credentials do no'), 5)

WebUI.setText(findTestObject('login/input_password'), wrongPassword)

WebUI.click(findTestObject('login/button_Login'))

WebUI.verifyElementPresent(findTestObject('exemption/strong_These credentials do no'), 5)

WebUI.setText(findTestObject('login/input_password'), wrongPassword)

WebUI.click(findTestObject('login/button_Login'))

WebUI.verifyElementPresent(findTestObject('exemption/strong_Too many login attempts'), 2)

WebUI.delay(120)

WebUI.setText(findTestObject('Login Page/input_email'), email)

WebUI.setText(findTestObject('login/input_password'), correctPassword)

WebUI.click(findTestObject('login/button_Login'))

WebUI.delay(2)

WebUI.closeBrowser()

