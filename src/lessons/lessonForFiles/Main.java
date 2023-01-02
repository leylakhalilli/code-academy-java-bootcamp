package lessons.lessonForFiles;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        File fileFolder = new File("D:\\Desktop\\JAVA");

//        System.getProperties().forEach((key, value) -> System.out.println(key + " " + value));

        test("Java");
//        findFiles(fileFolder, "Java");


    }


    public static void test(String fileName) {
        File file = new File("D:\\Desktop\\JAVA");

        if (file.isDirectory()) {
            List<File> fileList = Arrays.asList(file.listFiles()).stream()
                    .filter(a -> a.getName().contains(fileName))
                    .collect(Collectors.toList());
            System.out.println(fileList);
        }

    }


    public static void findFiles(File file, String key) {
        if (file.isDirectory()) {
            Arrays.asList(file.listFiles())
                    .stream()
                    .forEach(a -> {
                        if (a.getName().contains(key)) {
                            System.out.println((a.isDirectory() ? "d:" : "f:") + a.getName());
                        }
                        findFiles(file, key);
                    });
        }
    }
}
