package $08InputOutput.filesAndDirectories;

import java.io.File;
import java.nio.file.Paths;

/**
 * Created by Dmitrii on 01.03.2018.
 */
public class FileSample {
    public static void main(String[] args) {
        // get current directory
        String currentDirectory = Paths.get(".").toAbsolutePath().normalize().toString();
        System.out.println(currentDirectory); // C:\Workspace\JavaProfessional

        // get directory separator
        System.out.println(System.getProperty("file.separator")); // \
        System.out.println(File.separator); // \

        File fileAbsPath = new File(currentDirectory + "\\src\\main\\resources\\sample.txt");
        System.out.println(fileAbsPath.exists()); //true

        File fileRelPath = new File("src\\main\\resources\\sample.txt");
        System.out.println(fileRelPath.exists()); // true
    }
}
