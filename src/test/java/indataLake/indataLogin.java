package indataLake;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class indataLogin extends claseBase{
	
	By locator_user =By.id("email");
	By locator_password =By.id("password");
	By locator_inicioSesion =By.xpath("/html/body/app-root/app-sign-in/div/div/div/div/div/div/form/div[3]/button");
	By locator_xphat =By.xpath("/html/body/app-root/app-sign-in/div/div/div/div/div/div/div/img");
	By locator_plantilla = By.linkText("Crear Plantilla");
	By locator_seleccionar =By.xpath("/html/body/app-root/app-indatalake-layout/div/div/div/div/app-template-browser/div/div[1]/div/div/button");
	By locator_crear= By.xpath("//*[@id=\"modal\"]/button");
	By locator_productoradio= By.id("inlineRadio1");
	By locator_producto= By.id("producto");
	By locator_url= By.xpath("//*[@id=\"exampleModal\"]/div/div/div/app-massive-campaing/div/div/div[2]/form/div/div[1]/div[2]/div/input");
	By locator_asunto =By.id("asunto");
	By locator_guardarSal=By.linkText("Guardar y salir");
	
	public indataLogin(WebDriver driver) {
		super(driver);
	}

	public void signIn() {
		if(isDisplayed(locator_user)){
			type("camilo@yopmail.com", locator_user);
			type("0.jjcmmt", locator_password);
			click(locator_inicioSesion);
			
		}else {
			System.out.println("No se encontro pagina de login");
		}
		}
		
		public boolean isHomePageDisplayed(){
			return isDisplayed(locator_xphat);
			
		}
	
	public void createCampaign() throws InterruptedException{
		if(isDisplayed(locator_xphat)){
			
		click(locator_plantilla);
		Thread.sleep(2000);
		click(locator_seleccionar);
		Thread.sleep(2000);
		click(locator_crear);
		Thread.sleep(2000);
		click(locator_productoradio);
		type("inalámbricos", locator_producto);
		type("https://www.inalambricos.com", locator_url);
		type("Todo tipo de perifericos inalambricos", locator_producto);
		Thread.sleep(2000);
		click(locator_guardarSal);

		
	}else {
		System.out.println("No se logro ingresar a la pagina");
	}
	
		
	}
	
	
}
