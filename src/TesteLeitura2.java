import java.io.File;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		
		String linha = "";
		Scanner sc = new Scanner(new File("contas.csv"));
		
		while (sc.hasNextLine()) {
			linha = sc.nextLine();
			System.out.println(linha);
		}
		
		sc.close();
	}

}
