import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Object Repository/Billing page/Page_Adit App/mat-icon_settings'))

WebUI.click(findTestObject('Object Repository/Billing page/Page_Adit App/span_Admin Panel'))

WebUI.click(findTestObject('Object Repository/Billing page/Page_Adit App/a_Billing keyboard_arrow_right'))

WebUI.verifyElementPresent(findTestObject('Billing page/Page_Adit App/h2_Billing  navigate_next Overview'), 0)

WebUI.verifyElementPresent(findTestObject('Billing page/Page_Adit App/span_Billing Preference'), 0)

WebUI.verifyElementPresent(findTestObject('Billing page/Page_Adit App/span_Organization Level Billing'), 0)

WebUI.verifyElementPresent(findTestObject('Billing page/Page_Adit App/span_Location Level Billing'), 0)

WebUI.verifyElementPresent(findTestObject('Billing page/Page_Adit App/p_Generates a single invoice for the entire organization with any number of locations. Also, only one payment method is allowed for the entire organization'), 
    0)

WebUI.verifyElementPresent(findTestObject('Billing page/Page_Adit App/p_Generates multiple invoices for each location. Also, different payment methods are allowed for each location'), 
    0)

WebUI.verifyElementPresent(findTestObject('Billing page/Page_Adit App/div_test org1'), 0)

WebUI.verifyElementPresent(findTestObject('Billing page/Page_Adit App/h2_Payment Method'), 0)

WebUI.verifyElementPresent(findTestObject('Billing page/Page_Adit App/button_Add Card'), 0)

WebUI.verifyElementPresent(findTestObject('Billing page/Page_Adit App/span_Add Card'), 0)

WebUI.verifyElementPresent(findTestObject('Billing page/Page_Adit App/div_Recent Payments'), 0)

WebUI.verifyElementPresent(findTestObject('Billing page/Page_Adit App/div_View Historical Payments'), 0)

WebUI.verifyElementPresent(findTestObject('Billing page/Page_Adit App/h3_Payment - Dec 27, 2023 - Demo1111'), 0)

WebUI.verifyElementPresent(findTestObject('Billing page/Page_Adit App/span_Testloaf - Invoice 59159'), 0)

WebUI.verifyElementPresent(findTestObject('Billing page/Page_Adit App/span_12272023'), 0)

WebUI.verifyElementPresent(findTestObject('Billing page/Page_Adit App/span_Success'), 0)

WebUI.verifyElementPresent(findTestObject('Billing page/Page_Adit App/div_9.439.43'), 0)

