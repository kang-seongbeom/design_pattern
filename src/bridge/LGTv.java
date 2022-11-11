package bridge;

public class LGTv implements Tv{
    @Override
    public String tuneChannel(int channel) {
        return "LG TV 채널 상승 : " + channel;
    }
}
