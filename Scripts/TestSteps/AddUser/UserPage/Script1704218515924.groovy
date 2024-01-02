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

WebUI.click(findTestObject('Object Repository/UserPage/Page_Adit App/mat-icon_settings'))

WebUI.click(findTestObject('Object Repository/UserPage/Page_Adit App/button_Admin Panel'))

WebUI.click(findTestObject('Object Repository/UserPage/Page_Adit App/a_Users keyboard_arrow_right'))

WebUI.verifyAllLinksOnCurrentPageAccessible(false, [])

WebUI.verifyElementPresent(findTestObject('UserPage/Page_Adit App/span_Click here to understand Adit role permissions'), 
    0)

WebUI.verifyElementPresent(findTestObject('UserPage/Page_Adit App/div_searchSearch'), 0)

WebUI.verifyElementPresent(findTestObject('UserPage/Page_Adit App/button_Add Bulk User'), 0)

WebUI.verifyElementPresent(findTestObject('UserPage/Page_Adit App/button_Add User'), 0)

String fontsize = WebUI.getCSSValue(findTestObject('UserPage/Page_Adit App/button_Add User'), 'font-size')

not_run: String fontweight = WebUI.getCSSValue(findTestObject('UserPage/Page_AditApp/button_Add User'), 'font-weight')

String fontcolor = WebUI.getCSSValue(findTestObject('UserPage/Page_Adit App/button_Add User'), 'color')

String bulkfontsize= WebUI.getCSSValue(findTestObject('UserPage/Page_Adit App/button_Add Bulk User'), 'font-size')
String bulkfontcolor= WebUI.getCSSValue(findTestObject('UserPage/Page_Adit App/button_Add Bulk User'), 'color')

String fontsizestore = '14px'

not_run: String fontweightstore = '400'

String fontcolorstore = 'rgba(255, 255, 255, 14)'

if (fontsize.equals(fontsizestore)) {
    WebUI.comment('Font-size matched.')
} else {
    setTimeout(WebUI.executeJavaScript('alert(\'Font size not matching\')', 1250))
	
}

/*
 * if (fontweight.equals(fontweightstore)) { WebUI.comment('Font-weight
 * matched.') } else { WebUI.executeJavaScript('alert(\'Font weight not
 * matching\')', null) }
 */
if (fontcolor.equals(fontcolorstore)) {
    WebUI.comment('Font-Color matched.')
} else {
    WebUI.executeJavaScript('alert(\'Font color not matching\')', null)
}

String bulkfontsizestore = '14px'
String bulkfontcolorstore = 'rgba(255, 255, 255, 1)'

if (bulkfontsize.equals(bulkfontsizestore)) {
	WebUI.comment('Font-size matched.')
} else {
	WebUI.executeJavaScript('alert(\'Font size not matching\')', null)
}

if (bulkfontcolor.equals(bulkfontcolorstore)) {
	WebUI.comment('Font-Color matched.')
} else {
	WebUI.executeJavaScript('alert(\'Font color not matching\')', null)
}
