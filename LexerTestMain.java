import java.util.Vector;
import java.io.OutputStreamWriter;

public class LexerTestMain {

    public static void main(String[] args) throws Exception {
        // open input file
        String testSuite = compiler.InputReader.fileToString("LexerTestInput.txt");
        compiler.InputReader inputReader = new compiler.InputReader(testSuite);

        // parse test content
        java.util.Vector<test.TestCaseContent> testCaseContentArr = parseTestSuite(inputReader);

        // output test content
        OutputStreamWriter outStream = new OutputStreamWriter(System.out, "UTF-8");
        for (test.TestCaseContent testCaseContent : testCaseContentArr) {
            testCaseContent.toStream(outStream);
        }
    }

    public static java.util.Vector<test.TestCaseContent> parseTestSuite(compiler.InputReader inputReader) throws Exception {
        java.util.Vector<test.TestCaseContent> testCaseContentArr = new java.util.Vector<test.TestCaseContent>();
        return testCaseContentArr;
    }

    public static test.TestCaseContent parseTestCase(compiler.InputReader inputReader) throws Exception {
        test.TestCaseContent testCaseContent = new test.TestCaseContent("input", "expectedOutput");
        return testCaseContent;
    }

    public static void parseDollarIn(compiler.InputReader inputReader) throws Exception {
    }

    public static String parseInput(compiler.InputReader inputReader) throws Exception {
        String input = new String("input");
        return input;
    }

    public static void parseDollarOut(compiler.InputReader inputReader) throws Exception {
    }

    public static String parseExpectedOutput(compiler.InputReader inputReader) throws Exception {
        String expectedOutput = new String("expectedOutput");
        return expectedOutput;
    }

}
