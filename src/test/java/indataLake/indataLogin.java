package indataLake;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasicData;
import base.claseBase;

public class indataLogin extends claseBase {

	public indataLogin(WebDriver driver) {
		super(driver);
	}

	public void signIn() throws InterruptedException{
		try {
			if (isDisplayed(LocatorIndataLake.LOCATOR_USER)) {
				type(BasicData.USER_NAME, LocatorIndataLake.LOCATOR_USER);
				Thread.sleep(2000);
				type(BasicData.PASSWORD, LocatorIndataLake.LOCATOR_PASSWORD);
				Thread.sleep(3000);
				click(LocatorIndataLake.LOCATOR_INICIO_SESION);

			} else {
				System.out.println("No se encontro pagina de login");
			}

		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	public void createCampaign(String TemplateType) throws InterruptedException {
		try {
			if (isDisplayed(LocatorIndataLake.LOCATOR_XPATH)) {
				Thread.sleep(2000);
				click(LocatorIndataLake.LOCATOR_CREAR_PLANTILLA);
				Thread.sleep(2000);
				if (BasicData.TEMPLATE_TYPE_1.equals(TemplateType)) {
					click(LocatorIndataLake.LOCATOR_SELECCIONAR_1_COLUMNA);
				}

				if (BasicData.TEMPLATE_TYPE_2.equals(TemplateType)) {
					click(LocatorIndataLake.LOCATOR_SELECCIONAR_2_COLUMNA);
				}

				if (BasicData.TEMPLATE_TYPE_3.equals(TemplateType)) {
					click(LocatorIndataLake.LOCATOR_SELECCIONAR_3_COLUMNA);
				}

				if (BasicData.TEMPLATE_TYPE_4.equals(TemplateType)) {
					click(LocatorIndataLake.LOCATOR_SELECCIONAR_4_COLUMNA);
				}

			} else {
				System.out.println("No se logro ingresar a la pagina");
			}
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

	}

	public void create() {
		try {
			if (isDisplayed(LocatorIndataLake.LOCATOR_CREAR)) {
				Thread.sleep(5000);
				click(LocatorIndataLake.LOCATOR_CREAR);
				type(BasicData.NOMBRA_TU_PLANTILLA, LocatorIndataLake.LOCATOR_NOMBRE_PLANTILLA);
				Thread.sleep(3000);
				click(LocatorIndataLake.LOCATOR_GUARDAR_NOMBRE);
				
			} else {
				System.out.println("No se encontro pagina de login");
			}

		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
	
}

/**
 * public void form(String RadioButtons) throws InterruptedException { try { if
 * (isDisplayed(LocatorIndataLake.LOCATOR_CREAR)) { Thread.sleep(5000);
 * click(LocatorIndataLake.LOCATOR_CREAR); Thread.sleep(2000); if
 * (BasicData.RADIO_BUTTONS_1.equals(RadioButtons)) {
 * click(LocatorIndataLake.LOCATOR_PRODUCTO_RADIO); type(BasicData.PRODUCTO,
 * LocatorIndataLake.LOCATOR_PRODUCTO); type(BasicData.URL,
 * LocatorIndataLake.LOCATOR_URL); type(BasicData.TIPO_PRODUCTO,
 * LocatorIndataLake.LOCATOR_ASUNTO); Thread.sleep(2000);
 * click(LocatorIndataLake.LOCATOR_GUARDAR_SALIR); }
 * if(BasicData.RADIO_BUTTONS_2.equals(RadioButtons)) {
 * click(LocatorIndataLake.LOCATOR_TIPO_PRODUCTO_RADIO);
 * type(BasicData.PRODUCTO, LocatorIndataLake.LOCATOR_TIPO_PRODUCTO);
 * type(BasicData.URL, LocatorIndataLake.LOCATOR_URL);
 * type(BasicData.TIPO_PRODUCTO, LocatorIndataLake.LOCATOR_ASUNTO);
 * Thread.sleep(2000); click(LocatorIndataLake.LOCATOR_GUARDAR_SALIR); }
 * if(BasicData.RADIO_BUTTONS_3.equals(RadioButtons)) {
 * click(LocatorIndataLake.LOCATOR_FECHA_COMPRA_RADIO); type(BasicData.PRODUCTO,
 * LocatorIndataLake.LOCATOR_FECHA_INICIAL); type(BasicData.PRODUCTO,
 * LocatorIndataLake.LOCATOR_FECHA_FINAL); type(BasicData.URL,
 * LocatorIndataLake.LOCATOR_URL); type(BasicData.TIPO_PRODUCTO,
 * LocatorIndataLake.LOCATOR_ASUNTO); Thread.sleep(2000);
 * click(LocatorIndataLake.LOCATOR_GUARDAR_SALIR); } }
 * 
 * } catch (Exception e) { System.out.println("Error: " + e); } }
 **/
