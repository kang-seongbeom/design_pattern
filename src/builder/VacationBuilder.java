package builder;

public class VacationBuilder extends AbstractBuilder{
    @Override
    protected AbstractBuilder builder() {
        return new VacationBuilder();
    }

    @Override
    protected AbstractBuilder build() {
        return this;
    }

    @Override
    protected AbstractBuilder addHotel(String hotel) {
        this.hotel = hotel;
        return this;
    }

    @Override
    protected AbstractBuilder addAirPlane(String airPlane) {
        this.airPlane = airPlane;
        return this;
    }

    @Override
    protected AbstractBuilder addTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }

    @Override
    protected AbstractBuilder addEvent(String event) {
        this.event = event;
        return this;
    }
}
