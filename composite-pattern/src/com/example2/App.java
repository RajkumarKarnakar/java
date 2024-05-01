package com.example2;

public class App {

    public static void main(String[] args) {

        var sa = new Note("Sa");
        var re = new Note("Re");
        var ga = new Note("Ga");
        var ma = new Note("Ma");
        var pa = new Note("Pa");
        var dha = new Note("Dha");
        var ni = new Note("Ni");

        var sargama = new Song();

        sargama.addNote(sa);
        sargama.addNote(re);
        sargama.addNote(ga);
        sargama.addNote(ma);
        sargama.addNote(pa);
        sargama.addNote(dha);
        sargama.addNote(ni);

        sargama.getNotes().getFirst().play();
        sargama.getNotes().getLast().play();

        sargama.play();
    }
}
