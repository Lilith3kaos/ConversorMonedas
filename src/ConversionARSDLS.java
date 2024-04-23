import java.util.Scanner;

public class ConversionARSDLS {
    public void convierteARS(String tipoDeCambio){

        ConsultaCambio cambio=new ConsultaCambio( );
        try{

            String contraCambio ="USD";
            MonedaExchange moneda = cambio.buscaMoneda(tipoDeCambio);
            String resultado = String.valueOf(moneda.conversion_rates());
            String textoModificadoFinal = resultado.replaceAll("}", "");

            String[] returnedArray1 = textoModificadoFinal.split(",");
            for (String str1 : returnedArray1) {

                if (str1.contains(contraCambio)){
                    System.out.println("Dolares a Pesos Argentinos");
                    System.out.println("Conversion_Rate: "+ "1 Peso Argentino:" + str1);
                    String conversionRate = str1.substring(str1.indexOf("=") + 1);
                    double numeroDouble = Double.parseDouble(conversionRate);
                    double resultadoComabio = 0;
                    Scanner scanner= new Scanner(System.in);
                    System.out.println("Ingresa los pesos Argentinos a cambiar:"+"\n");
                    double pesosArgentinos = scanner.nextDouble();
                    System.out.println(pesosArgentinos + "    PESOS ARGENTINOS *****  "+pesosArgentinos*numeroDouble/1 +" DOLARES AMERICANOS "+"\n");


                }

            }
        }catch (Exception  e){

            System.out.println("Error en proceso "+ e.getMessage());
        }

    }

}
