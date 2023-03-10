package Units;

public class Robber extends InfantClass {
    public Robber(String name) {
        super(90, 5, 9, name);
    }
    @Override
    public void step() {
        System.out.println("Удар разбоника!");
    }
    @Override
    public String getInfo() {
        return "Robber";
    }
    
}
