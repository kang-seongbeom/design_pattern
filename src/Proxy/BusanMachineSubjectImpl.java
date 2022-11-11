package Proxy;

public class BusanMachineSubjectImpl implements Subject{
    @Override
    public String request() {
        return "부산에 있는 기계 로그 : Ok";
    }
}
