import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
public class fff {
    public static void main(String[] args) throws IOException {
        byte[] hahah = new byte[100];
        String aa11 = "";
        int pointer = 0;
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        PrintStream printStream = new PrintStream(new FileOutputStream(args[1]));
        System.setOut(printStream);
        while ((pointer = fileInputStream.read(hahah, 0, 100)) != -1) {
            aa11 += new String(hahah, 0, pointer);
        }
        System.out.println(aa11);
    }
}
