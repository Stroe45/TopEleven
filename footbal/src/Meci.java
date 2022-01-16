import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Meci {
    private int goluriA=0;
    private int goluriB=0;

    public void intre(EchipaFotbal a,EchipaFotbal b) throws InterruptedException {
        System.out.println("-->Meciul a inceput...");
        int x=(int)(Math.random()*5);
        for (int i=0;i<x;i++){
        TimeUnit.SECONDS.sleep(5);
        decizie(a,b);
        }
        TimeUnit.SECONDS.sleep(3);
        castigator(a,b);

    }

    private void castigator(EchipaFotbal a,EchipaFotbal b){
        if(goluriA>goluriB){
            System.out.println("-->Echipa "+a.getNume()+" a castigat meciul cu scorul "+goluriA+":"+goluriB);
        }
        if(goluriA==goluriB){
            System.out.println("-->Echipa "+a.getNume()+" a facut egal cu echipa "+b.getNume()+" scorul "+goluriA+":"+goluriB);
        }
        if(goluriA<goluriB){
            System.out.println("-->Echipa "+b.getNume()+" a castigat meciul cu scorul "+goluriB+":"+goluriA);
        }
    }

    private void decizie(EchipaFotbal a,EchipaFotbal b){
        if(echipaNorocoasa(a,b).equals(a)){
            goluriA++;
            System.out.println("Fotbalistul "+jucatorNorocos(a).getNume()+" de la echipa "+a.getNume()+"a dat gol!!!");
        }else{
            goluriB++;
            System.out.println("Fotbalistul "+jucatorNorocos(b).getNume()+" de la echipa "+b.getNume()+"a dat gol!!!");
        }
    }

   /* private EchipaFotbal echipaNorocoasa(EchipaFotbal a,EchipaFotbal b){
        int x=(int)(Math.random()*2);
        switch (x){
            case 0:return a;
            case 1:return b;
            default:return null;
        }
    }
    */

   /* private Fotbalist jucatorNorocos(EchipaFotbal c){
        int x=(int)(Math.random()*5);
        switch (x){
            case 0:return c.getJucatori().get(0);
            case 1:return c.getJucatori().get(1);
            case 2:return c.getJucatori().get(2);
            case 3:return c.getJucatori().get(3);
            case 4:return c.getJucatori().get(4);
            default:return null;
        }

    }
    */

    private EchipaFotbal echipaNorocoasa(EchipaFotbal a,EchipaFotbal b){
        float S1=0;
        float S2=0;
        for(int i=0;i<a.getJucatori().size();i++){
            S1+=a.getJucatori().get(i).getPunctaj();
        }
        for(int i=0;i<b.getJucatori().size();i++){
            S2+=b.getJucatori().get(i).getPunctaj();
        }
        float med1=S1/a.getJucatori().size();
        float med2=S2/b.getJucatori().size();
        float sanse1=med1*100/(med1+med2);
        float sanse2=med2*100/(med1+med2);

        int x=(int)(Math.random()*100+1);
        if(x<=sanse1){
            return a;
        }else{
            return b;
        }
    }


    private Fotbalist jucatorNorocos(EchipaFotbal c){
        int S=0;
        Fotbalist fb = null;
        float[] procentajLaGol=new float[c.getJucatori().size()];
        for(int i=0;i<c.getJucatori().size();i++){
            S+=c.getJucatori().get(i).getPunctaj();
        }
        for(int i=0;i<c.getJucatori().size();i++){
            procentajLaGol[i]=c.getJucatori().get(i).getPunctaj()*100/S;
        }
        int x=(int)(Math.random()*100+1);

        float S0=0;
        for(int i=1;i<c.getJucatori().size();i++){
            if(x>=S0&&x<procentajLaGol[i]+S0){
                fb=c.getJucatori().get(i);
                break;
            }
            S0+=procentajLaGol[i];
        }
        return  fb;
    }

}
