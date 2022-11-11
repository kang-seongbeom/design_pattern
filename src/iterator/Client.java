package iterator;

import java.util.Arrays;
import java.util.Iterator;

public class Client {
    public static void main(String[] args){

        System.out.println("[직접 만든 반복자 패턴]");
        LunchMenu lunchMenu = new LunchMenu();
        MenuIterator lunchIterator = lunchMenu.createIterator();
        printAllMenu(lunchIterator);

        System.out.println("------");

        DinnerMenu dinnerMenu = new DinnerMenu();
        MenuIterator dinnerIterator = dinnerMenu.createIterator();
        printAllMenu(dinnerIterator);


        System.out.println("\n[자바에서 제공하는 반복자 패턴]");
        Iterator<MenuItem> lunch = lunchMenu.getMenuItems().iterator();
        javaIterator(lunch);

        System.out.println("------");

        Iterator<MenuItem> dinner = Arrays.stream(dinnerMenu.getMenuItems()).iterator();
        javaIterator(dinner);

    }

    private static void printAllMenu(MenuIterator iterator){
        while (iterator.hasNext()){
            MenuItem item = iterator.next();
            System.out.println(item.getName() + " : " + item.getPrice());
        }
    }

    private static void javaIterator(Iterator<MenuItem> iterator){
        while (iterator.hasNext()){
            MenuItem item = iterator.next();
            System.out.println(item.getName() + " : " + item.getPrice());
        }
    }
}
