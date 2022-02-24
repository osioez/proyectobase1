package co.com.choucair.certification.proyectobase1.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_UC = Target.the("Seleccionar la universidad choucar")
            .located(By.xpath("//div[@id='universidad']//strong"));

    public static final Target INPUT_COURSE = Target.the("Buscar curso")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target.the("da click para buscar el curso ")
            .located(By.xpath("//button[@class='btn btn-secondary']"));

    public static final Target SELECT_COURSE = Target.the("click para seleccionar curso")
            .located(By.xpath("//h4 //a[contains(text(),'')]"));

    public static final Target NAME_COURSE = Target.the("tomando seleccion curso")
            .located(By.xpath("//h4 //a[contains(text(),'')]"));


}
