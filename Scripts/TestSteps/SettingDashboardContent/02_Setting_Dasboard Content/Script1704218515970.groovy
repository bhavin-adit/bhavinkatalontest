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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://app.adit.com/auth/login')

not_run: WebUI.setText(findTestObject('Object Repository/SettingDashboardContent/Page_Adit App/input_Login To Your Account_mat-input-0'), 
    'testowner_live')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/SettingDashboardContent/Page_Adit App/input_Username_mat-input-1'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

not_run: WebUI.click(findTestObject('Object Repository/SettingDashboardContent/Page_Adit App/button_Login'))

not_run: WebUI.click(findTestObject('Object Repository/SettingDashboardContent/Page_Adit App/button_close'))

WebUI.click(findTestObject('Object Repository/SettingDashboardContent/Page_Adit App/mat-icon_settings'))

WebUI.verifyElementPresent(findTestObject('SettingDashboardContent/Page_Adit App/h2_Settings'), 0)

WebUI.verifyElementPresent(findTestObject('SettingDashboardContent/Page_Adit App/h3_Numbers'), 0)

WebUI.verifyElementPresent(findTestObject('SettingDashboardContent/Page_Adit App/h3_Integrations'), 0)

WebUI.verifyElementPresent(findTestObject('SettingDashboardContent/Page_Adit App/h3_My Profile'), 0)

WebUI.verifyElementPresent(findTestObject('SettingDashboardContent/Page_Adit App/div_Locations1 Sep Test25 aug25 augLive signupLocation_fgLocationNumTestTelynxLocationtestlocation4TextLocV2V2-no landline'), 
    0)

not_run: WebUI.closeBrowser()

