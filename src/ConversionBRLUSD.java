import java.util.Scanner;

public class ConversionBRLUSD {
    public void convierteBRL(String tipoDeCambio){

        ConsultaCambio cambio=new ConsultaCambio( );
        try{

            String contraCambio ="USD";
            MonedaExchange moneda = cambio.buscaMoneda(tipoDeCambio);
            String resultado = String.valueOf(moneda.conversion_rates());
            String textoModificadoFinal = resultado.replaceAll("}", "");

            String[] returnedArray1 = textoModificadoFinal.split(",");
            for (String str1 : returnedArray1) {

                if (str1.contains(contraCambio)){
                    System.out.println("Reales Brasileños a Dolares ");
                    System.out.println("Conversion_Rate: "+ "1 Real Brasileño: " + str1);
                    String conversionRate = str1.substring(str1.indexOf("=") + 1);
                    double numeroDouble = Double.parseDouble(conversionRate);
                    double resultadoComabio = 0;
                    Scanner scanner= new Scanner(System.in);
                    System.out.println("Ingresa los Reales Brasileños:"+"\n");
                    double realesBrasilenos = scanner.nextDouble();
                    System.out.println(realesBrasilenos + "    DOLARES *****  "+realesBrasilenos*numeroDouble/1 +" REAL BRASILENO "+"\n");

                }

            }
        }catch (Exception  e){

            System.out.println("Error en proceso "+ e.getMessage());
        }

    }
}
