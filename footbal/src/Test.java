import java.util.Arrays;

public class Test {
    public static  void main(String[] args) throws InterruptedException {
        Fotbalist f1a=Fotbalist.getInstance("Mutu",23,500);
        Fotbalist f2a=Fotbalist.getInstance("Messi",90,1500);
        Fotbalist f3a=Fotbalist.getInstance("Ronaldo",85,1200);
        Fotbalist f4a=Fotbalist.getInstance("Martinel",32,700);
        Fotbalist f5a=Fotbalist.getInstance("Jambasu",45,832);
        Fotbalist f1b=Fotbalist.getInstance("Muresanu",35,344);
        Fotbalist f2b=Fotbalist.getInstance("Chipciu",60,912);
        Fotbalist f3b=Fotbalist.getInstance("Viorel",61,1002);
        Fotbalist f4b=Fotbalist.getInstance("Neymar",82,1054);
        Fotbalist f5b=Fotbalist.getInstance("Mirel",21,430);

        EchipaFotbal Steaua=new EchipaFotbal("Steaua Bucuresti",10000);
        EchipaFotbal Dinamo=new EchipaFotbal("Dinamo Bucuresti",9000);

        for (Fotbalist fotbalist : Arrays.asList(f1a, f2a, f3a, f4a, f5a)) {
            Steaua.cumparaJucator(fotbalist);
        }
        for (Fotbalist fotbalist : Arrays.asList(f1b, f2b, f3b, f4b, f5b)) {
            Dinamo.cumparaJucator(fotbalist);
        }

        Meci meci1=new Meci();
        Meci meci2=new Meci();
        Meci meci3=new Meci();
        meci1.intre(Steaua, Dinamo);
        meci2.intre(Steaua,Dinamo);
        meci3.intre(Steaua,Dinamo);

    }
}
