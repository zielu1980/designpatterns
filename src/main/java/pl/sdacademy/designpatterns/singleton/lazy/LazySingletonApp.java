package pl.sdacademy.designpatterns.singleton.lazy;

public class LazySingletonApp {
    public static void main(String[] args) {

        final AppConnections appConnectionsA = AppConnections.getInstance();
        final AppConnections appConnectionsB = AppConnections.getInstance();

        appConnectionsA.connectUser("Adam");
        appConnectionsB.connectUser("Andrzej");

        appConnectionsA.getConnectedUsers().forEach(System.out::println);
        System.out.println(" ");
        appConnectionsB.getConnectedUsers().forEach(System.out::println);
    }
}
