package steps;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;


public class AutomobileInsuranceSteps {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	
	@Dado("que acesso o site {string} na tela vehicle data")
	public void que_acesso_o_site(String string) {
		driver.get("http://sampleapp.tricentis.com/101/app.php");
	}
	
	@Quando("estou com acesso na aba enter vehicle data")
	public void estou_com_acesso_na_aba_enter_vehicle_data() {
		//etapa de validação no título da aba
	}
	

	@E("preencho todos os campos de forma correta e clico em next")
	public void preencho_todos_os_campos_de_forma_correta() {
		
		//seleciona o nome Audi no Make
		WebElement vehicle = driver.findElement(By.id("make"));
	    Select selectVehicle = new Select(vehicle);
		selectVehicle.selectByValue("Audi");
		
		//preenche o campo Model com Scooter
		WebElement model = driver.findElement(By.id("model"));
		Select models = new Select(model); 
		models.selectByValue("Scooter");
		
		//preenche o campo cylinder capacity
		WebElement cylinder  = driver.findElement(By.id("cylindercapacity"));
		cylinder.clear();
		cylinder.sendKeys("1");
		
		//preenche com o valor de 2000 em Engine Performance
		WebElement performanceKw  = driver.findElement(By.id("engineperformance"));
		performanceKw.clear();
		performanceKw.sendKeys("2000");
		
		//preenche a data em Date of manufacture
		WebElement dateSelect = driver.findElement(By.id("dateofmanufacture"));
		dateSelect.clear();
		dateSelect.sendKeys("12/31/2010");
		
		//preenche number of seats
		WebElement number = driver.findElement(By.id("numberofseats"));
		Select seats = new Select(number); 
		seats.selectByValue("1");
		
		//selecionando 'no' no Rigth hand drive
		WebElement handDrive = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span"));
		handDrive.click();
		
		//selecionando number of seats motorcycle
		WebElement numberMotorcycle = driver.findElement(By.id("numberofseatsmotorcycle"));
		Select motoNumber = new Select(numberMotorcycle); 
		motoNumber.selectByValue("2");
		
		//selecionando fuel type 
		WebElement type = driver.findElement(By.id("fuel"));
		Select fuel = new Select(type); 
		fuel.selectByValue("Diesel");
		
		//preenchenco payload
		WebElement payload  = driver.findElement(By.id("payload"));
		payload.clear();
		payload.sendKeys("500");
		
		//preenchendo total weight
		WebElement totalWeight  = driver.findElement(By.id("totalweight"));
		totalWeight.clear();
		totalWeight.sendKeys("100");
		
		//preenchendo list price
		WebElement listPrice  = driver.findElement(By.id("listprice"));
		listPrice.clear();
		listPrice.sendKeys("500");
		
		//preechendo license plate
		WebElement licensePlate  = driver.findElement(By.id("licenseplatenumber"));
		licensePlate.clear();
		licensePlate.sendKeys("AAAAAA1234");
		
		//preenchendo Annual Mileage
		WebElement annualMi  = driver.findElement(By.id("annualmileage"));
		annualMi.clear();
		annualMi.sendKeys("5000");
		
		WebElement btn = driver.findElement(By.id("nextenterinsurantdata"));
		btn.click();
	    
	}


	@E("preencho todos os campos de enter insurant data e clico em next")
	public void preencho_todos_os_campos_de_enter_insurant_data() {
	    //preenchendo first tname
		WebElement firstname  = driver.findElement(By.id("firstname"));
		firstname.clear();
		firstname.sendKeys("Jessica");
					
		//preenchendo last name
		WebElement lastname  = driver.findElement(By.id("lastname"));
		lastname.clear();
		lastname.sendKeys("Oliveira");
		
		//preenchendo data of birth
		WebElement dataBirth = driver.findElement(By.id("birthdate"));
		dataBirth.clear();
		dataBirth.sendKeys("7/01/1951");
		
		//selecionando o gender Female
		WebElement gender = driver.findElement(By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(2) > span"));
		gender.click();
		
		//preenchendo o street address
		WebElement streetAddress  = driver.findElement(By.id("streetaddress"));
		streetAddress.clear();
		streetAddress.sendKeys("Estrada Água Chata");
				
		//selecionando Country
		WebElement country = driver.findElement(By.id("country"));
		Select countrySelected = new Select(country); 
		countrySelected.selectByValue("Brazil");
		
		//preenchendo zipcode
		WebElement zip  = driver.findElement(By.id("zipcode"));
		zip.clear();
		zip.sendKeys("23400");
		
		//preenchendo city
		WebElement city  = driver.findElement(By.id("city"));
		city.clear();
		city.sendKeys("Guarulhos");
		
		//selecionando occupation
		WebElement occupation = driver.findElement(By.id("occupation"));
		Select occupationSelected = new Select(occupation); 
		occupationSelected.selectByValue("Employee");
		
		//selecionando hobbies no check
		WebElement hobbies  = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span"));
		hobbies.click();	
		
		//preenchendo website
		WebElement website  = driver.findElement(By.id("website"));
		website.clear();
		website.sendKeys("https://www.linkedin.com/in/j%C3%A9ssica-bianca/");
		
		//clicando no next
		WebElement btn = driver.findElement(By.id("nextenterproductdata"));
		btn.click();
		
	}

	@E("preencho todos os campos de enter product data e clico em next")
	public void preencho_todos_os_campos_de_enter_product_data() {
		
		//preenchendo start date
		WebElement startdate = driver.findElement(By.id("startdate"));
		startdate.clear();
		startdate.sendKeys("07/30/2021");
				
		//selecionando insurancesum
		WebElement insurancesum = driver.findElement(By.id("insurancesum"));
		Select insurancesumSelected = new Select(insurancesum); 
		insurancesumSelected.selectByValue("30000000");
		
		//selecionando merit rating
		WebElement meritRating = driver.findElement(By.id("meritrating"));
		Select meritRatingSelected = new Select(meritRating); 
		meritRatingSelected.selectByValue("Super Bonus");
		
		//selecionando damage insurance
		WebElement damageInsurance = driver.findElement(By.id("damageinsurance"));
		Select demageInsuranceSelected = new Select(damageInsurance); 
		demageInsuranceSelected.selectByValue("No Coverage");
		
		//Selecionando Optional Products (Euro Protection)
		WebElement optProducts = driver.findElement(By.cssSelector("#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span"));
		optProducts.click();
		
		//selecionando courtesycar
		WebElement courtesycar = driver.findElement(By.id("courtesycar"));
		Select courtesycarSelected = new Select(courtesycar); 
		courtesycarSelected.selectByValue("Yes");
		
		//clicando em next
		WebElement btn = driver.findElement(By.id("nextselectpriceoption"));
		btn.click();
		
	}

	@E("seleciono o Ultimate e clico em next")
	public void seleciono_o_ultimate() {
		//selecionando o plano utilmate 
	   WebElement ultimateBtn = driver.findElement(By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(4) > span"));
	   ultimateBtn.click();
	   //clicando em next
	   driver.findElement(By.id("nextsendquote")).click();
	}

	@E("preencho todos os campos de send quote")
	public void preencho_todos_os_campos_de_send_quote() {
		//preenchendo o campo email
	    WebElement email = driver.findElement(By.id("email"));
	    email.clear();
	    email.sendKeys("jessica@gmail.com");
	    
	    //preenchendo o campo phone
	    WebElement phone = driver.findElement(By.id("phone"));
	    phone.clear();
	    phone.sendKeys("999999999");
	    
	    //preenchendo o campo username
	    WebElement username = driver.findElement(By.id("username"));
	    username.clear();
	    username.sendKeys("jessica_23");
	    
	    //preenchendo a senha
	    WebElement pass = driver.findElement(By.id("password"));
	    pass.clear();
	    pass.sendKeys("P@ssw0rd");
	    
	    //confirmando password
	    WebElement passConfirm = driver.findElement(By.id("confirmpassword"));
	    passConfirm.clear();
	    passConfirm.sendKeys("P@ssw0rd");
	    
	    //preenchendo comments
	    WebElement comments = driver.findElement(By.id("Comments"));
	    comments.clear();
	    comments.sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry");
	    
	    driver.findElement(By.id("sendemail")).click();
	    
	    
	}

	@Então("recebo a mensagem Sending e-mail success")
	public void recebo_a_mensagem_sending_e_mail_success() {
		//etapa de validação da mensagem na tela
	}
	
	@After
	public void exit() {
		driver.quit();
	}

}
