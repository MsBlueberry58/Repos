public class Principal {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Contagem());
        Thread thread2 = new Thread(new Contagem());
        thread1.start();
        thread2.start();
    }
}
