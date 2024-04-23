import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        int opcion;
        Scanner scanner= new Scanner(System.in);
        // variable que pregunta que tipo de cambio quieres, se sutituira

        do {
            System.out.println("=== MENÚ PRINCIPAL ===");
            System.out.println("1. Dolares a Pesos Argentinos");
            System.out.println("2. Pesos Argentionos a Dolares");
            System.out.println("3. Dolares a Real Brasilenio");
            System.out.println("4. Real Brasilenio a Dolares");
            System.out.println("5. Dolares a Pesos Mexicanos");
            System.out.println("6. Pesos Mexicanos a Dolares");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción (1-7): ");
            opcion = scanner.nextInt();

            // Limpiar el buffer del scanner
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    ConversionDLSARS conversion =new ConversionDLSARS();
                    conversion.convierteDLS("USD");
                    break;
                case 2:
                    ConversionARSDLS conversion1 =new ConversionARSDLS();
                    conversion1.convierteARS("ARS");
                    break;
                case 3:
                    ConversionUSDBRL conversion2 =new ConversionUSDBRL();
                    conversion2.convierteUSD("USD");
                    break;
                case 4:
                    ConversionBRLUSD conversion3 =new ConversionBRLUSD();
                    conversion3.convierteBRL("BRL");
                    break;
                case 5:
                    ConversionDLSMXN conversion4 =new ConversionDLSMXN();
                    conversion4.convierteMXN("USD");
                    break;
                case 6:
                    ConversionMXNDLS conversion5 =new ConversionMXNDLS();
                    conversion5.convierteUSDD("MXN");
                    break;
                case 7:
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción del 1 al 7.");
                    break;
            }
        } while (opcion != 7);

        scanner.close();

    }
}
