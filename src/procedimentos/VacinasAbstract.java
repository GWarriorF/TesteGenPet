package procedimentos;

import java.util.ArrayList;
import java.util.List;

public abstract class VacinasAbstract {
	
	String vacinaG;
	String vacinaC;
	private static List<String> VacinaCachorro;
	private static List<String> VacinaGato;


	public VacinasAbstract(String vacinaG, String vacinaC) {
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
		VacinaCachorro.add("V8");
		VacinaCachorro.add("V10");
		VacinaCachorro.add("Antirrábica");
		return VacinaCachorro;
	}
	public static void setVacinaCachorro(List<String> vacinaCachorro) {
		VacinaCachorro = vacinaCachorro;
	}
	public static List<String> getVacinaGato() 
	{
		VacinaGato = new ArrayList<>();
		VacinaGato.add("V5");
		VacinaGato.add("V4");
		VacinaGato.add("V3");
		VacinaGato.add("Antirrábica");
		return VacinaGato;
		}
	
	public static void setVacinaGato(List<String> vacinaGato) {
		VacinaGato = vacinaGato;
	}
}
