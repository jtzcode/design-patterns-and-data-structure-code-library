package proxy.dynamic;

public class ClientActions implements IClientActions {
    private void calculate() {
        int i;
        long res = 0;
        for (i = 0; i < 100000; i++) {
            res += i;
        }
    }
    public void sleep (long ms) {
        System.out.println("Start sleeping...");
        //calculate();
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
    public void run() {
        System.out.println("Start running...");
        calculate();
    }
}
