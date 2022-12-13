package mileFunction
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class login {

	@Given("Login page is loaded successfully")
	def load_login_page() {
		WebUI.callTestCase(findTestCase("Test Cases/BDD/Load Login Page"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I input organization name (.*)")
	def input_organization_name(String org_name) {
		WebUI.callTestCase(findTestCase("Test Cases/BDD/Input Organization Name"), [ ('org_name') : org_name ], FailureHandling.STOP_ON_FAILURE)
	}

	@And("I input username (.*)")
	def input_username(String user_email) {
		WebUI.callTestCase(findTestCase("Test Cases/BDD/Input User Name"), [ ('user_email') : user_email ], FailureHandling.STOP_ON_FAILURE)
	}

	@And("I input password (.*)")
	def input_password(String password) {
		WebUI.callTestCase(findTestCase("Test Cases/BDD/Input Password"), [ ('password') : password ], FailureHandling.STOP_ON_FAILURE)
	}

	@And("I click button login")
	def click_login() {
		WebUI.callTestCase(findTestCase("Test Cases/BDD/Click Login"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("login failed and show warning login_failed")
	def login_failed() {
		WebUI.callTestCase(findTestCase("Test Cases/BDD/Login Failed"), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("login failed and show validation password")
	def password_validation() {
		WebUI.callTestCase(findTestCase("Test Cases/BDD/Password Validate"), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
