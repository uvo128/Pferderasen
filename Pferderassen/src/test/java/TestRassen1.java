import org.yogahorseman.pferdeklassen.Pferderasse;

/**
 * Test von besispielhaftem Inhalt fÃ¼r Pferderassen
 * 
 * 
 * @author Ulrich
 *
 */
public class TestRassen1 {

	public static void main(String[] args) {
		
		Pferderasse pferderasse = new Pferderasse();
		pferderasse.setRassenname("Achal Tekkiner");
		pferderasse.setKathegorie("Warmblüter");
		
		System.out.println("Bisherige Pferderassen");
		
		System.out.println(pferderasse);
		
		System.out.println("done");
		

	}

}
