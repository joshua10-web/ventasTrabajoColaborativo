package ventasTrabajoColaborativo;

import java.util.Scanner;

public class tipoDocumento {
    
    public static String seleccionarTipoDocumento(Scanner sc) {
        System.out.println("Seleccione el tipo de documento:");
        System.out.println("1. CC (Cédula de ciudadanía)");
        System.out.println("2. TI (Tarjeta de identidad)");
        System.out.println("3. CE (Cédula de extranjería)");
        System.out.println("4. PA (Pasaporte)");

        int opcionDoc = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        String tipo = "";

        switch(opcionDoc) {
            case 1: tipo = "CC"; break;
            case 2: tipo = "TI"; break;
            case 3: tipo = "CE"; break;
            case 4: tipo = "PA"; break;
            default:
                System.out.println("Opción inválida. Se asignará 'CC' por defecto.");
                tipo = "CC";
        }

        return tipo;
    }
}