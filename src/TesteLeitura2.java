import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

      public static void main(String[] args) throws Exception {

    	  Scanner scanner = new Scanner(new File("contas.csv"));
          while(scanner.hasNextLine()) {
                  String linha = scanner.nextLine();

                  Scanner linhaScanner = new Scanner(linha);
                  linhaScanner.useLocale(Locale.US);
                  linhaScanner.useDelimiter(",");

                  String tipo = linhaScanner.next();
                  int agencia = linhaScanner.nextInt();
                  int conta = linhaScanner.nextInt();
                  String titular = linhaScanner.next();
                  double valor = linhaScanner.nextDouble();
                  
                  System.out.println(String.format(new Locale("pt", "BR"), "%s %04d-%08d %20s %8.2f", tipo, agencia, conta, titular, valor));


                  linhaScanner.close();

//                  String[] valores = linha.split(",");
//                  System.out.println(valores[1]);
          }
          scanner.close();
      }
}
