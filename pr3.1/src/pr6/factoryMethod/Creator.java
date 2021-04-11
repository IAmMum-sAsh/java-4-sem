package pr6.factoryMethod;

import java.text.DecimalFormat;

public class Creator {
    private String name;

    Creator(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ConcreteProduct factoryMethod(String title, String text, int duration){
        return new ConcreteProduct(title, text, duration, name);
    }

    public void anOperation(ConcreteProduct song){
        System.out.println(this.name + " - " + song.getTitle() + "\n----------\n" + song.getText() + "\n(" + (int)(song.getDuration()/60) + ":" + new DecimalFormat( "00" ).format((int)(song.getDuration()%60)) + ")");
    }
}
