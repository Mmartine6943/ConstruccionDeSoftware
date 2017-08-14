
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int movimientosX[] = {1, 1, -1, -1, 2, 2, -2, -2};
    public static int movimientosY[] = {2, -2, 2, -2, 1, -1, 1, -1};

    public static void main(String[] Args) {
        ArrayList soluciones = new ArrayList();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            int r1 = s.nextInt();
            int c1 = s.nextInt();
            int r2 = s.nextInt();
            int c2 = s.nextInt();
            soluciones.add(encontrarCantidadDeMinimosMovimientos(r1, c1, r2, c2, 0, 0));
        }
        for (int i = 0; i < n; i++) {
            System.out.println(soluciones.get(i));
        }
    }

    private static int encontrarCantidadDeMinimosMovimientos(int r1, int c1, int r2, int c2, int costo, int profundidad) {
        //System.out.println(r1+"/"+c1);
        if (r1 == r2 && c1 == c2) {
            return costo;
        } else if (profundidad >= 9) {
            return 100;
        } else {
            int costoMinimo = 100;
            int costoActual;
            int nuevo_r1;
            int nuevo_c1;
            for (int i = 0; i < 8; i++) {
                nuevo_r1 = r1 + movimientosX[i];
                nuevo_c1 = c1 + movimientosY[i];
                if ((nuevo_r1 < 0 || nuevo_r1 > 7) || (nuevo_c1 < 0 || nuevo_c1 > 7)) {
                    //System.out.println(nuevo_r1+"~"+nuevo_c1+"~"+"Invalido");
                } else {
                    costoActual = encontrarCantidadDeMinimosMovimientos(nuevo_r1, nuevo_c1, r2, c2, costo + 1, profundidad + 1);
                    if (costoActual < costoMinimo) {
                        costoMinimo = costoActual;
                    }
                }
            }
            return costoMinimo;
        }
    }

}
