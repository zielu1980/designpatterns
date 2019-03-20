package pl.sdacademy.designpatterns.decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NormalWindow extends MinimalisticWindow {

    private MinimalisticWindow minimalisticWindow;

    public NormalWindow(final MinimalisticWindow minimalisticWindow) {
        this.minimalisticWindow = minimalisticWindow;
    }

    @Override
    public List<Button> getButtons() {
        final List<Button> buttons = new ArrayList<>(super.getButtons());
        buttons.add(Button.FULLSCREEN);
        return buttons;
    }

    @Override
    public List<String> getFileNames() {
        final List<String> filenames = new ArrayList<>(minimalisticWindow.getFileNames());
        filenames.add(".");
        filenames.add("..");
        return filenames;
    }

    public String getFileName(final int index) {
        if (index < getFileNames().size()) {
            return getFileNames().get(index);
        }
        return ".";
    }

    public List<String> getFileOptions() {
        return Arrays.asList("remove", "rename", "copy");
    }
}
