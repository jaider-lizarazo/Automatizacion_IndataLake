package indataLake;

import org.openqa.selenium.By;

public class LocatorIndataLake {

	public static final By LOCATOR_USER = By.id("email");
	public static final By LOCATOR_PASSWORD = By.id("password");
	public static final By LOCATOR_INICIO_SESION = By
			.xpath("/html/body/app-root/app-sign-in/div/div/div/div/div/div/form/div[3]/button");
	public static final By LOCATOR_XPATH = By.xpath("/html/body/app-root/app-sign-in/div/div/div/div/div/div/div/img");
	public static final By LOCATOR_CREAR_PLANTILLA = By.linkText("Crear Plantilla");
	public static final By LOCATOR_SELECCIONAR_1_COLUMNA = By.xpath(
			"/html/body/app-root/app-indatalake-layout/div/div/div/div/app-template-browser/div/div[1]/div/div/button");
	public static final By LOCATOR_SELECCIONAR_2_COLUMNA = By.xpath(
			"/html/body/app-root/app-indatalake-layout/div/div/div/div/app-template-browser/div/div[2]/div/div/button");
	public static final By LOCATOR_SELECCIONAR_3_COLUMNA = By.xpath(
			"/html/body/app-root/app-indatalake-layout/div/div/div/div/app-template-browser/div/div[3]/div/div/button");
	public static final By LOCATOR_SELECCIONAR_4_COLUMNA = By.xpath(
			"/html/body/app-root/app-indatalake-layout/div/div/div/div/app-template-browser/div/div[4]/div/div/button");
	public static final By LOCATOR_CREAR = By.xpath("//*[@id=\"modal\"]/button");
	public static final By LOCATOR_PRODUCTO_RADIO = By.id("inlineRadio1");
	public static final By LOCATOR_PRODUCTO = By.id("producto");
	public static final By LOCATOR_URL = By.xpath(
			"//*[@id=\"exampleModal\"]/div/div/div/app-massive-campaing/div/div/div[2]/form/div/div[1]/div[2]/div/input");
	public static final By LOCATOR_ASUNTO = By.id("asunto");
	public static final By LOCATOR_GUARDAR_SALIR = By
			.xpath("//*[@id=\"exampleModal\"]/div/div/div/app-massive-campaing/div/div/div[1]/div[2]/div/p");

}
