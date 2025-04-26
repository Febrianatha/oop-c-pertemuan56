package pertemuan5602;

import java.util.Scanner;

/**
 *
 * @author Febrianatha
 * TGL: 26-04-2025
 */
public class Pertemuan5602 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner insi = new Scanner(System.in);
        
                
        System.out.print("Nilai sisi: ");
        int nsisi = insi.nextInt();
        
       
        LuasPersegi LP = new LuasPersegi (nsisi);
        System.out.println("Hitung Luas Persegi");
        System.out.printf("Luas = SISI * SISI\n");
        System.out.printf("  = %d X %d\n", nsisi,nsisi);
        System.out.printf("  = %d\n", LP.HL());
    }
    
}
