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
import com.kms.katalon.core.testobject.ConditionType

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/dashboard')

WebUI.setText(findTestObject('Object Repository/emailField'), 'grace@homprep.com')

WebUI.setText(findTestObject('Object Repository/passwordField'), 'admin1234')

WebUI.click(findTestObject('Object Repository/loginButton'))

WebUI.delay(8)

WebUI.navigateToUrl('http://localhost:3000/create')

WebUI.click(findTestObject('Object Repository/demolishService'))

WebUI.click(findTestObject('Object Repository/addItemButton'))

WebUI.setText(findTestObject('Object Repository/inputArea'), optionText)

WebUI.waitForElementVisible(findTestObject('Object Repository/inputOptions'), 10)

WebUI.click(findTestObject('Object Repository/inputOptions', [('optionText') : optionText]))

for (int i = 1; i <= loop; i++) {
	String lengths = length["length${i}"]
	WebUI.setText(findTestObject('Object Repository/inputName'), 'item ' + i)

	WebUI.setText(findTestObject('Object Repository/lengthInput'), lengths)
	WebUI.setText(findTestObject('Object Repository/widthInput'), width)
	WebUI.setText(findTestObject('Object Repository/heightInput'), height)
	WebUI.setText(findTestObject('Object Repository/quantityInput'), quantity)

	WebUI.click(findTestObject('Object Repository/saveButton'))
	
	WebUI.delay(1)
	
	WebUI.click(findTestObject('Object Repository/plusButton'))
	WebUI.click(findTestObject('Object Repository/editButton', ['i': i]))
}







