import java.util.Scanner;

public class ConversionDLSMXN {

    public void convierteMXN(String tipoDeCambio){

        ConsultaCambio cambio=new ConsultaCambio( );
        try{

            String contraCambio ="MXN";
            MonedaExchange moneda = cambio.buscaMoneda(tipoDeCambio);
            String resultado = String.valueOf(moneda.conversion_rates());
            String textoModificadoFinal = resultado.replaceAll("}", "");

            String[] returnedArray1 = textoModificadoFinal.split(",");
            for (String str1 : returnedArray1) {

                if (str1.contains(contraCambio)){
                    System.out.println("Dolares a Pesos Mexicanos");
                    System.out.println("Conversion_Rate: "+ "1 Peso Mexicano:" + str1);
                    String conversionRate = str1.substring(str1.indexOf("=") + 1);
                    double numeroDouble = Double.parseDouble(conversionRate);
                    double resultadoComabio = 0;
                    Scanner scanner= new Scanner(System.in);
                    System.out.println("Ingresa los Dolares:"+"\n");
                    double dolares = scanner.nextDouble();
                    System.out.println(dolares + "    DOLARES AMERICANOS *****  "+dolares*numeroDouble/1 +" PESOS MEXICANOS "+"\n");


                }

            }
        }catch (Exception  e){

            System.out.println("Error en proceso "+ e.getMessage());
        }

    }
}


