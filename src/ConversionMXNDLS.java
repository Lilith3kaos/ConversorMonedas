import java.util.Scanner;

public class ConversionMXNDLS {

    public void convierteUSDD(String tipoDeCambio){

        ConsultaCambio cambio=new ConsultaCambio( );
        try{

            String contraCambio ="USD";
            MonedaExchange moneda = cambio.buscaMoneda(tipoDeCambio);
            String resultado = String.valueOf(moneda.conversion_rates());
            String textoModificadoFinal = resultado.replaceAll("}", "");

            String[] returnedArray1 = textoModificadoFinal.split(",");
            for (String str1 : returnedArray1) {

                if (str1.contains(contraCambio)){
                    System.out.println("Pesos Mexicanos A Dolares");
                    System.out.println("Conversion_Rate: "+ "1 Dolar:" + str1);
                    String conversionRate = str1.substring(str1.indexOf("=") + 1);
                    double numeroDouble = Double.parseDouble(conversionRate);
                    double resultadoComabio = 0;
                    Scanner scanner= new Scanner(System.in);
                    System.out.println("Ingresa los Pesos Mexicanos:"+"\n");
                    double pesosMexicanos = scanner.nextDouble();
                    System.out.println(pesosMexicanos + "    PESOS MEXICANOS *****  "+pesosMexicanos*numeroDouble/1 +" DOLARES AMERICANOS "+"\n");

                }

            }
        }catch (Exception  e){

            System.out.println("Error en proceso "+ e.getMessage());
        }

    }
}
