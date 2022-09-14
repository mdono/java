package intecap;

public class Manuel {

    public static void main(String[] args) {
        Thread Juan = new Thread(new Amigo("Juan"));
        Thread Luis = new Thread(new Amigo("Luis"));
        Thread Nora = new Thread(new Amigo("Nora"));

        Juan.start();
        Luis.start();
        Nora.start();

        try {
            Juan.join();
            Luis.join();
            Nora.join();
        } catch (InterruptedException e) {
            System.err.println("Err: " + e.getMessage());
        }
    }
}
