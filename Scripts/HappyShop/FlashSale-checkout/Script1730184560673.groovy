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

Mobile.startApplication('C:\\automate\\katalon\\Eduapp\\mobileapp\\HappyDayShopping.apk', true)

WebUI.delay(20)

Mobile.tap(findTestObject('Object Repository/HappyShop/promo product-button'), 0)

WebUI.delay(20)

Mobile.tap(findTestObject('Object Repository/HappyShop/LeonMensIntimateWash-100ml_product'), 0)

WebUI.delay(10)

//Mobile.tap(findTestObject('HappyShop/set-quantity-button'), 0)
//Mobile.setText(findTestObject('Object Repository/HappyShop/quantity-set'), '5', 0)
//WebUI.delay(10)
//Mobile.hideKeyboard()
Mobile.tap(findTestObject('HappyShop/Add to Bag- Button'), 0)

WebUI.delay(10)

Mobile.tap(findTestObject('Object Repository/HappyShop/YourBag-Button'), 0)

WebUI.delay(10)

Mobile.tap(findTestObject('HappyShop/checkout - button'), 0)

WebUI.delay(30)

Mobile.getText(findTestObject('HappyShop/assert - If you have any inquiries or updates pls whatsap us at 94617563'), 0)

WebUI.delay(5)

Mobile.closeApplication()

