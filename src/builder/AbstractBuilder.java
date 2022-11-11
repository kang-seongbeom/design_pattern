package builder;

public abstract class AbstractBuilder {

    protected String hotel, airPlane, ticket, event;

    protected abstract AbstractBuilder builder();
    protected abstract AbstractBuilder build();
    protected abstract AbstractBuilder addHotel(String hotel);
    protected abstract AbstractBuilder addAirPlane(String airPlane);
    protected abstract AbstractBuilder addTicket(String ticket);
    protected abstract AbstractBuilder addEvent(String event);

}
