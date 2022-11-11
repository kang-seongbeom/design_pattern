package bridge;

public class SamsungTv implements Tv{
    @Override
    public String tuneChannel(int channel) {
        return "삼성 TV 채널 상승 : " + channel;
    }
}
