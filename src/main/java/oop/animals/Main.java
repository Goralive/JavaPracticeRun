package oop.animals;

public class Main {
    public static void main(String[] args) {
        Animals anim = new Animals(3, 4, true, "milk");
        Cat acat = new Cat(3, 4, true, "milk", "Barsic", "Angor");
       // anim = acat;
        voice(anim);
        voice(acat);
    }

    public static void voice(Animals a) {
        a.getVoice();
    }
}
