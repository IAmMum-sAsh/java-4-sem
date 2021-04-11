package pr7;

import pr7.decorator.DataSourceDecorator;
import pr7.decorator.FileDataSource;
import pr7.decorator.Florist;

import pr7.linker.Circle;
import pr7.linker.CompoundShape;
import pr7.linker.Dot;
import pr7.linker.ImageEditor;
import pr7.linker.Rectangle;

import java.awt.*;

public class Test {
    public static void main(String[] args){
        String text = "I Hate This World!";
        DataSourceDecorator t = new Florist(new FileDataSource("pr7.txt"));
        t.writeData(text);
        System.out.println(t.readData());


        ImageEditor editor = new ImageEditor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),
                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
