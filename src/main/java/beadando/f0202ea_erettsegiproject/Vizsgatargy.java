package beadando.f0202ea_erettsegiproject;
import javax.persistence.*;

@Entity
@Table(name = "vizsgatargy")
public class Vizsgatargy {
    @Id
    @Column(name = "azon")
    public int azon;
    @Column(name = "nev")
    public String nev;
    @Column(name = "szomax")
    public int szomax;
    @Column(name = "irmax")
    public int irmax;
    @Column(name = "vizsgazoaz")
    public int vizsgazoaz2;



    public Vizsgatargy(int azon, String nev, int szomax, int irmax, int vizsgazoaz) {
        this.azon = azon;
        this.nev = nev;
        this.szomax = szomax;
        this.irmax = irmax;
        this.vizsgazoaz2 = vizsgazoaz;
    }

    public int getVizsgazoaz2() {
        return vizsgazoaz2;
    }

    public void setVizsgazoaz2(int vizsgazoaz) {
        this.vizsgazoaz2 = vizsgazoaz;
    }

    public Vizsgatargy() {
    }

    public int getAzon() {
        return azon;
    }

    public void setAzon(int azon) {
        this.azon = azon;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getSzomax() {
        return szomax;
    }

    public void setSzomax(int szomax) {
        this.szomax = szomax;
    }

    public int getIrmax() {
        return irmax;
    }

    public void setIrmax(int irmax) {
        this.irmax = irmax;
    }

}
