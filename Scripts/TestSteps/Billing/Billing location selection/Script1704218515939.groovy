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

WebUI.click(findTestObject('Object Repository/Billing location selection1/Page_Adit App/mat-icon_settings'))

WebUI.click(findTestObject('Object Repository/Billing location selection1/Page_Adit App/span_Admin Panel'))

WebUI.click(findTestObject('Object Repository/Billing location selection1/Page_Adit App/a_Billing keyboard_arrow_right'))

WebUI.click(findTestObject('Object Repository/Billing location selection1/Page_Adit App/button_V2'))

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/h2_Billing  navigate_next V2'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/th_Item'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/th_Details'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_Call Tracking'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_30.00'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_Numbers Usage'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_0.00'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_Total Numbers (15) - 0 Additional Numbers'), 
    0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_Call Minutes Usage'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_Total Minutes (0500) - 0 Minutes Overage'), 
    0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/td_0.00'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_SMS Usage'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_Total SMS (220) - 22 SMS Overage'), 
    0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/td_0.22'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_Video Minutes Usage'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_Total Video Minutes (0100) - 0 Minutes Overage'), 
    0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/td_0.00'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/td_Email Usage'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_Total Email (020000) - 0 Email Overage'), 
    0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_0.00'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_Monthly Subscription Total'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_30.22'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_Bill Cycle'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_31 Days'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/td_30.22'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_Promo Code'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_-0.00'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_Gross Total'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_Tax(8.25)'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_2.49'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_Net Total'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_32.71'), 0)

WebUI.verifyElementPresent(findTestObject('Billing location selection1/Page_Adit App/div_30.22 (1)'), 0)

