
package boletin.pkg16;
import com.david.persoal.Persoal;
import com.david.calcNota.CalcNota;

/**
 *
 * @author David
 */
public class Boletin16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalcNota.calcularProbasEscritas();
        CalcNota.calcularProbaPractica();
        CalcNota.calcularBoletins();    
//        CalcNota.amosarTotal();
        
        Persoal persoal1=new Persoal("986545454","david@david.com");
        Academia alumno=new Academia("David",9,persoal1);
        System.out.println(alumno.toString());
    }
    
}
