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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://zxing.appspot.com/generator/')

WebUI.selectOptionByValue(findTestObject('Page_QR Code/select_Contents'), 'Calendar event', false)

WebUI.check(findTestObject('Page_QR Code Generator (Calendar event)/input_All day event_checked'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_QR Code Generator (Calendar event)/input_Event title'), 'Glints')

WebUI.click(findTestObject('Page_QR Code Generator (Calendar event)/startDate_22'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_QR Code Generator (Calendar event)/endDate_22'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_QR Code Generator (Calendar event)/input_Location'), 'Jakarta')

WebUI.setText(findTestObject('Page_QR Code Generator (Calendar event)/input_Description'), 'Mulya Noval Interview')

WebUI.click(findTestObject('Page_QR Code/button_Generate'))

WebUI.click(findTestObject('Page_QR Code/Download_button'))

WebUI.takeScreenshot('E:\\Documents\\Glints\\qrcode\\qrcalendar.png')

WebUI.navigateToUrl('https://m28dev.github.io/qrdecoder/')

WebUI.uploadFile(findTestObject('Page_QR Decoder demo site/button_ChooseFile'), 'E:\\Documents\\Glints\\qrcode\\qrcalendar.png')

WebUI.click(findTestObject('Page_QR Decoder demo site/button_Submit'))

WebUI.verifyTextPresent('Mulya Noval Interview', false, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

