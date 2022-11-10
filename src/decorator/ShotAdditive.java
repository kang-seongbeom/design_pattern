package decorator;

public class ShotAdditive extends Additive{

    public ShotAdditive(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + "\n샷추가";
    }

    @Override
    public double cost() {
        return beverage.cost() + 300;
    }
}
