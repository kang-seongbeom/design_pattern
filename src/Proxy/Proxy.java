package Proxy;

public class Proxy implements Subject{
    String location;

    public Proxy(String location) {
        this.location = location;
    }

    @Override
    public String request() {

        // 원격 요청
        if(location.equals("부산 기계")){
            return new BusanMachineSubjectImpl().request();
        }
        else return new JejuMachineSubjectImpl().request();
    }
}
