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

// Initialize the Appium driver
//AppiumDriver driver

//try {
//	// Get the driver instance
//	driver = MobileDriverFactory.getDriver()
//} catch (Exception startApp) {
//	// If driver initialization fails, start the application
//	Mobile.startExistingApplication('com.samsung.ecomm', FailureHandling.STOP_ON_FAILURE)
//	driver = MobileDriverFactory.getDriver()
//} // ini script untuk menjalankan aplikasi yang sudah terinstall dalam emulator tanpa perlu install ulang
Mobile.startApplication('C:\\automate\\katalon\\Eduapp\\mobileapp\\ShopSamsung.apk', false)

Mobile.delay(35, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Samsung/Shop as a guest - Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Samsung/Interest Phones - button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Samsung/continue to page - button'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Samsung/Shop_Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Samsung/Phones-Products'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Samsung/Galaxy Z-product'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Samsung/Choose-Galaxy Z Fold6'), 0)

Mobile.scrollToText('Trade-in')

Mobile.tap(findTestObject('Object Repository/Samsung/Choose-No to trade in'), 0)

Mobile.scrollToText('No coverage')

Mobile.tap(findTestObject('Object Repository/Samsung/Button - No coverage'), 0)

Mobile.scrollToText('Delivery for')

Mobile.tap(findTestObject('Object Repository/Samsung/Button - Continue'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Samsung/Skip add-ons'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Samsung/checkout-button'), 0)

Mobile.closeApplication()
