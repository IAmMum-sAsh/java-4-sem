package pr7.decorator;

public class Florist extends DataSourceDecorator{
    public Florist(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData("❀"+data+"❀");
    }
}
