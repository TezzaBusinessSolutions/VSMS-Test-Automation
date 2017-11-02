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

WebUI.callTestCase(findTestCase('Common/User Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('Profile/Profile Menu'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Profile/Profile Page/select_title'), 'Mr', false)

WebUI.setText(findTestObject('Profile/Profile Page/FirstName'), var_firstName)

WebUI.setText(findTestObject('Profile/Profile Page/LastName'), var_lastName)

WebUI.setText(findTestObject('Profile/Profile Page/Job Title'), var_jobTitle)

WebUI.selectOptionByValue(findTestObject('Profile/Profile Page/Department'), 'number:101', false)

WebUI.setText(findTestObject('Profile/Profile Page/Phone'), var_phone)

WebUI.setText(findTestObject('Profile/Profile Page/Alt Phone'), var_altPhone)

WebUI.setText(findTestObject('Profile/Profile Page/Alt Email'), var_altEmail)

WebUI.setText(findTestObject('Profile/Profile Page/Address 1'), var_address1)

WebUI.setText(findTestObject('Profile/Profile Page/Address 2'), var_address2)

WebUI.setText(findTestObject('Profile/Profile Page/City'), var_city)

WebUI.selectOptionByValue(findTestObject('Profile/Profile Page/Country'), 'Kenya', false)

WebUI.selectOptionByValue(findTestObject('Profile/Profile Page/State'), 'Nairobi', false)

WebUI.delay(5)

WebUI.click(findTestObject('Profile/Profile Page/button_Update'))

WebUI.delay(5)

WebUI.closeBrowser()

