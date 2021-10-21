import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Hilo extends Thread {

    int num = 0;
    int dormir = 1000;
    Random rd = new Random();
    boolean sino;
    int cont;

    long start = System.currentTimeMillis();



    public Hilo(int num) {
        this.num = num;
        this.cont = 0;
    }

    public void run() {
        try {
            Thread.sleep(dormir);
            cont=1;
            sino=rd.nextBoolean();
            while(sino==true) {
                Thread.sleep(dormir);
                sino=rd.nextBoolean();
                cont++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long finish = System.currentTimeMillis();

        long TiempoDormido = finish - start;

        System.out.println("Soy el hilo numero " + num + " y he dormido " + cont + " veces y por "+TiempoDormido+" milisegundos");
    }




}
