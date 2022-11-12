package chainofresponsibility;

public class SpamMailChainImpl implements MailChain{

    private MailChain mailChain;

    @Override
    public void setNextChain(MailChain nextChain) {
        this.mailChain = nextChain;
    }

    @Override
    public void doSomething(Mail mail) {
        if(mail.name.contains("광고")){
            System.out.println("------");
            System.out.println("[스팸메일]");
            System.out.println(mail.name + " : " + mail.contents);

        }
        if(mailChain != null) mailChain.doSomething(mail);
    }
}
