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

WebUI.click(findTestObject('Object Repository/UserDetail Page/Page_Adit App/mat-icon_settings'))

WebUI.click(findTestObject('Object Repository/UserDetail Page/Page_Adit App/span_Admin Panel'))

WebUI.click(findTestObject('Object Repository/UserDetail Page/Page_Adit App/a_Users keyboard_arrow_right'))

WebUI.click(findTestObject('UserDetail Page/Page_Adit App/a_testdectod Test'))

WebUI.verifyElementPresent(findTestObject('UserDetail Page/Page_Adit App/h2_User Detail'), 0)

WebUI.verifyElementPresent(findTestObject('UserDetail Page/Page_Adit App/span_BH'), 0)

WebUI.verifyElementPresent(findTestObject('UserDetail Page/Page_Adit App/h3_bhavin TestLive edit'), 0)

WebUI.verifyElementPresent(findTestObject('UserDetail Page/Page_Adit App/div_bhavinadit.com'), 0)

WebUI.verifyElementPresent(findTestObject('UserDetail Page/Page_Adit App/button_Back'), 0)

WebUI.verifyElementPresent(findTestObject('UserDetail Page/Page_Adit App/button_Remove'), 0)

WebUI.verifyElementPresent(findTestObject('UserDetail Page/Page_Adit App/span_Remove'), 0)

WebUI.verifyElementPresent(findTestObject('UserDetail Page/Page_Adit App/strong_Role'), 0)

WebUI.verifyElementPresent(findTestObject('UserDetail Page/Page_Adit App/a_Click here to understand Adit role permissions'), 
    0)

WebUI.verifyElementPresent(findTestObject('UserDetail Page/Page_Adit App/button_Save'), 0)

WebUI.verifyElementPresent(findTestObject('UserDetail Page/Page_Adit App/button_Clear'), 0)

WebUI.verifyElementPresent(findTestObject('UserDetail Page/Page_Adit App/div_Locations'), 0)

WebUI.verifyElementPresent(findTestObject('UserDetail Page/Page_Adit App/strong_Applications'), 0)

