import java.util.Random;

public class Hilo extends Thread {

    int num = 0;
    int dormir = 4000;
    Random rd = new Random();

    public Hilo(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("He salido: "+rd.nextBoolean());
        if (rd.nextBoolean() == true) {
            try {
                Thread.sleep(dormir+1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Soy el hilo numero " + num + " y he dormido por " + dormir + " milisegundos");
        } else {
            try {
                Thread.sleep(dormir);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Soy el hilo numero " + num + " y he dormido por " + dormir + " milisegundos");
        }
    }
}

            //System.out.println("Soy el hilo numero "+num+" y he dormido por "+dormir+" milisegundos");
            //System.out.println("He salido: "+rd.nextBoolean());

