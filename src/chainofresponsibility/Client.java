package chainofresponsibility;

public class Client {
    public static void main(String[] args){
        Mail[] mail = new Mail[]{
                new Mail("광고", "디자인 패턴 60초 광고를 요청합니다."),
                new Mail("불편", "이 패턴 너무 불편하네요."),
                new Mail("문의사항", "요청한 패턴이 동작하지 않습니다."),
                new Mail("건의사항", "다른 패턴이 있을까요?"),
        };

        MailChain spam = new SpamMailChainImpl();
        MailChain complaint = new ComplaintMailChainImpl();
        MailChain basic = new BasicMailChainImpl();

        spam.setNextChain(complaint);
        complaint.setNextChain(basic);

        for (Mail m : mail) {
            spam.doSomething(m);
        }
    }
}
