import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.io.*;

public class testDNI {

    @ParameterizedTest
    @CsvSource({"11111111,H", "22222222,J","3333333,N","44444444,A","55555555,K","66666666,Q","77777777,B","88888888,Y","99999999,R","12345678,Z"})
    void testDNI(int input, Character expected) {

        assertEquals(expected, calculoDNI.calculoDNI(input));

    }
}

