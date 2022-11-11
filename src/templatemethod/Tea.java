package templatemethod;

public class Tea extends CaffeineBeverage{
    @Override
    protected void brew() {
        System.out.println("찻잎을 우려낸다.");
    }

    @Override
    protected void addCondiments() {
        System.out.println("레몬을 추가한다.");
    }
}
