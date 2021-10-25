
public class StreamingPlayer {
    private String movie;
    public void on()
    {
        System.out.println("Streaming player on");
    }
    public void off()
    {
        System.out.println("Streaming player off");
    }
    public void play(String movie)
    {
        this.movie=movie;
        System.out.println("Streaming player playing "+this.movie);
    }
    public void pause()
    {
        System.out.println("Movie paused");
    }
    public void stop()
    {
        System.out.println("Streaming player stopped "+this.movie);
    }
}
