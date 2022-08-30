package ru.netology.sqr.sqrjavamvn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/sqrservicetest.csv")
    public void testSqrService (int expected, int firstNumber, int secondNumber) {
        SQRService service = new SQRService();
        int actual = service.squareRootCalc(firstNumber, secondNumber);

        Assertions.assertEquals(expected, actual);
    }
}
