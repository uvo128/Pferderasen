import java.util.LinkedList;
import java.util.List;

import org.yogahorseman.pferdeklassen.Pferderasse;

public class TestWesternPferde {

	public static void main(String[] args) {
		
		List<Pferderasse> pferderassen = new LinkedList<Pferderasse>();
		
		Pferderasse pferderasseAQH = new Pferderasse();
		pferderasseAQH.setRassenname("American Quater Horse");
		pferderasseAQH.setKathegorie("Westernpferd");
		pferderassen.add(pferderasseAQH);
		
		Pferderasse pferderasseCH = new Pferderasse();
		pferderasseCH.setRassenname("Curly Horse");
		pferderasseCH.setKathegorie("Westernpferd");
		pferderassen.add(pferderasseCH);
		
		
		System.out.println("Bisherige Pferderassen");
		
		for (Pferderasse pferderasse : pferderassen) {
			System.out.println(pferderasse);
		}
		
		
		
		

	}

}
