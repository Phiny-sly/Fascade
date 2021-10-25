public class Main {

    public static void main(String[] args)
    {
        Amplifier amp=new Amplifier();
        StreamingPlayer player = new StreamingPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        popper.on();
        popper.pop();
        lights.dim(15);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setStreamingPlayer();
        amp.setSurroundSound();
        amp.setVolume(8);
        player.on();
        player.play("Demon Slayer:Mugen Train");


//        popper.off();
//        lights.on();
//        screen.up();
//        projector.off();
//        amp.off();
//        player.stop();
//        player.off();


    }
}
