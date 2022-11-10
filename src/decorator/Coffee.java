package decorator;

public class Coffee extends Beverage{

   Coffee(){
       this.description = "커피";
   }

    @Override
    public double cost() {
        return 2_000;
    }
}
