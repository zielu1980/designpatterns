package pl.sdacademy.designpatterns.proxy;

public class ProxyDemo {

    public static void main(final String[] args) {
        final String serverUrl = "http://localhost:8080";
        final ConfigLoader configLoader = new ExtensionConfigurationLoaderProxy(serverUrl);
        configLoader.load();
        configLoader.load();
    }
}
