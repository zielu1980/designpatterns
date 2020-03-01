package pl.sdacademy.designpatterns.memento;

public class EditorTextMemento {

    // te same pola co klasa, które zapis reprezentujemy
    private String value;

    public String getValue() {
        return value;
    }

    public EditorTextMemento(final EditorText editorText){

        //deep copy!!!! nie shalow copy, tzn. nie = sie dla obiektów!!!!!
        value = editorText.getValue();

    }
}
