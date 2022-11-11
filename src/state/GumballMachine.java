package state;

public class GumballMachine {
    State soldOut; // 알맹이 매진
    State no; // 동전 없음
    State has; // 동전 있음
    State sold; // 알맹이 뽑기

    State state;
    int count = 0;

    public GumballMachine(int count) {
        soldOut = new SoldOutState(this);
        no = new NoState(this);
        has = new HasState(this);
        sold = new SoldState(this);

        this.count = count;
        if(count > 0){
            state = no;
        }else{
            state = soldOut;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insert(){
        state.insert();
    }

    public void eject(){
        state.eject();
    }

    // 돌리기와 알맹이 뽑기는 동시에 진행됨
    public void turn(){
        state.turn();
        state.dispense();
    }

    public void releaseBall(){
        System.out.println("알맹이를 내보냈습니다.");
        if(count>0) count--;
    }

}
