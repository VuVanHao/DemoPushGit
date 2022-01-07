import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test
    void TestDay1Month1Year2021() {
        int dayTest = 1;
        int monthTest = 1;
        int yearTest = 2021;
        String result = NextDayCalculator.getNextDay(dayTest,monthTest,yearTest);
        String expected = "2/1/2021";
        assertEquals(expected,result);
    }

    @org.junit.jupiter.api.Test
    void TestDay31Month1Year2021(){
        int dayTest = 31;
        int monthTest = 1;
        int yearTest = 2021;
        String result = NextDayCalculator.getNextDay(dayTest,monthTest,yearTest);
        String expected = "1/2/2021";
        assertEquals(expected,result);
    }
}