import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class fff {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        PrintStream printStream = new PrintStream(new FileOutputStream(args[1]));
        System.setOut(printStream);
        byte[] arr = new byte[100];
        String string = "";
        String finalString = "";    //没有注释的字符串变量
        int pointer = 0;
        while ((pointer = fileInputStream.read(arr, 0, 100)) != -1) {
            string += new String(arr, 0, pointer);
        }
        finalString = string.toString();
        CharStream inputStream = CharStreams.fromString(finalString);
        llooLexer lexer = new llooLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        llooParser parser = new llooParser(tokenStream);
        ParseTree tree = parser.compUnit();
        Visitor visitor = new Visitor();
        visitor.visit(tree);
    }
}
