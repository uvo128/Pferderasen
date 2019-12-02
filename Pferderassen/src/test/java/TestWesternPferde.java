import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
		
		//inner anonymous class 
		Comparator<String> compareHorseNameLength = new Comparator<String>() {

			public int compare(String o1, String o2) {
					return o1.length() - o2.length();
			}
		};
		
		List<String> pferdeRassenNamen = Arrays.asList(pferderassen.get(0).getRassenname(),pferderassen.get(1).getRassenname());
		
		System.out.println(pferdeRassenNamen);
		
		Collections.sort(pferdeRassenNamen, compareHorseNameLength);
		
		System.out.println(pferdeRassenNamen);
		

	}

}
