package UsefulExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Сережка on 30.06.2015.
 */
public class FileCopy {
    public static void main(String[] args) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream("the address of the file and name");
        FileOutputStream fileOutputStream = new FileOutputStream("the address of the file and name");

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
