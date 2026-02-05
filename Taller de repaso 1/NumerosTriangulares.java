import java.util.Scanner;

public class NumerosTriangulares {
    
    public static boolean esTriangular(int numero, int n, long triangularActual) {

        if (triangularActual == numero) {
            return true;
        }
        

        if (triangularActual > numero) {
            return false;
        }
        return esTriangular(numero, n + 1, triangularActual + n + 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String linea;
        
        System.out.println("Ingrese números para verificar (0 para terminar):");
        
        while (scanner.hasNextLine()) {
            linea = scanner.nextLine().trim();
            
            if (linea.isEmpty()) {
                continue;
            }
            
            try {
                int numero = Integer.parseInt(linea);
                
                if (numero == 0) {
                    break;
                }
                
                if (esTriangular(numero, 1, 1)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida");
            }
        }
        
        scanner.close();
    }
}