package pr8.mediator;

public abstract class Colleague
{
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void Send(String message) {
        mediator.Send(message, this);
    }
    public abstract void Notify(String message);
}