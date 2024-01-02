import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.server.DriverFactory

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://app.adit.com/auth/login')

not_run: WebUI.setText(findTestObject('Object Repository/AddUser/Page_Adit App/input_Login To Your Account_mat-input-0'), 
    'testowner_live')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/AddUser/Page_Adit App/input_Username_mat-input-1'), 'RigbBhfdqOBGNlJIWM1ClA==')

not_run: WebUI.click(findTestObject('Object Repository/AddUser/Page_Adit App/button_Login'))

not_run: WebUI.click(findTestObject('Object Repository/AddUser/Page_Adit App/button_close'))

WebUI.click(findTestObject('Object Repository/AddUser/Page_Adit App/a_settings'))

WebUI.click(findTestObject('Object Repository/AddUser/Page_Adit App/a_Users'))

WebUI.click(findTestObject('Object Repository/AddUser/Page_Adit App/span_Add User'))

WebUI.setText(findTestObject('Object Repository/AddUser/Page_Adit App/input_Create User - Name  Email_mat-input-5'), 'testdectod')

WebUI.click(findTestObject('Object Repository/AddUser/Page_Adit App/input_Create User - Name  Email_mat-input-5'))

WebUI.setText(findTestObject('Object Repository/AddUser/Page_Adit App/input_First Name_mat-input-6'), 'Test')

WebUI.setText(findTestObject('Object Repository/AddUser/Page_Adit App/input_Last Name_mat-input-7'), 'bhavin@adit.com')

WebUI.setText(findTestObject('Object Repository/AddUser/Page_Adit App/input_Email_mat-input-8'), 'testdectod')

WebUI.click(findTestObject('Object Repository/AddUser/Page_Adit App/div_Assign Role_mat-select-arrow ng-tns-c291-26'))

WebUI.click(findTestObject('Object Repository/AddUser/Page_Adit App/span_Owner'))

WebUI.click(findTestObject('Object Repository/AddUser/Page_Adit App/button_Next Assign Apps'))

WebUI.click(findTestObject('Object Repository/AddUser/Page_Adit App/span_Assign All_mat-checkbox-inner-containe_89083b'))

WebUI.click(findTestObject('Object Repository/AddUser/Page_Adit App/span_Next Assign Locations'))

WebUI.click(findTestObject('Object Repository/AddUser/Page_Adit App/span_Search_mat-checkbox-inner-container ma_bb8407'))

WebUI.click(findTestObject('Object Repository/AddUser/Page_Adit App/span_Next Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/AddUser/Page_Adit App/input_Do not email the user_mat-input-10'), 
    'RAWr01XIeRWGgEfVe4uwEQ==')

WebUI.click(findTestObject('Object Repository/AddUser/Page_Adit App/span_Create User'))

WebUI.setText(findTestObject('UserPage/Page_Adit App/input_Click here to understand Adit role permissions_mat-input-4'), 
    'testdectod')

not_run: WebUI.closeBrowser()

