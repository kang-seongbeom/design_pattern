package chainofresponsibility;

public interface MailChain {
    void setNextChain(MailChain mailChain);
    void doSomething(Mail mail);
}
