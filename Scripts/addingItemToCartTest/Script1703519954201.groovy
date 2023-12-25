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

String dirName = System.getProperty("user.dir")

Mobile.startApplication(dirName + "/General-Store.apk", true)

Mobile.tap(findTestObject('Object Repository/loginPage/android.widget.TextView - Afghanistan'), 5)

Mobile.tap(findTestObject('Object Repository/loginPage/android.widget.TextView - Andorra'), 5)

Mobile.setText(findTestObject('Object Repository/loginPage/android.widget.EditText - Enter name here'), 'Mohamed Samir', 
    0)

Mobile.tap(findTestObject('Object Repository/loginPage/android.widget.RadioButton - Male'), 5)

Mobile.tap(findTestObject('Object Repository/loginPage/android.widget.Button - Lets  Shop'), 5)

Mobile.tap(findTestObject('Object Repository/productsPage/android.widget.TextView - ADD TO CART'), 5)

Mobile.tap(findTestObject('Object Repository/productsPage/android.widget.ImageButton'), 5)

Mobile.verifyElementExist(findTestObject('Object Repository/cartPage/android.widget.ImageView'), 5)

Mobile.closeApplication()

