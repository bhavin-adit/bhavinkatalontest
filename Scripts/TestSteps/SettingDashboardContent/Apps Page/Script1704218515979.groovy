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

WebUI.click(findTestObject('Object Repository/Apps/Page_Adit App/mat-icon_settings'))

WebUI.click(findTestObject('Object Repository/Apps/Page_Adit App/span_Admin Panel'))

WebUI.click(findTestObject('Object Repository/Apps/Page_Adit App/a_Applications keyboard_arrow_right'))

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/h2_Apps'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/div_Practice Analytics'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/internal chat box'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/os box'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/adit pay box'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/patient box'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/ct box'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/pozative box'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/reports box'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/engage box'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/email campaign box'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/pf box'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/telemed'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/i_Apps_icon-Practice-Analytics-Icon'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/i_Active Locations_icon-Engage'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/i_Active Locations_icon-internal-chat'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/i_Active Locations_icon-Patient-Form'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/i_Active Locations_icon-Pozative'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/i_Active Locations_icon-adit-pay'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/i_Active Locations_icon-Email-Campaign'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/i_Active Locations_icon-Patients'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/i_Active Locations_icon-Engage'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/i_Active Locations_icon-Reporting'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/i_Active Locations_icon-Call-Tracking'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/i_Active Locations_icon-Telemed'), 0)

WebUI.verifyElementPresent(findTestObject('Apps/Page_Adit App/div_Active Locations_appscheduleicon br-4'), 0)

String patext = WebUI.getText(findTestObject('Apps/Page_Adit App/p_Amplifies your practice with metrics, KPIs, and targeted patient lists that can help you increase production, retention, and overall practice success'))

String pasettext = 'Amplifies your practice with metrics, KPIs, and targeted patient lists that can help you increase production, retention, and overall practice success.'

if (patext.equals(pasettext)) {
    WebUI.comment('PA text is matched.')
} else {
    WebUI.comment('PA text is not matching.')
}

String engagetext = WebUI.getText(findTestObject('Apps/Page_Adit App/p_Connect with patients via text, call, or email, and perform practice-related functions efficiently in a centralized patient info display'))

String engagesettext = 'Connect with patients via text, call, or email, and perform practice-related functions efficiently in a centralized patient info display.'

if (engagetext.equals(engagesettext)) {
    WebUI.comment('Engage text is matched.')
} else {
    WebUI.comment('Engage text is not matching.')
}

String pfext = WebUI.getText(findTestObject('Apps/Page_Adit App/p_Digitize your patient forms and allow patients to conveniently fill out their forms online'))

String pfsettext = 'Digitize your patient forms and allow patients to conveniently fill out their forms online.'

if (pfext.equals(pfsettext)) {
    WebUI.comment('PF text is matched.')
} else {
    WebUI.comment('PF text is not matching.')
}

String internaltext = WebUI.getText(findTestObject('Apps/Page_Adit App/p_Internal Chat allows you to communicate with everyone in the office. Also able to send documents and images to individuals or to groups'))

String internalsettext = 'Internal Chat allows you to communicate with everyone in the office. Also able to send documents and images to individuals or to groups.'

if (internaltext.equals(internalsettext)) {
    WebUI.comment('InternalChat text is matched.')
} else {
    WebUI.comment('InternalChat text is not matching.')
}

String ostext = WebUI.getText(findTestObject('Apps/Page_Adit App/p_Allows your patients to book appointments directly from your website into your Patient Management Software'))

String ossettext = 'Allows your patients to book appointments directly from your website into your Patient Management Software.'

if (ostext.equals(ossettext)) {
    WebUI.comment('OnlineScheduling text is matched.')
} else {
    WebUI.comment('OnlineScheduling text is not matching.')
}

String poztext = WebUI.getText(findTestObject('Apps/Page_Adit App/p_Increase your reviews on Google, Facebook and other sites by leveraging intelligent and automated SMS communication'))

String pozsettext = 'Increase your reviews on Google, Facebook and other sites by leveraging intelligent and automated SMS communication.'

if (poztext.equals(pozsettext)) {
    WebUI.comment('Pozative text is matched.')
} else {
    WebUI.comment('Pozative text is not matching.')
}

String aditpaytext = WebUI.getText(findTestObject('Apps/Page_Adit App/p_Adit Pay is the full payment processing solution that offers multiple contactless payment options'))

String aditpaysettext = 'Adit Pay is the full payment processing solution that offers multiple contactless payment options.'

if (aditpaytext.equals(aditpaysettext)) {
    WebUI.comment('AditPay text is matched.')
} else {
    WebUI.comment('AditPay text is not matching.')
}

String emailcampaigntext = WebUI.getText(findTestObject('Apps/Page_Adit App/p_Improve patient retention, production, and referrals with integrated email campaigns'))

String emailcampaignsettext = 'Improve patient retention, production, and referrals with integrated email campaigns.'

if (emailcampaigntext.equals(emailcampaignsettext)) {
    WebUI.comment('EmailCampaign text is matched.')
} else {
    WebUI.comment('EmailCampaign text is not matching.')
}

String patienttext = WebUI.getText(findTestObject('Apps/Page_Adit App/p_Your patient directory helps you record, analyze, and track the growth of your practices demographic'))

String patientsettext = 'Your patient directory helps you record, analyze, and track the growth of your practice\'s demographic.'

if (patienttext.equals(patientsettext)) {
    WebUI.comment('Patient text is matched.')
} else {
    WebUI.comment('Patient text is not matching.')
}

String telemedtext = WebUI.getText(findTestObject('Apps/Page_Adit App/p_TeleMed is a HIPAA-compliant tool that enables you to provide quality, virtual care to your patients'))

String telemedsettext = 'TeleMed is a HIPAA-compliant tool that enables you to provide quality, virtual care to your patients.'

if (telemedtext.equals(telemedsettext)) {
    WebUI.comment('Telemed text is matched.')
} else {
    WebUI.comment('Telemed text is not matching.')
}

String calltracktext = WebUI.getText(findTestObject('Apps/Page_Adit App/p_Allows you to track all of your incoming phone calls, see where they are coming from, and how your front desk is performing'))

String calltracksettext = 'Allows you to track all of your incoming phone calls, see where they are coming from, and how your front desk is performing.'

if (calltracktext.equals(calltracksettext)) {
    WebUI.comment('Call Tracking text is matched.')
} else {
    WebUI.comment('Call Tracking text is not matching.')
}

String reporttext = WebUI.getText(findTestObject('Apps/Page_Adit App/p_Advanced analytics gives you a deep dive into how your practice is doing and what can be done to accelerate growth'))

String reportsettext = 'Advanced analytics gives you a deep dive into how your practice is doing and what can be done to accelerate growth.'

if (reporttext.equals(reportsettext)) {
    WebUI.comment('Reports text is matched.')
} else {
    WebUI.comment('Reports text is not matching.')
}

