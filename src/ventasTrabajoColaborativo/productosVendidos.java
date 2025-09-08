package ventasTrabajoColaborativo;

import java.util.Scanner;

public class productosVendidos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // PRODUCTOS
        System.out.print("¿Cuántos productos desea ingresar? ");
        int numProductos = sc.nextInt();
        sc.nextLine();

        System.out.println("\n== Archivo de productos ==");
        for (int i = 1; i <= numProductos; i++) {
            System.out.print("ID del producto " + i + ": ");
            String id = sc.nextLine();

            System.out.print("Nombre del producto " + i + ": ");
            String nombre = sc.nextLine();

            System.out.print("Precio del producto " + i + ": ");
            double precio = sc.nextDouble();
            sc.nextLine();

            System.out.println(id + ";" + nombre + ";" + precio);
        }

        System.out.println("--------------------------");

        // VENDEDORES
        System.out.print("¿Cuántos vendedores desea ingresar? ");
        int numVendedores = sc.nextInt();
        sc.nextLine();

        System.out.println("\n== Archivo de vendedores ==");
        for (int i = 1; i <= numVendedores; i++) {
            System.out.println("\nVendedor " + i);
            String tipo = tipoDocumento.seleccionarTipoDocumento(sc);

            System.out.print("Número de documento: ");
            String numero = sc.nextLine();

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Apellido: ");
            String apellido = sc.nextLine();

            System.out.println(tipo + ";" + numero + ";" + nombre + ";" + apellido);
        }

        System.out.println("--------------------------");

        // VENTAS
        System.out.print("¿Cuántos productos vendió el vendedor? ");
        int ventas = sc.nextInt();
        sc.nextLine();

        System.out.println("\n== Archivo de ventas ==");
        System.out.println("Ingrese los datos del vendedor:");
        String tipoDoc = tipoDocumento.seleccionarTipoDocumento(sc);

        System.out.print("Número de documento del vendedor: ");
        String numDoc = sc.nextLine();

        System.out.println(tipoDoc + ";" + numDoc);

        for (int i = 1; i <= ventas; i++) {
            System.out.print("ID del producto vendido: ");
            String idProd = sc.nextLine();

            System.out.print("Cantidad vendida: ");
            int cantidad = sc.nextInt();
            sc.nextLine();

            System.out.println(idProd + ";" + cantidad);
        }

        sc.close();
    }
}