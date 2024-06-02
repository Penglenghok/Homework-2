package lesson4;
import static org.junit.jupiter.api.Assertions.*;

public class Prob6 {

    @org.junit.jupiter.api.Test
    public void TestProb1()
    {
        double x = 12;
        int n = 35;
        double expected = Math.pow(x, n);
        double actual = Prob1.power(x, n);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void TestProb2()
    {
        char expected = 'a';
        double actual = Prob2.findMinChar("akel");
        assertEquals(expected, actual);
    }
}
