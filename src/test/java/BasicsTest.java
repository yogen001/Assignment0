import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicsTest {

    @Test
    public void largerNumberTest() {
        Basics assignm0 = new Basics();
        assertEquals(2, assignm0.getLargerNumber(1, 2));
        assertEquals(22,assignm0.getLargerNumber(22,22));
        assertEquals(-1, assignm0.getLargerNumber(-1, -3));
        assertEquals(3, assignm0.getLargerNumber(0, 3));
        assertEquals(11012, assignm0.getLargerNumber(11012, 2233));
        assertEquals(12312, assignm0.getLargerNumber(12312, 443));
        assertEquals(2147483647, assignm0.getLargerNumber(2147483647, 214483648));
        assertEquals(Integer.MAX_VALUE, assignm0.getLargerNumber(Integer.MAX_VALUE, Integer.MIN_VALUE));
        assertEquals(2147483647, assignm0.getLargerNumber(2147483647, 214483648));
    }

    @Test
    public void largestNumberTest() {
        Basics assignm0 = new Basics();
        assertEquals(123123, assignm0.largestNumber(12123, 212, 123123));
        assertEquals(47747673, assignm0.largestNumber(244535, 47747673, 22355));
        assertEquals(312412312, assignm0.largestNumber(122090982, 1088302, 312412312));
        assertEquals(1, assignm0.largestNumber(-1212, -9989803, 1));
        assertEquals(-2, assignm0.largestNumber(-8928912, -1231231, -2));
        assertEquals(990209933, assignm0.largestNumber(990209933, -123123, 0));
        assertEquals(Integer.MAX_VALUE, assignm0.largestNumber(Integer.MAX_VALUE, Integer.MIN_VALUE, 0));
        assertEquals(0, assignm0.largestNumber(0,0,0));
    }



    @Test
    public void sumOfArrayElementsTest() {

        Basics assignm0 = new Basics();
        assertEquals(296063, assignm0.getSumOfArrayElements(new int[] { 123, 1231, 218872, 67873, 7964 },5));
        assertEquals(0, assignm0.getSumOfArrayElements(new int[] { 0, 0, 0 }, 3));
        assertEquals(852, assignm0.getSumOfArrayElements(new int[] { -1,647, 451, -245 }, 3));
        assertEquals(-548454, assignm0.getSumOfArrayElements(new int[] { -111111,-223647,-213451, -245 }, 3));
    }

    @Test
    public void primeTest() {
        Basics assignm0 = new Basics();
        assertTrue(assignm0.isPrime(5));
        assertFalse(assignm0.isPrime(10));
        assertFalse(assignm0.isPrime(0));
        assertFalse(assignm0.isPrime(Integer.MIN_VALUE));
        assertFalse(assignm0.isPrime(-1));
        assertTrue(assignm0.isPrime(Integer.MAX_VALUE));


    }

    @Test
    public void numbersInARangeTest() {
        Basics assignm0 = new Basics();
        assertArrayEquals(new int[] { 3, 4, 5, 6, 7, 8, 9 }, assignm0.getArrayOfRangeOfNumbers(3, 9));
        assertArrayEquals(new int[] { -3, -2, -1 }, assignm0.getArrayOfRangeOfNumbers(-3, -1));
        assertArrayEquals(new int[] {-13, -12, -11, -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1,  },assignm0.getArrayOfRangeOfNumbers(-13, 1));
        assertArrayEquals(new int[] { 1,  2 ,3 }, assignm0.getArrayOfRangeOfNumbers(3, 1));
        assertArrayEquals(new int[] { 3 }, assignm0.getArrayOfRangeOfNumbers(3, 3));

    }

    @Test
    public void primeNumbersInARangeTest() {
        Basics assignm0 = new Basics();
        assertArrayEquals(new int[] { 2, 3, 5, 7 }, assignm0.primeNumbersInARange( 0,9));
        assertArrayEquals(new int[] {-1}, assignm0.primeNumbersInARange(-10, 1));
        assertArrayEquals(new int[] { 3, 5, 7 }, assignm0.primeNumbersInARange( 3,9));
        assertArrayEquals(new int[] { 3, 5, 7 }, assignm0.primeNumbersInARange( 3,9));
        assignm0.primeNumbersInARange( 0,2000000);

    }

    @Test
    public void sumTest() {
        Basics assignm0 = new Basics();
        assertEquals(1422, assignm0.getSum(123, 1299));

        assertEquals(-4, assignm0.getSum(-13, 9));

        assertEquals(-32, assignm0.getSum(-13, -19));
    }

    @Test
    public void reverseDigitsTest() {
        Basics assignm0 = new Basics();
        assertEquals(12, assignm0.reverseDigits(21));
        assertEquals(0, assignm0.reverseDigits(0));
        assertEquals(4321, assignm0.reverseDigits(1234));
    }


    @Test
    public void factorialTest() {
        Basics ass0 = new Basics();
        assertEquals(1, ass0.getFactorial(-3));

        assertEquals(0, ass0.getFactorial(120));
        assertEquals(479001600 ,ass0.getFactorial(12));
        assertEquals(0 ,ass0.getFactorial(100));
        assertEquals(1, ass0.getFactorial(1));
    }
    @Test
    public void getFactorialWithoutLoop() {
        Basics ass0 = new Basics();
        assertEquals(6, ass0.getFactorialWithoutLoop(3));
        assertEquals(0, ass0.getFactorial(120));
        assertEquals(479001600 ,ass0.getFactorial(12));
        assertEquals(0 ,ass0.getFactorial(100));
        assertEquals(1, ass0.getFactorialWithoutLoop(0));
        assertEquals(1, ass0.getFactorialWithoutLoop(1));

    }
    @Test
    public void testFindNumberOfOccurences(){
        Basics ass0 = new Basics();
        assertEquals(0, ass0.findNumberOfOccurrences(new int[]{1, 1, 1}, 3));
        assertEquals(9, ass0.findNumberOfOccurrences(new int[]{1, 2,12,12,1,1,1,1,1,1,1,213,213,123,12,312,3, 1}, 1));
        assertEquals(0, ass0.findNumberOfOccurrences(new int[]{}, 1));
        assertEquals(15, ass0.findNumberOfOccurrences(new int[]{4,4,4,4,4,4,4,4,4,4,4,4,4,4,4}, 4));
        assertEquals(5, ass0.findNumberOfOccurrences(new int[]{12,3,-121,3, -21,3,-3,3,-4,3,-12}, 3));

    }

    @Test
    public void testFindFirstOccurence(){
        Basics ass0 = new Basics();
        assertEquals(-1, ass0.findFirstOccurence(new int[]{2, 2, 2}, 1));
        assertEquals(2, ass0.findFirstOccurence(new int[]{11,12, 1, 1}, 1));
        assertEquals(-1, ass0.findFirstOccurence(new int[]{}, 1));
        assertEquals(-1, ass0.findFirstOccurence(new int[]{2,123,12,3,12,3,12,312,312}, 321));
        assertEquals(2, ass0.findFirstOccurence(new int[]{2, 2, 1}, 1));
        assertEquals(4, ass0.findFirstOccurence(new int[]{2, 2,2,21, 1}, 1));
        assertEquals(0, ass0.findFirstOccurence(new int[] {Integer.MAX_VALUE,Integer.MAX_VALUE}, Integer.MAX_VALUE));

    }

    @Test
    public void testGetNumberLessThanTenInWords(){
        Basics ass0 = new Basics();
        assertEquals("zero", ass0.getNumberLessThanTenInWords(0).toLowerCase());
        assertEquals("five", ass0.getNumberLessThanTenInWords(5).toLowerCase());
        assertEquals("invalid number", ass0.getNumberLessThanTenInWords(14).toLowerCase());
        assertEquals("invalid number", ass0.getNumberLessThanTenInWords( Integer.MAX_VALUE).toLowerCase());
        assertEquals("invalid number", ass0.getNumberLessThanTenInWords(-10).toLowerCase());
        assertEquals("ten", ass0.getNumberLessThanTenInWords(10).toLowerCase());
        assertEquals("nine", ass0.getNumberLessThanTenInWords(9).toLowerCase());
    }
    @Test
    public void testGetNumberInWords(){
        Basics ass0 = new Basics();
        assertEquals("zero", ass0.getNumberInWords(0).toLowerCase());
        assertEquals("thirty four", ass0.getNumberInWords(34).toLowerCase());
        assertEquals("two hundred and thirty four", ass0.getNumberInWords(234).toLowerCase());
        assertEquals("one thousand two hundred and thirty four", ass0.getNumberInWords(1234).toLowerCase());
        assertEquals("forty five thousand six hundred and fifty two", ass0.getNumberInWords(45652).toLowerCase());
        assertEquals("invalid number", ass0.getNumberInWords(-10).toLowerCase());
        assertEquals("two hundred and nine", ass0.getNumberInWords(209).toLowerCase());
        assertEquals("one thousand and five", ass0.getNumberInWords(1005).toLowerCase());
        assertEquals("thirty five thousand seven hundred and four", ass0.getNumberInWords(35704).toLowerCase());

        assertEquals("five hundred and fifty thousand four hundred and ninety two", ass0.getNumberInWords(550492).toLowerCase());

    }
}