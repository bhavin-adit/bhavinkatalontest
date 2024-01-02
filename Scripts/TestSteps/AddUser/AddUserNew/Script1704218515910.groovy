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

not_run: WebUI.setText(findTestObject('Object Repository/AddUserNew/Page_Adit App/input_Login To Your Account_mat-input-0'), 
    'testowner_live')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/AddUserNew/Page_Adit App/input_Username_mat-input-1'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

not_run: WebUI.click(findTestObject('Object Repository/AddUserNew/Page_Adit App/button_close'))

WebUI.click(findTestObject('Object Repository/AddUserNew/Page_Adit App/mat-icon_settings'))

WebUI.click(findTestObject('Object Repository/AddUserNew/Page_Adit App/span_Admin Panel'))

WebUI.click(findTestObject('Object Repository/AddUserNew/Page_Adit App/a_Users keyboard_arrow_right'))

WebUI.click(findTestObject('Object Repository/AddUserNew/Page_Adit App/span_Add User'))

WebUI.setText(findTestObject('Object Repository/AddUserNew/Page_Adit App/input_Create User - Name  Email_mat-input-5'), 
    'Testtodayt')

WebUI.setText(findTestObject('Object Repository/AddUserNew/Page_Adit App/input_First Name_mat-input-6'), 'test')

WebUI.setText(findTestObject('Object Repository/AddUserNew/Page_Adit App/input_Last Name_mat-input-7'), 'bhavin@adit.com')

WebUI.setText(findTestObject('Object Repository/AddUserNew/Page_Adit App/input_Email_mat-input-8'), 'bhavintoday')

WebUI.click(findTestObject('Object Repository/AddUserNew/Page_Adit App/div_Assign Role_mat-select-arrow ng-tns-c291-32'))

WebUI.click(findTestObject('Object Repository/AddUserNew/Page_Adit App/span_Owner'))

WebUI.click(findTestObject('Object Repository/AddUserNew/Page_Adit App/span_Next Assign Apps'))

WebUI.click(findTestObject('Object Repository/AddUserNew/Page_Adit App/span_Assign All_mat-checkbox-inner-containe_89083b'))

WebUI.click(findTestObject('Object Repository/AddUserNew/Page_Adit App/span_Next Assign Locations'))

WebUI.click(findTestObject('Object Repository/AddUserNew/Page_Adit App/span_Search_mat-checkbox-inner-container ma_bb8407'))

WebUI.click(findTestObject('Object Repository/AddUserNew/Page_Adit App/span_Next Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/AddUserNew/Page_Adit App/input_Do not email the user_mat-input-10'), 
    'RAWr01XIeRWGgEfVe4uwEQ==')

WebUI.click(findTestObject('Object Repository/AddUserNew/Page_Adit App/span_Create User'))

WebUI.setText(findTestObject('Object Repository/AddUserNew/Page_Adit App/input_Click here to understand Adit role pe_60c505'), 
    'bhavintoday')

not_run: WebUI.closeBrowser()

