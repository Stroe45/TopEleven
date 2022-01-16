import java.util.ArrayList;

public class EchipaFotbal {
    private final String nume;
    private int buget;
    private ArrayList<Fotbalist> jucatori=new ArrayList<Fotbalist>();

    public EchipaFotbal(String nume,int buget){
        this.nume=nume;
        this.buget=buget;
    }

    public void cumparaJucator(Fotbalist f){
        if (jucatori.size()<11){
            jucatori.add(f);
            buget-=f.getPret();
            System.out.println("Echipa "+this.nume+" a cumparat "+f);
        }else{
            System.out.println("Echipa "+this.nume+"nu poate cumpara fotbalisti deoarece are prea multi jucatori!");
            return;
        }

    }

    public void vindeJucator(Fotbalist f){
        if(jucatori.size()>0){
            jucatori.remove(f);
            buget-=f.getPret();
            System.out.println("Echipa "+this.nume+" a vandut "+f);
        }
        else{
            System.out.println("Echipa "+this.nume+" nu poate vinde fotbalisti deoarece nu mai are!");
        }
    }

    public String getNume() {
        return nume;
    }

    public ArrayList<Fotbalist> getJucatori() {
        return jucatori;
    }
}
