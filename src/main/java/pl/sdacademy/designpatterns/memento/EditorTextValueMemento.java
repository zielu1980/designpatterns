package pl.sdacademy.designpatterns.memento;

public class EditorTextValueMemento {

    private String text;

    public EditorTextValueMemento(final EditorTextValue editorTextValue) {
        this.text = editorTextValue.getText();
    }

    public String getText() {
        return text;
    }
}
