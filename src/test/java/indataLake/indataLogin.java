package indataLake;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasicData;
import base.claseBase;

public class indataLogin extends claseBase {

	public indataLogin(WebDriver driver) {
		super(driver);
	}

	public void signIn() {
		try {
			if (isDisplayed(LocatorIndataLake.LOCATOR_USER)) {
				type(BasicData.USER_NAME, LocatorIndataLake.LOCATOR_USER);
				type(BasicData.PASSWORD, LocatorIndataLake.LOCATOR_PASSWORD);
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
				Thread.sleep(4000);
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
				
				Thread.sleep(5000);
				click(LocatorIndataLake.LOCATOR_CREAR);
				Thread.sleep(2000);
				click(LocatorIndataLake.LOCATOR_PRODUCTO_RADIO);
				type(BasicData.PRODUCTO, LocatorIndataLake.LOCATOR_PRODUCTO);
				type(BasicData.URL, LocatorIndataLake.LOCATOR_URL);
				type(BasicData.TIPO_PRODUCTO, LocatorIndataLake.LOCATOR_ASUNTO);
				Thread.sleep(2000);
				click(LocatorIndataLake.LOCATOR_GUARDAR_SALIR);

			} else {
				System.out.println("No se logro ingresar a la pagina");
			}
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

	}

}
