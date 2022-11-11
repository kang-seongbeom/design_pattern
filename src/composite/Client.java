package composite;

public class Client {
    public static void main(String[] args){
        MenuComponent breakfast = new Menu("아침 메뉴", "08:00~11:00");
        MenuComponent lunch = new Menu("점심 메뉴", "12:00~17:00");
        MenuComponent dinner = new Menu("저녁 메뉴", "18:00~23:00");

        MenuComponent all = new Menu("전체 메뉴", "00:00~23:59");

        all.add(breakfast);
        all.add(lunch);
        all.add(dinner);

        // 메인
        breakfast.add(new MenuItem("시리얼", "요거트", 4_000));
        breakfast.add(new MenuItem("식빵", "딸기쨈", 3_000));

        lunch.add(new MenuItem("팬케이크", "메이플 시럽", 6_000));

        dinner.add(new MenuItem("불고기", "국내산", 15_000));
        dinner.add(new MenuItem("비빔밥", "국내산", 10_000));

        // 디저트
        MenuComponent lunchDessert = new Menu("점심 디저트", "12:00~17:00");
        lunchDessert.add(new MenuItem("커피", "콜롬비아", 1_500));
        lunch.add(lunchDessert);

        MenuComponent dinnerDessert = new Menu("저녁 디저트", "18:00~23:00");
        dinnerDessert.add(new MenuItem("포도", "", 1_000));
        dinnerDessert.add(new MenuItem("딸기", "", 1_000));
        dinner.add(dinnerDessert);

        all.print();
    }
}
