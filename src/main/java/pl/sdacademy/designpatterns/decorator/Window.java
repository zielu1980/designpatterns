package pl.sdacademy.designpatterns.decorator;

import java.util.List;

public abstract class Window {

    public abstract List<Button> getButtons();
    public abstract List<String> getFileNames();
    public abstract String getStatus();
}
