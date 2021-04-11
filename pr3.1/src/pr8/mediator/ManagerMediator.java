package pr8.mediator;

public class ManagerMediator extends Mediator{
    private Colleague Customer;
    private Colleague Programmer;
    private Colleague Tester;

    public Colleague getCustomer() {
        return Customer;
    }

    public Colleague getProgrammer() {
        return Programmer;
    }

    public Colleague getTester() {
        return Tester;
    }

    public void setCustomer(Colleague customer) {
        Customer = customer;
    }

    public void setProgrammer(Colleague programmer) {
        Programmer = programmer;
    }

    public void setTester(Colleague tester) {
        Tester = tester;
    }

    @Override
    public void Send(String msg, Colleague colleague) {
        if (Customer == colleague)
            Programmer.Notify(msg);
        else if (Programmer == colleague)
            Tester.Notify(msg);
        else if (Tester == colleague)
            Customer.Notify(msg);
    }
}
