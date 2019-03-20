package pl.sdacademy.designpatterns.decorator;

public class DecoratorDemo {

    public static void main(final String[] args) {
        final MinimalisticWindow minimalisticWindow = new MinimalisticWindow();

        final String mode = args.length == 0 ? "SM" : args[1];

        AeroWindow aeroWindow = null;
        if (mode.equals("A")) {
            aeroWindow = new AeroWindow(new NormalWindow(minimalisticWindow));
        }

        if (aeroWindow == null) {
            minimalisticWindow.getButtons().forEach(System.out::println);
        } else {
            aeroWindow.getButtons().forEach(System.out::println);
        }
    }
}
