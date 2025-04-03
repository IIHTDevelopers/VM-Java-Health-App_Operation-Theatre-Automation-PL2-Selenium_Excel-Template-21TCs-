package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class operationTheatre_Pages extends StartupPage {
	
//	Write the locators here
	
	String pageName = this.getClass().getSimpleName();
	public operationTheatre_Pages(WebDriver driver) {
		super(driver);
	}
	
	/**@Test1.1
	 * Logs into the Health App using the provided valid credentials.
	 *
	 * @param expectedData A map containing login credentials with keys "username" and "password".
	 * @return true if the login is successful and the registered patient text is displayed, false otherwise.
	 * @throws Exception if any issue occurs during login.
	 * 
	 * This method:
	 * - Finds and highlights the username and password text fields.
	 * - Enters the provided username and password.
	 * - Clicks the sign-in button.
	 * - Verifies if the registered patient text is displayed to confirm successful login.
	 * 
	 * @author Yaksha
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		//Write your logic here
		return false;
	}

	/**@Test1.2
	 * Verifies the title of the current page.
	 * @param : null
	 * @return The title of the current page as a String.
	 * @throws Exception if any issue occurs while retrieving the title.
	 * 
	 * This method:
	 * - Retrieves the title of the currently loaded page.
	 * - Prints the title to the console.
	 * - Returns the title as a String.
	 * 
	 * @author YAKSHA
	 */
	public String verifyTitleOfThePage() throws Exception {
		//Write your logic here
				return null;
	}

	/**@Test1.3
	 * Retrieves and verifies the URL of the current page.
	 * @param : null
	 * @return The current page URL as a String.
	 * @throws Exception if any issue occurs while retrieving the URL.
	 * 
	 * This method:
	 * - Retrieves the URL of the currently loaded page.
	 * - Prints the URL to the console.
	 * - Returns the URL as a String.
	 * 
	 * @author YAKSHA
	 */
	public String verifyURLOfThePage() throws Exception {
		//Write your logic here
				return null;
	}

	/**@Test2
	 * Navigates to the Operation Theatre module and verifies the table header name.
	 * @param : null
	 * @return The table header name as a String if the Operation Theatre module is present; otherwise, an empty string.
	 * @throws Exception if any issue occurs during navigation or verification.
	 * 
	 * This method:
	 * - Checks if the Operation Theatre module is present.
	 * - Clicks on the module if it is available.
	 * - Verifies if the hospital number table header is displayed.
	 * - Retrieves and returns the table header name.
	 * 
	 * @author YAKSHA
	 */
	public String goToOperationTheatreModuleVerifyTableHeaderName() throws Exception {
		//Write your logic here
				return null;
	}

	/**@Test3
	 * Verifies the Booking OT Schedule form by clicking the "New OT Booking" button.
	 * @param : null
	 * @return The title name of the Booking OT Schedule form as a String.
	 * @throws Exception if any issue occurs during the process.
	 * 
	 * This method:
	 * - Clicks on the "New OT Booking" button.
	 * - Retrieves and returns the title name of the Booking OT Schedule form.
	 * 
	 * @author YAKSHA
	 */
	public String verifyBookingOTScheduleFormByClickingOnNewOTBookingButton() throws Exception {
		//Write your logic here
				return null;
	}


	/**@Test4
	 * Verifies if the textboxes are present, enters values into them, and validates the entered values.
	 * @param expectedData A map containing values for:
	 *        - "patientName": The value to be entered in the patient selection textbox.
	 *        - "diagnosisValue": The value to be entered in the diagnosis textbox.
	 *        - "surgeryTypeValue": The value to be entered in the surgery type textbox.
	 * @return The value entered in the patient selection textbox as a String.
	 * @throws Exception if any issue occurs during the process.
	 * 
	 * This method:
	 * - Checks if the Booking OT Schedule form title is displayed.
	 * - Enters values into the patient name, diagnosis, and surgery type textboxes.
	 * - Retrieves and returns the value entered in the patient selection textbox.
	 * 
	 * @author YAKSHA
	 */
	public String verifyEnteredDataIsPresentInSelectPatientTextbox(Map<String, String> expectedData) throws Exception {

		//Write your logic here
				return null;
	}
	
	/**@Test5
	 * Verifies the placeholder name of a textbox.
	 * @param : null
	 * @return The placeholder name of the textbox as a String.
	 * @throws Exception if any issue occurs during the process.
	 * 
	 * This method:
	 * - Checks if the textbox is enabled.
	 * - Retrieves and returns the placeholder text of the textbox.
	 * 
	 * @author YAKSHA
	 */
	public String verifyPlaceholderNameOfTexboxIfTextboxIsEnabled() throws Exception {
		//Write your logic here
				return null;
	}

	
	/**@Test6
	 * Verifies if a button is present after entering a value into the surgeon name text field.
	 *
	 * @param expectedData A map containing:
	 *        - "surgenNameValue1": The value to be entered into the surgeon name text field.
	 * @return The text of the surgeon name button if present, otherwise an empty string.
	 * @throws Exception if any issue occurs during the process.
	 * 
	 * This method:
	 * - Checks if the surgeon name text field is displayed.
	 * - Enters the provided surgeon name and presses Enter.
	 * - Clicks on the Any other text box to trigger UI changes.
	 * - Checks if the surgeon name button is displayed.
	 * - Retrieves and returns the text of the surgeon name button.
	 * 
	 * @author YAKSHA
	 */
	public String verifyButtonIsPresentAfterSendValueToSurgenNameTextfield(Map<String, String> expectedData) throws Exception {
		//Write your logic here
				return null;
	}

	 /**@Test7
	 * Verifies if the plus (+) button is present after clicking the external checkbox.
	 * @param : null
	 * @return true if the plus (+) button is displayed after selecting the checkbox, otherwise false.
	 * @throws Exception if any issue occurs during the process.
	 * 
	 * This method:
	 * - Checks if the external checkbox is displayed.
	 * - Clicks the external checkbox.
	 * - Verifies if the checkbox is selected.
	 * - Checks if the plus (+) button is displayed.
	 * - Returns true if the plus (+) button is present.
	 * 
	 * @author YAKSHA
	 */
	public Boolean verifyPlusButtonIsPresentAfterClickOnExternalCheckbox() throws Exception {
		//Write your logic here
				return false;
	}
	
	/**@Test8
	 * Verifies the error message displayed in the "Add External Referral" form.
	 * @param : null
	 * @return The error message as a String if displayed; otherwise, an empty string.
	 * @throws Exception if any issue occurs during the process.
	 * 
	 * This method:
	 * - Checks if the plus (+) icon button is displayed.
	 * - Clicks on the plus (+) icon button.
	 * - Clicks on the "Add" button in the "Add External Referral" form.
	 * - Checks if the error message is displayed.
	 * - Retrieves and returns the error message text.
	 *
	 * @author YAKSHA
	 */
	public String verifyErrorMessageInAddExternalReferralForms() throws Exception {
		//Write your logic here
				return null;
	}
	
	 /**
     * @Test9
     * Method: verifySuccessNotificationPopupMessage()
     * @param expectedData - A Map containing expected values for referrer details such as 
     *                      referrer name, address, contact number, and email.
     * @description - This method populates the external referral form fields, submits the form, 
     *               and retrieves the success notification message displayed on the UI.
     * @return - A String containing the success notification messages.
     * @throws Exception - Throws an exception if any error occurs during execution.
     * @author - YAKSHA
     */
	
	public String verifySuccessNotificationPopupMessage(Map<String, String> expectedData) throws Exception {
		//Write your logic here
				return null;
	}
	
	/**
     * @Test10
     * Closes the "Booking OT Schedule New Patient" form using JavaScript.
     * @param null
     * @return True if the form was successfully closed; otherwise, false.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Checks if the close button is displayed.
     * - Clicks the close button using JavaScript.
     * - Waits for the action to complete.
     * - Returns true if the form was closed successfully.
     *
     * @author YAKSHA
     */
	public Boolean closeBookingOTScheduleNewPatientFormsByUsingJsExecutor() throws Exception {
		//Write your logic here
				return false;
	}

	/**
     * @Test11
     * Performs a scroll operation to the bottom of the page and validates the presence of a button and text field.
     * @param expectedData - A Map containing the expected value for the remarks text field.
     * @return True if the button and text field are present; otherwise, false.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Expands the billing module.
     * - Navigates to the "New One Counter" section.
     * - Scrolls to the "Hand Over" sub-module and clicks on it.
     * - Scrolls to the bottom of the page.
     * - Validates if the remarks text field and handover button are displayed.
     * - Enters remarks and clicks the handover button if both elements are present.
     *
     * @author YAKSHA
     */
	public Boolean validateBillingHandOverSectionsRemarksFieldAndHandOverButton(Map<String, String> expectedData) throws Exception {
		//Write your logic here
				return false;
	}

	 /**
     * @Test12
     * Verifies the locator value of a text box, sends a value to it, and highlights the text box.
     * @param expectedData - A Map containing the value to be entered in the remarks text field.
     * @return The locator value (ID) of the text box as a String.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Checks if the remarks text field is displayed.
     * - Clicks on the text field and clears any existing value.
     * - Enters the provided value into the text field.
     * - Retrieves and prints the locator (ID) of the text box.
     * - Highlights the text box after entering the value.
     *
     * @author YAKSHA
     */
	
	public String verifyLocatorsValueOfELement(Map<String, String> expectedData) throws Exception {
		//Write your logic here
				return null;
	}

	 /**
     * @Test13
     * Performs a keyboard operation to open the "Vaccination Patient Register" form.
     * @param null
     * @return The title of the "Vaccination Patient Register" form as a String.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Scrolls to the vaccination module section.
     * - Expands the vaccination module and navigates to the patient list sub-module.
     * - Performs the "Alt + N" keyboard shortcut operation.
     * - Retrieves and returns the title of the "Vaccination Patient Register" form.
     *
     * @author YAKSHA
     */
	
	public String performKeyboardOperation() throws Exception {
		//Write your logic here
				return null;
	}

	/**
     * @Test14.1
     * Verifies the selection and de-selection of radio buttons in the appointment booking module.
     * @param null
     * @return True if the radio buttons are successfully selected and de-selected; otherwise, false.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Closes the "Vaccination Patient Register" form if open.
     * - Scrolls to the "Appointment Module".
     * - Expands the "Appointment Module" and navigates to the "Booking Appointment" sub-module.
     * - Clicks the "New Patient" button.
     * - Selects the "Month" radio button and verifies its selection.
     * - Selects the "Days" radio button and verifies that "Month" is de-selected.
     *
     * @author YAKSHA
     */
	public Boolean verifyRadioButton() throws Exception {
		//Write your logic here
				return false;
	}

	 /**
     * @Test14.2
     * Verifies that the correct option is selected from a dropdown based on expected data.
     * @param expectedData - A Map containing the value of the option to be selected from the dropdown.
     * @return The selected option as a String.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Selects an option from the "Visit Type" dropdown based on the provided expected data.
     * - Retrieves and returns the first selected option from the dropdown.
     * - Prints the selected option for verification.
     *
     * @author YAKSHA
     */
	public String verifyOptionIsSelectedFromDropdown(Map<String, String> expectedData) throws Exception {

		//Write your logic here
				return null;
	}

	 /**
     * @Test15
     * Verifies the error notification popup message using a hard assert.
     * @param null
     * @return The full error notification message as a String.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Checks if the "Add Appointment" button is displayed.
     * - Highlights the "Add Appointment" button.
     * - Clicks the "Add Appointment" button to trigger the error notification popup.
     * - Verifies the presence of the error notification popup.
     * - Retrieves and prints the actual error message, status, and main error message.
     * - Concatenates and returns the full error notification message.
     *
     * @author YAKSHA
     */
	public String verifyErrorNotificationPopupMessage() throws Exception {
		//Write your logic here
				return null;
	}
	
	 /**
     * @Test16
     * Handles the auto-suggestion dropdown for selecting an OT Assistant.
     * @param expectedData - A Map containing the OT Assistant name to be searched and selected.
     * @return The selected OT Assistant name as a String.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Navigates to the "Operation Theatre" module.
     * - Clicks on the "New OT Booking" button.
     * - Clicks on the "Select OT Assistant Name" field and search box.
     * - Enters the OT Assistant's name into the search box.
     * - Selects the assistant from the auto-suggestion list.
     * - Clicks to confirm the selection.
     * - Verifies if the correct OT Assistant name is selected and returns it.
     *
     * @author YAKSHA
     */
	public String handleAutoSuggesstion(Map<String, String> expectedData) throws Exception {
		//Write your logic here
				return null;
	}
	
	

	/**
     * @Test17
     * Captures a screenshot of the current page.
     * @param null
     * @return true if the screenshot is successfully taken, otherwise false.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Clicks on the close button to exit the current module.
     * - Takes a screenshot of the "Operation Theatre Module".
     * - Returns true if the screenshot is successfully captured.
     *
     * @author YAKSHA
     */
	
	public Boolean takingScreenshotOfTheCurrentPage() throws Exception {
		//Write your logic here
				return false;
	}

	/**
     * @Test18
     * Verifies the tooltip text of an element in the Appointment Module.
     * @param null
     * @return The tooltip text as a String.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Navigates to the "Appointment" module.
     * - Waits for and interacts with the "Keyboard" button.
     * - Hovers over the element to trigger the tooltip.
     * - Retrieves and returns the tooltip text.
     *
     * @author YAKSHA
     */
	public String verifyToolTipOfAnElement() throws Exception {
		//Write your logic here
				return null;
	}
	

	  /**
     * @Test19
     * Handles an alert popup in the Operation Theatre Module.
     * @param null
     * @return true if the alert popup is successfully handled, otherwise false.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Navigates to the "Operation Theatre Module".
     * - Clicks on "New OT Booking".
     * - Clicks on "Add New OT" if available.
     * - Accepts and handles the alert popup.
     * - Returns true if the popup is successfully handled.
     *
     * @author YAKSHA
     */
	
	public boolean handleAlertPopup() throws Exception {

		//Write your logic here
				return false;
	}

	  /**
     * @Test20
     * Handles file upload in the Scanned Images section.
     * @param pathOfTheFile The file path of the image to be uploaded.
     * @return true if the file is successfully uploaded, otherwise false.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Navigates to the "Procurement Module".
     * - Opens the "Settings" tab.
     * - Selects the "Invoice Headers" sub-tab.
     * - Clicks the "Add New Invoice Header" button.
     * - Uploads a file in the "Scanned Images" section.
     * - Returns true if the upload is successful.
     *
     * @author YAKSHA
     */
	public Boolean uploadImageInScannedImagesSection(String pathOfTheFile) throws Exception {
		//Write your logic here
				return false;
	}

    /**
     * @Test21
     * Handles interaction with an iframe within the Purchase Order module.
     * @param expectedData A Map containing data values including text to enter in the iframe.
     * @return true if the iframe is handled successfully, otherwise false.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Navigates to the "Procurement Module".
     * - Opens the "Purchase Order" submodule.
     * - Clicks on the "Create Purchase Order" button.
     * - Highlights the "Add Purchase Order Title".
     * - Scrolls to the bottom of the page.
     * - Switches to an iframe and enters text.
     * - Switches back to the main content.
     * - Returns true if the iframe interaction is successful.
     *
     * @author YAKSHA
     */
	public boolean handleIframe(Map<String, String> expectedData) throws Exception {

		//Write your logic here
				return false;
	}

}
