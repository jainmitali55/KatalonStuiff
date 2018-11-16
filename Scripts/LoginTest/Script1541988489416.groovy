
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(null);
WebUI.navigateToUrl("https://d3q8tkbt92fl1q.cloudfront.net/#/login");
WebUI.sendKeys(findTestObject('Object Repository/Page_Forcepoint Policy Distribution/input_Sign In_text-field form-'), 'Nicholas.Stocks@forcepoint.com');
WebUI.sendKeys(findTestObject('Object Repository/Page_Forcepoint Policy Distribution/password_field'),'F0rcep0int!');
WebUI.click(findTestObject('Object Repository/Page_Forcepoint Policy Distribution/Sign_In_button'));