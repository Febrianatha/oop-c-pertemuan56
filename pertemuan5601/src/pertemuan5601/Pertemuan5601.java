package pertemuan5601;

/**
 *
 * @author Febrianatha
 * TGL: 26-04-20025
 */
public class Pertemuan5601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        buah apel = new buah ();
        apel.warna = "Hijau";
        apel.SetRasa("manis");
        
        System.out.printf("Warna Apel diset %s\n",apel.warna);
        System.out.printf("Rasa Apel diset %s\n",apel.Getrasa());
        
        
        buah anggur = new buah ();
        anggur.warna = "hitam";
        anggur.SetRasa("Manis");
        
        System.out.printf("Warna Anggur diset %s\n",anggur.warna);
        System.out.printf("Rasa Anggur diset %s\n",anggur.Getrasa());
        
    }
    
}

class buah {
    public String warna;
    private String rasa;
    
    public void SetRasa(String txRasa){
        this.rasa = txRasa;
    }
    public String Getrasa(){
        return this.rasa;
    
    } 
}
