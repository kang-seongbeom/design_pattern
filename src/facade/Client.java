package facade;

public class Client {
    public static void main(String[] args){

        TheaterFade theaterFade = new TheaterFade(
                new Popcorn(),
                new Light(),
                new Screen(),
                new Amplifier()
        );

        theaterFade.watchMovie();
    }
}
