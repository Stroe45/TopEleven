public class Fotbalist {
    private final String nume;
    private int punctaj;
    private final int pret;

    private Fotbalist(String nume, int punctaj, int pret){
        this.nume=nume;
        this.punctaj=punctaj;
        this.pret = pret;
    }

    public static Fotbalist getInstance(String nume,int punctaj,int pret){
        if(punctaj<0||punctaj>100){
            System.out.println("Punctajul trebuie sa fie intre 0 si 100 inclusiv");
            return null;
        }else{
            return new Fotbalist(nume,punctaj, pret);
        }
    }

    public int getPunctaj() {
        return punctaj;
    }

    public int getPret() {
        return pret;
    }

    public String getNume() {
        return nume;
    }

    public String toString(){
        return "fotbalistul "+this.nume+" cu "+this.punctaj+" puncte, pentru "+this.pret+"$";
    }
}
