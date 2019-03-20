package pl.sdacademy.designpatterns.decorator;

import java.util.Random;

public class AeroWindow extends NormalWindow {

    public AeroWindow(final NormalWindow normalWindow) {
        super(normalWindow);
    }

    public OpeningEffect getOpeningEffect() {
        return OpeningEffect.values()[new Random().nextInt(OpeningEffect.values().length)];
    }

    public ClosingEffect getClosingEffect() {
        return ClosingEffect.values()[new Random().nextInt(ClosingEffect.values().length)];
    }
}
