package chap14.FileClass;

import static java.lang.System.out;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws Exception {
        File dir = new File("E:/NewJavaBasicProject/New_JavaProject/src/chap14/FileClass/makeDir");
        out.println(dir);

        File file1 = new File("E:/NewJavaBasicProject/New_JavaProject/src/chap14/FileClass/makeDir/file1.txt");
        out.println(file1);

        String fileName = "file2.txt";
        File file2 = new File("E:/NewJavaBasicProject/New_JavaProject/src/chap14/FileClass/makeDir/" + fileName);
        out.println(file2);

        String newFileName = "file3.txt";
        File file3 = new File("E:/NewJavaBasicProject/New_JavaProject/src/chap14/FileClass/makeDir/" + newFileName);
        out.println(file3);

        if (dir.exists() == false) {
            dir.mkdirs();
        }

        if (file1.exists() == false) {
            file1.createNewFile();
        }

        if (file2.exists() == false) {
            file2.createNewFile();
        }

        if (file3.exists() == false) {
            file3.createNewFile();
        }

        out.println();

        File temp = new File("E:/NewJavaBasicProject/New_JavaProject/src/chap14/FileClass/");
        out.println(temp);

        File[] contents = temp.listFiles();
        out.println(contents);

        out.println("시간\t\t\t형태\t\t크기\t이름");
        out.println("----------------------------------------------------------------------");
        out.println();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        out.println(sdf);

        for (File file : contents) {
            out.print(sdf.format(new Date(file.lastModified())));

            if (file.isDirectory()) {
                out.print("\t<DIR>\t\t\t" + file.getName());
            } else {
                out.print("\t\t\t" + file.length() + "\t" + file.getName());
            }

            out.println();
        }
    }
}
