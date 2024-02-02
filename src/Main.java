import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Crear CD");
            System.out.println("2. Crear Disco Duro");
            System.out.println("3. Crear LP");
            System.out.println("4. Crear BlueRay");
            System.out.println("5. Escribir datos en el disco");
            System.out.println("6. Leer datos del disco");
            System.out.println("7. Girar el disco");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearCd(scanner);
                    break;
                case 2:
                    crearDiscoDuro(scanner);
                    break;
                case 3:
                    crearLp(scanner);
                    break;
                case 4:
                    crearBlueRay(scanner);
                    break;
                case 5:
                    escribirDatos(scanner);
                    break;
                case 6:
                    leerDatos(scanner);
                    break;
                case 7:
                    girarDisco(scanner);
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private static void crearCd(Scanner scanner) {
        System.out.println("Creando CD:");
        System.out.print("Nombre del CD: ");
        String nombreCd = scanner.nextLine();
        System.out.print("Capacidad del CD: ");
        int capacidadCd = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Marca del CD: ");
        String marcaCd = scanner.nextLine();

        Cd cd = new Cd(nombreCd, capacidadCd, marcaCd);
        System.out.println("CD creado: " + cd.toString());
    }
    private static void crearDiscoDuro(Scanner scanner) {
        System.out.println("Creando Disco Duro:");
        System.out.print("Nombre del Disco Duro: ");
        String nombreDiscoDuro = scanner.nextLine();
        System.out.print("Capacidad del Disco Duro: ");
        int capacidadDiscoDuro = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Marca del Disco Duro: ");
        String marcaDiscoDuro = scanner.nextLine();

        DiscoDuro discoDuro = new DiscoDuro(nombreDiscoDuro, capacidadDiscoDuro, marcaDiscoDuro);
        System.out.println("Disco Duro creado: " + discoDuro.toString());
    }
    private static void crearLp(Scanner scanner) {
        System.out.println("Creando LP:");
        System.out.print("Nombre del LP: ");
        String nombreLp = scanner.nextLine();
        System.out.print("Capacidad del LP: ");
        int capacidadLp = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Marca del LP: ");
        String marcaLp = scanner.nextLine();

        Lp lp = new Lp(nombreLp, capacidadLp, marcaLp);
        System.out.println("LP creado: " + lp.toString());
    }
    private static void crearBlueRay(Scanner scanner) {
        System.out.println("Creando BlueRay:");
        System.out.print("Nombre del BlueRay: ");
        String nombreBlueRay = scanner.nextLine();
        System.out.print("Capacidad del BlueRay: ");
        int capacidadBlueRay = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Marca del BlueRay: ");
        String marcaBlueRay = scanner.nextLine();

        BlueRay blueRay = new BlueRay(nombreBlueRay, capacidadBlueRay, marcaBlueRay);
        System.out.println("BlueRay creado: " + blueRay.toString());
    }
    private static void escribirDatos(Scanner scanner) {
        System.out.println("Escribir datos en el disco:");
    }
    private static void leerDatos(Scanner scanner) {
        System.out.println("Leer datos del disco:");
    }
    private static void girarDisco(Scanner scanner) {
        System.out.println("Girar el disco:");
    }
}