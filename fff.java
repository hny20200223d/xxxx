import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
public class fff {
    public static void main(String[] args) throws IOException {
        byte[] arr = new byte[100];
        String string = "";
        int pointer = 0;
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        PrintStream printStream = new PrintStream(new FileOutputStream(args[1]));
        System.setOut(printStream);
        while ((pointer = fileInputStream.read(arr, 0, 100)) != -1) {
            string += new String(arr, 0, pointer);
        }
    }
}
