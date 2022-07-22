package proxy.dynamic;

public class TestRunner {
    public static void main(String[] args) {
        MetricsCollectorProxy metricsCollectorProxy = new MetricsCollectorProxy();
        IClientActions client = (IClientActions) metricsCollectorProxy.createProxy(new ClientActions());
        client.run();
        client.sleep(2000);
    }
}
