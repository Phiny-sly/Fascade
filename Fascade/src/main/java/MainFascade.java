public class MainFascade {

    public static void main(String[] args)
    {
        Amplifier amp=new Amplifier();
        StreamingPlayer player = new StreamingPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();


        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, player,
                                projector, lights, screen, popper);

        homeTheater.watchMovie("Demon Slayer: Mugen Train");
        homeTheater.endMovie();
    }
}
