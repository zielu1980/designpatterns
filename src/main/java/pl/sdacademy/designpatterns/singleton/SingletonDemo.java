package pl.sdacademy.designpatterns.singleton;

public class SingletonDemo {
  public static void main(String[] args) {
    final Counter counterA = Counter.getInstance();
    final Counter counterB = Counter.getInstance();

    counterA.addOne();
    counterA.addTwo();
    counterB.addThree();
    counterB.addTwo();
    counterA.addThree();
    counterB.addTwo();

    final AppConnections appConnectionsA = AppConnections.getInstance();
    final AppConnections appConnectionsB = AppConnections.getInstance();
    appConnectionsA.connectUser("Andrzej");
    appConnectionsB.connectUser("Janusz");
    appConnectionsA.connectUser("Janusz");
    System.out.println(appConnectionsA.getCurrentConnectionsNum());
    System.out.println(appConnectionsB.getCurrentConnectionsNum());
    System.out.println(appConnectionsA.getConnectedUsers().size());
    System.out.println(appConnectionsB.getConnectedUsers().size());
  }
}
