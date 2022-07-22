package proxy.dynamic;

import java.util.Date;

public class MetricsCollector {

    public void record(String apiName, long responseTime) {
        System.out.println(
                "Method calling [" + apiName + "] with response time: " + responseTime + " milliseconds");
    }
}
