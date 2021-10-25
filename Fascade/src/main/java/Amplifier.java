public class Amplifier {
    private int volume;
    public void on()
    {
        System.out.println("Amplifier on");
    }
    public void off()
    {
        System.out.println("Amplifier off");
    }
    public void setStreamingPlayer()
    {
        System.out.println("Amplifier setting Streaming player to Streaming Player ");
    }
    public void setSurroundSound()
    {
        System.out.println("Amplifier surround sound on (5 speakers, 1 subwoofer)");
    }
    public void setVolume(int volume)
    {
        this.volume=volume;
        System.out.println("Amplifier setting volume to "+this.volume);
    }


}
