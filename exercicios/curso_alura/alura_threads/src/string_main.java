

public class string_main {

    public static void main(String[] args) {

        Runnable tarefa1 = new ImprimeString();
        Thread thread1 = new Thread(tarefa1);
        thread1.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("resposta");
            }
        }).start();


    }


}
