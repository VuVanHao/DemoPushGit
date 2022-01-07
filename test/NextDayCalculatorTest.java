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

    @org.junit.jupiter.api.Test
    void TestDay30Month4Year2021(){
        int dayTest = 30;
        int monthTest = 4;
        int yearTest = 2021;
        String result = NextDayCalculator.getNextDay(dayTest,monthTest,yearTest);
        String expected = "1/5/2021";
        assertEquals(expected,result);
    }

    @org.junit.jupiter.api.Test
    void TestDay28Month2Year2021(){
        int dayTest = 28;
        int monthTest = 2;
        int yearTest = 2021;
        String result = NextDayCalculator.getNextDay(dayTest,monthTest,yearTest);
        String expected = "1/3/2021";
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void TestDay29Month2Year2020(){
        int dayTest = 29;
        int monthTest = 2;
        int yearTest = 2020;
        String result = NextDayCalculator.getNextDay(dayTest,monthTest,yearTest);
        String expected = "1/3/2020";
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void TestDay31Month12Year2021(){
        int dayTest = 31;
        int monthTest = 12;
        int yearTest = 2021;
        String result = NextDayCalculator.getNextDay(dayTest,monthTest,yearTest);
        String expected = "1/1/2022";
        assertEquals(expected,result);
    }

    @org.junit.jupiter.api.Test
    void TestDay35Month12Year2021(){
        int dayTest = 35;
        int monthTest = 2;
        int yearTest = 2021;
        String result = NextDayCalculator.getNextDay(dayTest,monthTest,yearTest);
        String expected = "Ngày Không Hợp Lệ";
        assertEquals(expected,result);
    }
}