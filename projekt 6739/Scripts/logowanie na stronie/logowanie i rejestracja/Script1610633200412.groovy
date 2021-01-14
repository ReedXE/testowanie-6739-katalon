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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.urlRegister)

WebUI.click(findTestObject('Object Repository/logowanieirejestracja/Page_Welcome to the Test Site/a_Signin'))

WebUI.setText(findTestObject('Object Repository/logowanieirejestracja/Page_Welcome to the Test Site/input_Username_username'), 
    GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/logowanieirejestracja/Page_Welcome to the Test Site/input_Password_password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/logowanieirejestracja/Page_Welcome to the Test Site/input_Signup_button'))

WebUI.click(findTestObject('Object Repository/logowanieirejestracja/Page_Welcome to the Test Site/figure'))

WebUI.setText(findTestObject('Object Repository/logowanieirejestracja/Page_Welcome/input_First Name_name'), imie)

WebUI.setText(findTestObject('Object Repository/logowanieirejestracja/Page_Welcome/input'), nazwisko)

WebUI.click(findTestObject('Object Repository/logowanieirejestracja/Page_Welcome/label_Married'))

WebUI.click(findTestObject('Object Repository/logowanieirejestracja/Page_Welcome/label_Reading'))

WebUI.click(findTestObject('Object Repository/logowanieirejestracja/Page_Welcome/label_Dance'))

WebUI.setText(findTestObject('Object Repository/logowanieirejestracja/Page_Welcome/input_Phone Number_phone'), numer)

WebUI.setText(findTestObject('Object Repository/logowanieirejestracja/Page_Welcome/input_Username_username'), login)

WebUI.setText(findTestObject('Object Repository/logowanieirejestracja/Page_Welcome/input_E-mail_email'), email)

WebUI.setText(findTestObject('Object Repository/logowanieirejestracja/Page_Welcome/textarea'), 'test')

WebUI.setEncryptedText(findTestObject('Object Repository/logowanieirejestracja/Page_Welcome/input_Password_password'), haslo)

WebUI.setEncryptedText(findTestObject('Object Repository/logowanieirejestracja/Page_Welcome/input_Confirm Password_c_password'), 
    haslo)

WebUI.click(findTestObject('Object Repository/logowanieirejestracja/Page_Welcome/input_1'))

