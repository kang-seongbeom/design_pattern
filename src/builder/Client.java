package builder;

public class Client {
    public static void main(String[] args){

        AbstractBuilder vacation = new VacationBuilder()
                .builder()
                .addHotel("j hotel")
                .addAirPlane("e air")
                .addTicket("j ticket")
                .addEvent("u event")
                .build();

        System.out.println(vacation.hotel);
        System.out.println(vacation.airPlane);
        System.out.println(vacation.ticket);
        System.out.println(vacation.event);
    }
}
