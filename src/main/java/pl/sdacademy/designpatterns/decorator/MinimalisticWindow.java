package pl.sdacademy.designpatterns.decorator;

import java.util.Arrays;
import java.util.List;

public class MinimalisticWindow extends Window {

    @Override
    public List<Button> getButtons() {
        return Arrays.asList(Button.EXIT, Button.MAXIMIZE, Button.MINIMIZE);
    }

    @Override
    public List<String> getFileNames() {
        return readFilesInCurrentWindowDirectory();
    }

    @Override
    public String getStatus() {
        return getFileNames().size() + " files";
    }

    private List<String> readFilesInCurrentWindowDirectory() {
        System.out.println("Reading files in current directory");
        return Arrays.asList("example1.txt", "example2.txt");
    }
}
