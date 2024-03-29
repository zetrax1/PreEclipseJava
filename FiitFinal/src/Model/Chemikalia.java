package Model;
/**
 * 
 *@author Vladimír Večerek
 *Objekt Chemikália určujúci jej vlastnosti
 */

public class Chemikalia {
	/**
	 * 
	 *Vlasnosti chemikálie
	 *
	 */
													// vlasnosti chemikálie
	private int ID;
	private int hmotnost;
	private String nazov;
	private String vzorec;
	private boolean reaktivita;
	private int zabezpecenie;
	private String skupenstvo;
	
	/**
	 * 
	 *Konštruktor
	 *@param id int id chemikálie
	 *@param weight int hmotnosť chemikálie
	 *@param name String meno chemikálie
	 *@param model String Chemický vzorec
	 *@param reactivity Boolean reaktivita chemikálie - true reaktívna
	 *@param security zabezpečenie chemikálie
	 *@param state skupenstvo chemikálie
	 */
													//konštruktor pridelujúci vlasnosti
	
	public Chemikalia(int id, int weight, String name, String model, boolean reactivity, int security, String state){
		this.ID=id;
		this.hmotnost=weight;
		this.nazov=name;
		this.vzorec=model;
		this.reaktivita=reactivity;
		this.zabezpecenie= security;
		this.skupenstvo= state;
		
	}
														//overloading "overriding" pretaženie
	public Chemikalia(int id, int mnozstvo) {
		this.ID=id;
		this.hmotnost=mnozstvo;
	}
															// pratenie aktualnej hodnoty pre premenné
	public int getID(){
		return this.ID;
	}
	
	public int getHmot(){
		return this.hmotnost;
	}
	public String getNazov(){
		return this.nazov;
	}
	public String getVzorec(){
		return this.vzorec;
	}
	public boolean getReaktivita(){
		return this.reaktivita;
	}
	public int getZabezpecenie(){
		return this.zabezpecenie;
	}
	
	public String getSkupenstov(){
		return this.skupenstvo;
	}
	
	
	
	
}
