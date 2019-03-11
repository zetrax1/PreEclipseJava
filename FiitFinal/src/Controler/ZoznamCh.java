package Controler;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.omg.CORBA.PRIVATE_MEMBER;
import Sklady.Sklad;
import Sklady.SkladStupenZabezpeceniaDva;
import Sklady.SkladStupenZabezpeceniaJedna;
import Sklady.SkladStupenZabezpeceniaPat;
import Sklady.SkladStupenZabezpeceniaStyri;
import Sklady.SkladStupenZabezpeceniaTri;

/**
 * 
 *@author Vladim�r Ve�erek
 *Trieda pracuj�ca zo s�borom zo zoznamom Chemik�li�
 */
public class ZoznamCh {

	private Scanner subor;
	private String pole = null;
	
	/**
	 * Funkcia na otvorenie s�boru
	 * 
	 */

	public void otvorSubor() {								// otvorenie s�boru
		try {
			subor = new Scanner(new File("/home/zetrax/eclipse-workspace/FiitFinal/src/Chemikalie.txt"));
		} catch (Exception e) {
			System.out.println("subor sa nepodarilo otvorit");

		}

	}
	/**
	 * Funkcia na resetnutie s�boru na za�iatok
	 * 
	 */

	public void resetniSubor() {					//resetnutie s�boru
		subor.reset();
		otvorSubor();
	}
	
	/**
	 * Funkcia pridel� n�zvu chemik�lie jej id
	 * @param hladanyNazov String n�zov chemik�lie
	 * @return id chemik�lie , ak sa chemik�lie nenach�dza v zozname vr�ti String "Chemikalia nieje v zozname"
	 */

	public String citajSuborPoSlovach(String hladanyNazov) {			// prejdnie s�bor po slov�ch
		while (subor.hasNext()) {
			String identicikacneCislo = subor.next();
			String nazov = subor.next();
			String chemickaSkratka = subor.next();
			String reaktivita = subor.next();
			String skupenstvo = subor.next();
			int zabezpecenie = subor.nextInt();

			if (hladanyNazov.equals(nazov)) {
				return identicikacneCislo;
			}
		}
		return "Chemikalia nieje v zozname";
	}
	
	
	/**
	 * Funkcia zist� ,�i id chemik�lie existuje v zozname
	 * @param kodProduktu String id 
	 * @return boolean true ak sa chemik�lia nach�dza v zozname
	 */

	
	public  boolean zistiIdZoznam(String kodProduktu) throws VlastnaVynimka {			// overenie chemik�lie v zozname
		otvorSubor();
		while (subor.hasNext()) {
			String identicikacneCislo = subor.next();
			String nazov = subor.next();
			String chemickaSkratka = subor.next();
			String reaktivita = subor.next();
			String skupenstvo = subor.next();
			int zabezbecenie = subor.nextInt();

			if (kodProduktu.equals(identicikacneCislo) ) {
				zavriSubor();
				return true;
				
			}
		}
		zavriSubor();
		throw new VlastnaVynimka();
	}
	
	/**
	 * Funkcia pridel� k id chemik�lie jej reaktivitu
	 * @param kodProduktu String id chemik�lie
	 * @return boolean true ak je chemik�lia reakt�vna
	 */
	
	public  boolean citajSuborPreReaktivitu(String kodProduktu) {				// pridelenie reaktivity pre id
		otvorSubor();
		while (subor.hasNext()) {
			String identicikacneCislo = subor.next();
			String nazov = subor.next();
			String chemickaSkratka = subor.next();
			String reaktivita = subor.next();
			String skupenstvo = subor.next();
			int zabezbecenie = subor.nextInt();

			if (kodProduktu.equals(identicikacneCislo) && reaktivita.equals("reaktivny")) {
				zavriSubor();
				return true;
			}
		}
		zavriSubor();
		return false;
		
	}
	
	/**
	 * Funkcia pridel� pre zadan� id chemik�lie jej skupenstvo
	 * @param kodProduktu String id chemik�lie
	 * @return String skupenstvo chemik�lie
	 */

	public String citajSuborPreSkupenstvo(String kodProduktu) {				// pridelenie skupenstva pre id
		otvorSubor();
		while (subor.hasNext()) {
			String identicikacneCislo = subor.next();
			String nazov = subor.next();
			String chemickaSkratka = subor.next();
			String reaktivita = subor.next();
			String skupenstvo = subor.next();
			int zabezbecenie = subor.nextInt();

			if (kodProduktu.equals(identicikacneCislo)) {
				zavriSubor();
				return skupenstvo;
			}
		}
		zavriSubor();
		return kodProduktu;

	}
	
	/**
	 * Funkcia pridel� pre zadan� id chemik�lie jej stupen zabezpe�enia
	 * @param kodProduktu String id chemik�lie
	 * @return zabezbecenie Int stupen zabezpe�enia chemik�lie
	 */

	public int citajSuborPreStupen(String kodProduktu) {			// pridelenie stupna zabezpe�enia pre id
		while (subor.hasNext()) {
			String identicikacneCislo = subor.next();
			String nazov = subor.next();
			String chemickaSkratka = subor.next();
			String reaktivita = subor.next();
			String skupenstvo = subor.next();
			int zabezbecenie = subor.nextInt();

			if (kodProduktu.equals(identicikacneCislo)) {
				return zabezbecenie;
			}
		}

		return 0;

	}
	
	/**
	 * Pre��ta v s�bore jeden riadok
	 * @return riadok
	 */

	public String citajSuborJedenRiadok() {				//pre��tanie jedn�ho riadku
		String riadok;
		riadok = subor.nextLine();

		return riadok;

	}
	
	/**
	 * pre��ta cel� s�bor
	 * @return pole String cel� s�bor
	 */

	public String citajSuborCely() {						// pre��tanie cel�ho s�boru

		subor.reset();
		pole = subor.nextLine();

		while (subor.hasNext()) {
			pole = pole + "\n" + subor.nextLine();

		}

		return pole;
	}

	/**
	 * Funkcia zavrie s�bor
	 * 
	 */

	public void zavriSubor() {
		subor.close();
	}

}
