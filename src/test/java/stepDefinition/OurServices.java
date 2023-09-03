package stepDefinition;

import org.junit.Assert;

import Utilitiez.commonMethods;
import Utilitiez.configurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookStore extends commonMethods {

	@When("User searches for a book by title or author")
	public void user_searches_for_a_book_by_title_or_author() {
		bsp.searchBox.sendKeys(configurationReader.getProperties("BookTitle"));
	}

	@Then("Relevant books should be displayed in the search results")
	public void relevant_books_should_be_displayed_in_the_search_results() {

		Assert.assertEquals(configurationReader.getProperties("BookTitle"), bsp.bookTitleText.getText());
	}

	@When("User selects a book from the list")
	public void user_selects_a_book_from_the_list() {
		bsp.bookButton.click();
	}

	@Then("Book details page should be displayed")
	public void book_details_page_should_be_displayed() {
		Assert.assertTrue(bsp.bookDescrip.isDisplayed());
	}

	@When("User adds the book to the collection")
	public void user_adds_the_book_to_the_collection() {
		waitForClickability(bsp.loginButton);
		bsp.loginButton.click();
		waitForVisibility(bsp.userNameField);
		bsp.userNameField.sendKeys(configurationReader.getProperties("Username"));
		bsp.passwordField.sendKeys(configurationReader.getProperties("Password"));
		bsp.loginButton.click();
		scrollDown(bsp.addCollectionButton);
		bsp.addCollectionButton.click();

	}

	@Then("Book should be added to the collection successfully")
	public void book_should_be_added_to_the_collection_successfully() {
		Assert.assertEquals(configurationReader.getProperties("AlertBoxText"), getTextAlert());
	}

	
}
