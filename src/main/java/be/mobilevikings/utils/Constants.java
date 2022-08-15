package be.mobilevikings.utils;

public class Constants {
    public static final String CONFIGURATION_FILE = System.getProperty("user.dir") + "/src/test/resources/configuration/configuration.properties";

    // used to tell the web driver to wait for a certain amount of time before it throws a 'no such element exception'
    // here driver wait for the element for that time before throwing an exception
    public static final int IMPLICIT_WAIT_TIME = 10;
    //
    public static final int EXPLICIT_WAIT_TIME = 15;
}