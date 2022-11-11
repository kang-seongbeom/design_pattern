package Proxy;

public class Client {
    public static void main(String[] args){
        String[] locations = new String[]{"부산 기계", "제주도 기계"};

        System.out.println("[서울 본사에서 지방에 있는 기계 로그 요청]");
        for (String lo : locations) {
            Subject subject = new Proxy(lo);
            System.out.println(subject.request());
        }
    }
}
