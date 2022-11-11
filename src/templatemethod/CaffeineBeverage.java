package templatemethod;

public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    private void pourInCup() {
        System.out.println("컵에 음료를 따른다.");
    }

    private void boilWater() {
        System.out.println("물을 끓인다.");
    }
}
