import java.util.Scanner;

public class ConversionDLSARS {

    public void convierteDLS(String tipoDeCambio){

        ConsultaCambio cambio=new ConsultaCambio( );
        try{

            String contraCambio ="ARS";
            MonedaExchange moneda = cambio.buscaMoneda(tipoDeCambio);
            String resultado = String.valueOf(moneda.conversion_rates());
            String textoModificadoFinal = resultado.replaceAll("}", "");

            String[] returnedArray1 = textoModificadoFinal.split(",");
            for (String str1 : returnedArray1) {

                if (str1.contains(contraCambio)){
                    System.out.println("Dolares a Pesos Argentinos");
                    System.out.println("Conversion_Rate: "+ "1 dolar:" + str1);
                    String conversionRate = str1.substring(str1.indexOf("=") + 1);
                    double numeroDouble = Double.parseDouble(conversionRate);
                    double resultadoComabio = 0;
                    Scanner scanner= new Scanner(System.in);
                    System.out.println("Ingresa los dolares a cambiar:"+"\n");
                    double dolares = scanner.nextDouble();
                    System.out.println(dolares);
                    System.out.println(dolares*numeroDouble/1 +" Pesos Argentinos");
                    System.out.println(dolares + "    DOLARES AMERICANOS *****  "+dolares*numeroDouble/1 +" PESOS ARGENTINOS "+"\n");


                }

            }
        }catch (Exception  e){

            System.out.println("Error en proceso "+ e.getMessage());
        }

    }

}
