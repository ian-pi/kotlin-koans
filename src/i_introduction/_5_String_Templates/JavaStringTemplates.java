package i_introduction._5_String_Templates;

/**
 * Created by ian on 13/05/17.
 */
public class JavaStringTemplates {

    private static final String MONTH_REGEX = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)";

    public static String javaTask5() {
        return String.format("\\d{2} %s \\d{4}", MONTH_REGEX);
    }
}
