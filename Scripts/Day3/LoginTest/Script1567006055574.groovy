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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.allrecipes.com/')

WebUI.click(findTestObject('Object Repository/Page_Allrecipes  Food friends and recipe inspiration/div_Ingredient Search_img-profile svg-icon--top-nav-bar--userhead svg-icon--top-nav-bar--userhead-dims'))

WebUI.click(findTestObject('Page_Allrecipes - Authentication Welcome/span_Sign in'))

WebUI.setText(findTestObject('Page_Allrecipes - Signin/input_Existing Allrecipes users_txtUserNameOrEmail'), 'romilovesvball@hotmail.com')

WebUI.setEncryptedText(findTestObject('Page_Allrecipes - Signin/input_Existing Allrecipes users_password'), 'CEPYRHojllAQGKkyi7TA0g==')

WebUI.click(findTestObject('Page_Allrecipes - Signin/input_Forgot password_submitLogInForm'))

WebUI.verifyTextPresent('romilovesvball', true)

WebUI.setText(findTestObject('Page_Allrecipes  Food friends and recipe inspiration/input_BROWSE_searchText'), 'guacamole')

WebUI.click(findTestObject('Object Repository/Page_Allrecipes  Food friends and recipe inspiration/span_BROWSE_svg-icon--top-nav-bar--search-magnify svg-icon--top-nav-bar--search-magnify-dims'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Page_Search - Allrecipescom/span_romilovesvball'))

WebUI.click(findTestObject('Page_Search - Allrecipescom/button_Sign out'))

WebUI.closeBrowser()

