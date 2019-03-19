package pl.sdacademy.designpatterns.proxy;

public class ExtensionConfigurationLoaderProxy implements ConfigLoader {

    private String serverUrl;
    private ExtensionConfigurationLoader loader;

    public ExtensionConfigurationLoaderProxy(final String serverUrl) {
        this.serverUrl = serverUrl;
    }

    @Override
    public String load() {
        if (loader == null) {
            try {
                loader = new ExtensionConfigurationLoader(serverUrl);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Loading config from proxy");
        return loader.load();
    }
}
