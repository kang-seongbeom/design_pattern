package decorator;

public class MochaAdditive extends Additive{

    public MochaAdditive(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "\n모카 추가";
    }

    @Override
    public double cost() {
        return beverage.cost() + 200;
    }
}
