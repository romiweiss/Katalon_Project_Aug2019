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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('Page_Allrecipes  Food friends and recipe inspiration/div_img-profile-userhead-dims'))

WebUI.click(findTestObject('Page_Allrecipes - Authentication Welcome/span_Sign in'))

WebUI.setText(findTestObject('Page_Allrecipes - Signin/input_Existing Allrecipes users_txtUserNameOrEmail'), GlobalVariable.USERNAME)

WebUI.setEncryptedText(findTestObject('Page_Allrecipes - Signin/input_Existing Allrecipes users_password'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('Page_Allrecipes - Signin/input_Forgot password_submitLogInForm'))

WebUI.setText(findTestObject('Page_Allrecipes  Food friends and recipe inspiration/input_BROWSE_searchText'), 'mac \'n\' cheese')

WebUI.click(findTestObject('Page_Allrecipes - Authentication Welcome/span_BROWSE-search-magnify-dims'))

WebUI.click(findTestObject('Page_Search - Allrecipescom/span_romilovesvball'))

WebUI.click(findTestObject('Page_Search - Allrecipescom/button_Sign out'))

WebUI.closeBrowser()

