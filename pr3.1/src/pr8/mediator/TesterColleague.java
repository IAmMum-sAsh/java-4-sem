package pr8.mediator;

public class TesterColleague extends Colleague{
    public TesterColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void Notify(String message) {
        System.out.println("Сообщение тестеру: " + message);
    }
}
