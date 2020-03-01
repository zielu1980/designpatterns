package pl.sdacademy.designpatterns.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        final ConfigLoader configLoader = new ExternalServerConfigLoader("http://localhos:8080");
        final ConfigLoader proxy = new ConfigLoaderProxy(configLoader);

        proxy.load();
        proxy.load();
        }

    }

