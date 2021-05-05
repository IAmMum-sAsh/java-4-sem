package ru.mirea.pr12;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.*;

@Component
public class FileService implements FileWorker{
    private static String inputFile = "input.txt";
    private static String outputFile = "output.txt";
    private File inFile;

    public FileService() {
        inFile = new File(inputFile);
    }

    @PostConstruct
    public void createFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile));

            Thread.sleep(500);
            writer.write("plastmassovii mir pobedit");
            writer.flush();
            System.out.println("end of writing");
            writer.close();
            read();
            Thread.sleep(5000);
        }
        catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void read() {
        try(BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {

            String value = reader.readLine();
            reader.close();
            if (value == null) {
                write(null);
            }
            else {
                String[] info = value.split(" ");
                for (int i = 0; i < info.length; i++) {
                    info[i] = Integer.toString(info[i].hashCode());
                    write(info);
                }
            }

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void write(String[] data) {

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            if (data == null) {
                writer.write("null");
            }
            else {
                for (int i = 0; i < data.length; i++) {
                    writer.write(data[i]);
                    writer.write(" ");
                }
            }
            writer.flush();
            writer.close();
            // delete();

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @PreDestroy
    private void delete() {
        File f = new File("input.txt");
        f.delete();
        System.out.println("file deleted");
    }

}