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

Mobile.startApplication('C:\\automate\\katalon\\Eduapp\\mobileapp\\dAF-TEST_23_OKT_2024.apk', true)

Mobile.tap(findTestObject('Object Repository/astra/android.widget.TextView - PT FEDERAL INTERNATIONAL FINANCE'), 0)

Mobile.tap(findTestObject('Object Repository/astra/android.widget.TextView - PT ASTRA MULTI FINANCE'), 0)

Mobile.tap(findTestObject('android.widget.TextView - INDIVIDU'), 0)

Mobile.tap(findTestObject('Object Repository/astra/android.widget.TextView - INDIVIDU'), 0)

Mobile.tap(findTestObject('Object Repository/astra/android.widget.LinearLayout (1)'), 0)

Mobile.tap(findTestObject('android.widget.TextView - MULTI PRODUCT FINANCE'), 0)

Mobile.tap(findTestObject('Object Repository/astra/android.widget.TextView - NEW MOTOR CYCLE'), 0)

Mobile.tap(findTestObject('Object Repository/astra/android.widget.TextView - SYARIAH'), 0)

Mobile.tap(findTestObject('Object Repository/astra/android.widget.TextView - KONVENSIONAL'), 0)

Mobile.tap(findTestObject('Object Repository/astra/android.widget.Button - Halaman Berikutnya'), 0)

Mobile.tap(findTestObject('Object Repository/astra/android.widget.Button - Halaman Berikutnya (1)'), 0)

Mobile.setText(findTestObject('Object Repository/astra/android.widget.EditText (1)'), '3175022711790003', 0)

Mobile.closeApplication()

