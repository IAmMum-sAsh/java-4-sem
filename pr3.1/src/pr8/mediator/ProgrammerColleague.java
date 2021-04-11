package pr8.mediator;

public class ProgrammerColleague extends Colleague {

    public ProgrammerColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void Notify(String message) {
        System.out.println("Сообщение программисту: " + message);
    }
}
