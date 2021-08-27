package pl.com.mikronika.mujobs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import pl.com.mikronika.mujobs.base.TestBase;

public class DodajUrzadzeniePage extends TestBase {
	
	@FindBy(xpath="//*[@id=\"adress_bar\"]/h3")
	WebElement pageHeader;
	
	@FindBy(id="urzadzenie_wewnetrzne175")
	WebElement przyrzadyNadzorowaneCheckbox;
	
	@FindBy(id="seria175")
	WebElement trybPrzyjeciaSeriiCheckbox;
	
	@FindBy(id="seria_smd")
	WebElement motazSMDCheckbox;
	
	@FindBy(id="nazwa_typ")
	WebElement typInput;
	
	@FindBy(id="nazwa_kategoria")
	WebElement typInputKategoria;
	
	@FindBy(id="nazwa_wersja")
	WebElement typInputWersja;
	
	@FindBy(name="id_autor")
	WebElement montujacySelect;
	
	@FindBy(name="id_autor2")
	WebElement montujacySelect2;
	
	@FindBy(name="data_produkcji")
	WebElement montujacyData;
	
	@FindBy(name="testujacy_id")
	WebElement testujacyOsoba;
	
	@FindBy(id="testowan_data")
	WebElement testujacyData;
	
	@FindBy(id="nazwa_obiekt")
	WebElement obiektInput;
	
	@FindBy(id="lokalizacja_nazwa")
	WebElement obiektLokalizacjaInput;
	
	@FindBy(id="data_obiekt")
	WebElement obiektDataInput;
	
	@FindBy(id="zamowienie_temat")
	WebElement zamowienieTematInput;
	
	@FindBy(id="zamowienie_nr_zamowienia")
	WebElement zamowienieNrZamowieniaInput;
	
	@FindBy(id="zamowienie_nr_zlecenia")
	WebElement zamowienieNrZleceniaInput;
	
	@FindBy(id="u__nr_ewid_u__nr_ewidencyjny3_1")
	WebElement nrEwidencyjny1;
	
	@FindBy(id="u__nr_ewid24_u__nr_ewidencyjny24_1")
	WebElement nrEwidencyjnyPrzyrzadyNadzorowane;
	
	@FindBy(id="nadzorowane175")
	WebElement nadzorowanyCheckboxPrzyrzadyNadzorowane;
	
	@FindBy(id="czasookres175")
	WebElement czasookresPrzyrzadyNadzorowane;
	
	@FindBy(id="uwagi175")
	WebElement uwagiPrzyrzadyNadzorowane;
	
	@FindBy(id="p__nazwa1")
	WebElement sprawdzajacyPrzyrzadyNadzorowane;
	
	@FindBy(id="zalacznik_id670_zalacznik_data_sprawdzenia670_1")
	WebElement sprawdzonoDataPrzyrzadyNadzorowane;
	
	@FindBy(id="zalacznik_id670_zalacznik_opis670_1")
	WebElement komentarzPrzyrzadyNadzorowane;
	
	@FindBy(id="uwh__id560_uwh__id_uzytkownik560_1")
	WebElement pobraniaOsobaPrzyrzadyNadzorowane;
	
	@FindBy(id="uwh__id560_uwh__data560_1")
	WebElement pobraniaDataPrzyrzadyNadzorowane;
	
	@FindBy(id="search_button")
	WebElement searchBtn;
	
	@FindBy(id="cell_4244_1")
	WebElement firstCellElement;
	
	public DodajUrzadzeniePage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	
	public String verifyPageHeader() {
		return pageHeader.getText();
	}
	
	public void addNewPrzyrzadyNadzorowane() {
		przyrzadyNadzorowaneCheckbox.click();
		typInputKategoria.click();
		switchToNewWindow();
		searchBtn.click();
		firstCellElement.click();
	}
	
	
	
	
}
