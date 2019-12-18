package com.pf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Amazonpf {

	
WebDriver driver;

	
	public Amazonpf(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	

	



	@FindBy(how=How.XPATH, using="//*[contains(span, 'Hello. Sign in')]")
	private WebElement Sign;
	
	@FindBy(how=How.XPATH, using="//*[contains(@type, 'email')]")
	private WebElement Email;
	
	@FindBy(how=How.XPATH, using="//*[contains(@id, 'continue')]")
	private WebElement Continue;
	
	@FindBy(how=How.XPATH, using="//*[contains(@type, 'password')]")
	private WebElement Password;
	
	@FindBy(how=How.XPATH, using="//*[contains(@id, 'signInSubmit')]")
	private WebElement SignIn;
	
	@FindBy(how=How.XPATH, using="//*[contains(span, 'Amazon')]")
	private WebElement Amazon;
	
	@FindBy(how=How.XPATH, using="//*[contains(@id, 'twotabsearchtextbox')]")
	private WebElement Search1;
	

	@FindBy(how=How.XPATH, using="//*[contains(@tabindex, '20')]")
	private WebElement ClickSearch1;
	
	@FindBy(how=How.XPATH, using="//*[contains(@class, 'a-spacing-top-mini')][1]")
	private WebElement LH1;
	
	@FindBy(how=How.XPATH, using="//*[contains(@value, 'price-asc-rank')]")
	private WebElement ChooseLH1;
	
	@FindBy(how=How.XPATH, using="//*[contains(@value, 'price-desc-rank')]")
	private WebElement ChooseHL1;
	
	@FindBy(how=How.XPATH, using="//*[contains(@data-attribute,'Apple iPhone 4 16GB (A1332) - GSM Factory Unlocked - No Warranty (Black)' )]")
	private WebElement Pickiphone;
	
	@FindBy(how=How.XPATH, using="//*[contains(@data-attribute,'HP Chromebook 11 G3 11.6-inch Intel Celeron N2840 4GB 16GB SSD Storage Google Chrome OS Notebook Laptop')]")
	private WebElement Pickhp;
	
	@FindBy(how=How.XPATH, using="//*[contains(@id,'add-to-cart-button-ubb' )]")
	private WebElement Addtocart;
	
	@FindBy(how=How.XPATH, using="//*[contains(@class, 'nav-cart-icon nav-sprite')]")
	private WebElement Cart;

	@FindBy(how=How.XPATH, using="//*[contains(@name, 'proceedToCheckout')]")
	private WebElement ProceedtoCh;
	
	@FindBy(how=How.XPATH, using="//*[contains(@class, 'a-declarative a-button-text')][1]")
	private WebElement Deliver;
	
	@FindBy(how=How.XPATH, using="//*[contains(@value, 'Continue')][1]")
	private WebElement ContinueCh;
	
	@FindBy(how=How.XPATH, using="//*[contains(@class, 'a-width-base')]")
	private WebElement Cardname;
	
	@FindBy(how=How.XPATH, using="//*[contains(@name, 'addCreditCardNumber')]")
	private WebElement Cardnumber;
	
	@FindBy(how=How.XPATH, using="//*[contains(@id, 'ccAddCard')]")
	private WebElement Addcard;
	
	@FindBy(how=How.XPATH, using="//*[contains(@id, 'addCreditCard_BadType')]")
	private WebElement BadCard;
	
	public WebElement getCart() {
		return Cart;
	}


	public WebElement getProceedtoCh() {
		return ProceedtoCh;
	}


	public WebElement getDeliver() {
		return Deliver;
	}


	public WebElement getContinueCh() {
		return ContinueCh;
	}


	public WebElement getCardname() {
		return Cardname;
	}


	public WebElement getCardnumber() {
		return Cardnumber;
	}


	public WebElement getAddcard() {
		return Addcard;
	}


	public WebElement getBadCard() {
		return BadCard;
	}

	
	
	
	public WebElement getPickhp() {
		return Pickhp;
	}

	
	public WebElement getAddtocart() {
		return Addtocart;
	}

	public WebElement getPickiphone() {
		return Pickiphone;
	}

	public WebElement getChooseHL1() {
		return ChooseHL1;
	}

	public WebElement getChooseLH1() {
		return ChooseLH1;
	}

	public WebElement getSign() {
		return Sign;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSignIn() {
		return SignIn;
	}

	public WebElement getAmazon() {
		return Amazon;
	}
	
	public WebElement getSearch1() {
		return Search1;
	}

	public WebElement getClickSearch1() {
		return ClickSearch1;
	}
	
	public WebElement getLH1() {
		return LH1;
	}
	
	
	
	
}
