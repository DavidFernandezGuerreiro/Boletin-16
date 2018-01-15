
package boletin.pkg16;
import java.util.Scanner;
import com.david.persoal.Persoal;
import com.david.calcNota.CalcNota;
/**
 *
 * @author David
 */
public class Academia {
    Scanner sc=new Scanner(System.in);
    private static int numReferencia=2018;
    private String nome;
    private int nota;
    Persoal alum;

    public Academia() {
    }

    public Academia(String nome, int nota,  Persoal alum) {
        this.numReferencia = numReferencia;
        this.nome = nome;
        this.nota = nota;
        this.alum = alum;
        numReferencia++;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(int numReferencia) {
        this.numReferencia = numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Persoal getAlum() {
        return alum;
    }

    public void setAlum(Persoal alum) {
        this.alum = alum;
    }

    @Override
    public String toString() {
        return "numReferencia : "+numReferencia+", nome : "+nome+", nota : "+CalcNota.getNotaFinal()+", alum : "+alum;
    }
    
    
    
    
}
