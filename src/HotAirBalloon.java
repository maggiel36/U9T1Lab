public class HotAirBalloon extends Vehicle
{
    private String color;

    public HotAirBalloon(String name, int wheels, String color)
    {
        super(name, wheels);
        this.color = color;
    }

    public String getColor()
    {
        return color;
    }

    public void woosh()
    {
        System.out.println("Whoosh!");
    }
}
