package procedimentos;

import java.util.ArrayList;
import java.util.List;

public class Vacina {
	
	String vacinaG;
	String vacinaC;
	private static List<String> VacinaCachorro;
	private static List<String> VacinaGato;


	public Vacina(String vacinaG, String vacinaC) {
		this.vacinaG = vacinaG;
		this.vacinaC = vacinaC;
	}
	
	
	public String getVacinaG() {
		return vacinaG;
	}
	public void setVacinaG(String vacinaG) {
		this.vacinaG = vacinaG;
	}
	public String getVacinaC() {
		return vacinaC;
	}
	public void setVacinaC(String vacinaC) {
		this.vacinaC = vacinaC;
	}
	
	
	public static List<String> getVacinaCachorro() {
		VacinaCachorro = new ArrayList<>();
		VacinaCachorro.add("V8 \n Protege contra: cinomose, coronavirose, hepatite infecciosa canina, \r\n"
				+ "leptospirose (sorovares Canicola e Icterohaemorrhagiae), parainfluenza e \r\n"
				+ "parvovirose.");
		VacinaCachorro.add("\nV10 \nProtege contra: cinomose, coronavirose, hepatite infecciosa canina, \r\n"
				+ "leptospirose (sorovares Canicola, Icterohaemorrhagiae, Grippotyphosa e Pomona), \r\n"
				+ "parainfluenza e parvovirose.");
		VacinaCachorro.add("\nAntirrábica \nProtege contra raiva.");
		return VacinaCachorro;
	}
	public static void setVacinaCachorro(List<String> vacinaCachorro) {
		VacinaCachorro = vacinaCachorro;
	}
	public static List<String> getVacinaGato() 
	{
		VacinaGato = new ArrayList<>();
		VacinaGato.add("\nV5 \nProtege contra panleucopenia, calicivirose e rinotraqueíte + Leucemia Felina - FeLV.");
		VacinaGato.add("\nV4 \nProtege contra panleucopenia, calicivirose, rinotraqueíte e clamidiose.");
		VacinaGato.add("\nV3 \nProtege contra panleucopenia, calicivirose e rinotraqueíte.");
		VacinaGato.add("\nAntirrábica \nProtege contra a raiva.");
		return VacinaGato;
		}
	
	public static void setVacinaGato(List<String> vacinaGato) {
		VacinaGato = vacinaGato;
	}
}
