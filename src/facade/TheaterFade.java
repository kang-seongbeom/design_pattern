package facade;

public class TheaterFade {
    Popcorn popcorn;
    Light light;
    Screen screen;
    Amplifier amp;

    public TheaterFade(Popcorn popcorn, Light light, Screen screen, Amplifier amp) {
        this.popcorn = popcorn;
        this.light = light;
        this.screen = screen;
        this.amp = amp;
    }

    public void watchMovie(){
        System.out.println("영화 셋팅 시작");
        popcorn.fried();
        light.lightControl();
        screen.screenControl();
        amp.ampControl();
        System.out.println("영화 셋팅 끝\n영화 시작");
    }
}
