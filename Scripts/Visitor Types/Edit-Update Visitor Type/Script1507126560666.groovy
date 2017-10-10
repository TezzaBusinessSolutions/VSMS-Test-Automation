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

WebUI.callTestCase(findTestCase('LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Visitor Types/a_Modules'))

WebUI.click(findTestObject('Visitor Types/a_User  Management'))

WebUI.click(findTestObject('Visitor Types/a_User Settings'))
//WebUI.click(findTestObject(By.xpath("//*[contains(@href,'https://sandbox.vsms.tezzasolutions.com/admin/users/settings')]"))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Visitor Types/a_Manage Visitor Types'))

WebUI.verifyElementPresent(findTestObject('Visitor Types/legend_Visitor Types'), 10)

WebUI.click(findTestObject('edit visitor types/i_editvisitorbtn'))

WebUI.setText(findTestObject('edit visitor types/input_name'), 'existing')

WebUI.setText(findTestObject('edit visitor types/textarea_description'), 'existing visitors')


WebUI.click(findTestObject('Object Repository/edit visitor types/button_Update'))
WebUI.delay(5)

WebUI.closeBrowser()

