package mypackage;

/**
 * ConsoleWriter
 */
public class ConsoleWriter extends Writer {
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RESET = "\u001B[0m";

    @Override
    public void write(String s) {
        System.out.println(ANSI_GREEN + "INFO: " + ANSI_RESET + s);
    }

}