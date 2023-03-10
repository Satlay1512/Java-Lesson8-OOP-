package Units;

public class XBowMan extends ShooterClass{
    public XBowMan(String name) {
        super(50, 6, 8, 56, name);
    }

    @Override
    public void step() {
        System.out.println("Арбалетчик высрелил!");
    }

    @Override
    public String getInfo() {
        return "XBowMan";
    }
    
}
