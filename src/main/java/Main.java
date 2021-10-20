public class Main {

    public static void main (String[] args){

        for (int i=0;i<100;i++){
            Hilo h1 = new Hilo(i);
            //h1.start();
            //h1.join();
            h1.run();
        }

    }

}