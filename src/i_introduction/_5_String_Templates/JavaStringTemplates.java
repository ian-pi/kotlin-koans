package i_introduction._5_String_Templates;

import static java.lang.String.format;

/**
 * Created by ian on 13/05/17.
 */
public class JavaStringTemplates {

    private static final String month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)";

    public static String javaTask5() {
        return format("\\d{2} %s \\d{4}", month);
    }
}
