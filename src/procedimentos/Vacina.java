package procedimentos;

import java.util.ArrayList;
import java.util.List;

public class Vacina 
{
	
	String vacinaG;
	String vacinaC;
	private static ArrayList<String> VacinaCachorro;
	private static ArrayList<String> VacinaGato;


	public Vacina(String vacinaG, String vacinaC) 
	{
		this.vacinaG = vacinaG;
		this.vacinaC = vacinaC;
	}
	
	
	public String getVacinaG() 
	{
		return vacinaG;
	}
	public void setVacinaG(String vacinaG) 
	{
		this.vacinaG = vacinaG;
	}
	public String getVacinaC() 
	{
		return vacinaC;
	}
	public void setVacinaC(String vacinaC) 
	{
		this.vacinaC = vacinaC;
	}
	
	
	public static ArrayList<String> getVacinaCachorro() 
	{
		VacinaCachorro = new ArrayList<>();
		
		VacinaCachorro.add("V10: Protege contra cinomose, coro\nnavirose, hepatite infecciosa canina, "
						+ "\nleptospirose (sorovares Canicola, Icte\nrohaemorrhagiae, Grippotyphosa e Pomo\nna), "
																		+ "parainfluenza e parvovirose.");
		
		VacinaCachorro.add("V8: Protege contra cinomose, coro\nnavirose,hepatite infecciosa canina, "
											+ "\nleptospirose(sorovares Canicola e Icte\nrohaemorrhagiae),"
																	+ " parainfluenza e par\nvovirose.");
		
		VacinaCachorro.add("Antirrábica: Protege contra raiva.");
		return VacinaCachorro;
	}
	
	public static void setVacinaCachorro(ArrayList<String> vacinaCachorro) 
	{
		VacinaCachorro = vacinaCachorro;
	}
	
	
	public static ArrayList<String> getVacinaGato() 
	{
		VacinaGato = new ArrayList<>();
		VacinaGato.add("V5: Protege contra panleucopenia, calicivirose e rinotraqueíte + Leucemia Felina - FeLV.");
		VacinaGato.add("V4: Protege contra panleucopenia, calicivirose, rinotraqueíte e clamidiose.");
		VacinaGato.add("V3: Protege contra panleucopenia, calicivirose e rinotraqueíte.");
		VacinaGato.add("Antirrábica: Protege contra a raiva.");
		return VacinaGato;
	}
	
	public static void setVacinaGato(ArrayList<String> vacinaGato) 
	{
		VacinaGato = vacinaGato;
	}
	
}
