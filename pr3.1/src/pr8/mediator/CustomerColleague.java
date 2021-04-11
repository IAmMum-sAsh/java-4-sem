package pr8.mediator;

public class CustomerColleague extends Colleague {

    public CustomerColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void Notify(String message) {
        System.out.println("Сообщение заказчику: " + message);
    }
}
