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

WebUI.click(findTestObject('Property Management/Property/Modules'))

WebUI.click(findTestObject('Property Management/Property/Property Management'))

WebUI.click(findTestObject('Property Management/Property/Property'))

WebUI.delay(5)

WebUI.click(findTestObject('Property Management/Add New Property/button_Add New'))

WebUI.delay(5)

WebUI.setText(findTestObject('Property Management/Add New Property/property_name'), var_propertyname)

WebUI.selectOptionByLabel(findTestObject('Property Management/Add New Property/property_type_id'), var_propertytype, false)

WebUI.setText(findTestObject('Property Management/Add New Property/property_address1'), var_propertyaddress1)

WebUI.setText(findTestObject('Property Management/Add New Property/property_address2'), var_propertyaddress2)

WebUI.setText(findTestObject('Property Management/Add New Property/property_city'), var_propertycity)

WebUI.selectOptionByValue(findTestObject('Property Management/Add New Property/property_country'), var_property_country, 
    false)

WebUI.selectOptionByValue(findTestObject('Property Management/Add New Property/property_state'), var_propertystate, false)

WebUI.delay(5)

WebUI.click(findTestObject('Property Management/Add New Property/button_Add'))

