import org.yogahorseman.pferdeklassen.Pferderasse;

/**
 * Test von besispielhaftem Inhalt für Pferderassen
 * 
 * 
 * @author Ulrich
 *
 */
public class TestRassen1 {

	public static void main(String[] args) {
		
		Pferderasse pferderasse = new Pferderasse();
		pferderasse.setRassenname("Achal Tekkiner");
		pferderasse.setKathegorie("Warmbl�ter");
		
		System.out.println("Bisherige Pferderassen");
		
		System.out.println(pferderasse);
		
		System.out.println("done");
		

	}

}
