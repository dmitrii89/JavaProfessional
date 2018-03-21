package $09NIO_2.streamMethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Dmitrii on 21.03.2018.
 */
public class Walk {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("src\\main\\resources\\");
            Files.walk(path)
                    .filter(p -> p.toString().contains("r"))
                    .forEach(System.out::println);
        } catch (IOException e) {}
        // src\main\resources
        //src\main\resources\animal.data
        //src\main\resources\dir
        //src\main\resources\sample.txt
        //src\main\resources\sample_copy.txt
        //src\main\resources\Zoo.properties
        //src\main\resources\zoo.txt
        //src\main\resources\zoo1.txt
        //src\main\resources\zoo2.txt
        //src\main\resources\zoo3.txt
        //src\main\resources\Zoo_en.properties
        //src\main\resources\Zoo_fr.properties
    }
}
