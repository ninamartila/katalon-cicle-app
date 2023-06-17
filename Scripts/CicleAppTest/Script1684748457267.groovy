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

response = WS.sendRequest(findTestObject('AllSession'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 200)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('AllSessionNotFound'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 404)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('AllSessionUnauthorized'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 401)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('ChatByID'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 200)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('ChatByIDNotFound'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 404)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('ChatByIDUnauthorized'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 401)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('ChatCreateMessage'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 200)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('ChatCreateMessageNotFound'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 404)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('ChatCreateMessageUnauthorized'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 401)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('CurrentTeam'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 200)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('CurrentTeamNotFound'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 404)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('CurrentTeamUnauthorized'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 401)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('DeleteCompanyBadRequest'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 400)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('DeleteCompanyNotFound'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 404)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('DeleteCompanyUnauthorized'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 401)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('DetailSession'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 200)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('DetailSessionNotFound'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 404)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('DetailSessionUnauthorized'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 401)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('MarkAsReadyAll'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 200)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('MarkAsReadyAllNotFound'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 404)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('MarkAsReadyAllUnauthorized'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 401)
WS.verifyLessThan(elapsedTime, 8)

//response = WS.sendRequest(findTestObject('Team'))
//elapsedTime = (response.getElapsedTime() / 1000)
//WS.verifyResponseStatusCode(response, 200)
//WS.verifyLessThan(elapsedTime, 4)

response = WS.sendRequest(findTestObject('TeamBadRequest'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 400)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('TeamNotFound'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 404)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('TeamUnauthorized'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 401)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('UserProfile'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 200)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('UserProfileNotFound'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 404)
WS.verifyLessThan(elapsedTime, 8)

response = WS.sendRequest(findTestObject('UserProfileUnauthorized'))
elapsedTime = (response.getElapsedTime() / 1000)
WS.verifyResponseStatusCode(response, 401)
WS.verifyLessThan(elapsedTime, 8)