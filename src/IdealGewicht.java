import java.util.Scanner;


public class IdealGewicht {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Gewicht (in kg): ");
		double gewicht = Double.valueOf(input.nextLine());
		System.out.print("Größe (in cm): ");
		double größe = Double.valueOf(input.nextLine());
		System.out.print("m/w: ");
		String geschlecht = input.nextLine();
		
		double faktor;
		if (geschlecht.equalsIgnoreCase("m")){
			faktor = 0.95;
		}else if (geschlecht.equalsIgnoreCase("w")){
			faktor = 0.9;
		}else{
			System.out.println("Bist du ein Apache?");
			return;
		}
		
		double idealgewicht = (größe - 100) * faktor;
		if (Math.abs(idealgewicht - gewicht) > idealgewicht * 0.02){
			System.out.format("Du hast nicht das Idealgewicht von ~%1.1f", idealgewicht);
		}else{
			System.out.format("Du hast das Idealgewicht von ~%1.1f", idealgewicht);
		}
	}

}
