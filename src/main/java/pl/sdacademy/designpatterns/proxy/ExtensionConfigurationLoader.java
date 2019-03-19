package pl.sdacademy.designpatterns.proxy;

public class ExtensionConfigurationLoader implements ConfigLoader {

    private String configuration;

    public ExtensionConfigurationLoader(final String serverUrl) throws InterruptedException {
        System.out.println("Starting creating configuration");
        Thread.sleep(1000);
        configuration = "ConfigLoadedFrom:" + serverUrl;
        System.out.println("Configuration created. Wahh, it took a while");
    }

    @Override
    public String load() {
        System.out.println("Starting loading configuration");
        return configuration;
    }
}
