public class Contagem implements Runnable{

    @Override
    public void run() {
        int i = 0;
        long idThread = Thread.currentThread().getId();
        while (i!=1000){
            i++;
            System.out.println("Thread - " + idThread + " Número - " + i);

        }

    }
}
