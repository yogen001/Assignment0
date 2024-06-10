

import java.util.Arrays;


public class Basics {

	// Read System.out.println()
	public void printHelloWorld() {
		System.out.println("Hello World");
	}


	public int getSum(int first, int second) {
		return first + second;
	}


	// Read if-else construct
	public int getLargerNumber(int first, int second) {
		return Math.max(first, second);
	}

	// Read nested if-else construct
	public int largestNumber(int first, int second, int third) {
		int temp = Math.max(first, second);
		return Math.max(temp, third);
	}


	// Go through arrays in java and simple for loop and enhanced for loop
	public void printArray(int[] array) {
		if (array != null){
			for (int i : array){
				System.out.println(i);
			}
		}
	}


	public int getSumOfArrayElements(int[] array, int n) {
		int sum = 0;
		for (int i : array){
			sum += i;
		}
		return sum;
	}


	public boolean isPrime(int number) {
		boolean flag = true;
		if (number == 2){
        } else if (number%2==0 || number <=1) {
			flag = false;
		} else {
			for ( int i = 3;  i<= Math.sqrt(number);i+=2){
				if (number%i==0){
					flag = false;
					break;
				}
			}
		}
		return flag;
	}



	// Say, first = 5 and second = 10, this function should print "5 6 7 8 9 10"
	public int[] getArrayOfRangeOfNumbers(int first, int second) {
		if (first > second){
			int t = first;
			first = second;
			second = t;
		}
		int size = (second-first)+1;
		int[] rangeArray = new int[size];
		for (int i = 0; i < size;i++){
			rangeArray[i] = first;
			first++;
		}
		return rangeArray;
	}


	public int getFactorial(int n) {
		int factorial = 1;
		while ( n > 1){
			factorial*=n--;
		}
		return factorial;
	}


	public int getFactorialWithoutLoop(int n) {
		int factorial = 1;
		if ( n>1){
			factorial*=n*getFactorialWithoutLoop(n-1);
		}
		return factorial;
	}


	// 1234 should give 4321
	public int reverseDigits(int n) {

		int rev = 0;
		while (n != 0){
			rev = (rev *10) + n%10;
			n /=10;
		}
		return rev;
	}


	public int[] primeNumbersInARange(int lowerLimit, int upperLimit) {
		int t;
		if (lowerLimit >upperLimit) {
			t = upperLimit;
			upperLimit = lowerLimit;
			lowerLimit = t;
		}
		StringBuilder num = new StringBuilder(" ");
		for (int i = lowerLimit ; i <= upperLimit ; i++) {
			if (isPrime(i)) {
				num.append(" ").append(i);
			}
		}

		String PrimeNums = num.toString().trim();
		if (PrimeNums.isEmpty()) {
            return new int[]{-1};
		}else {

            return Arrays.stream(PrimeNums.split("\\s+")).mapToInt(Integer::parseInt).toArray();
		}
	}
	/*
	public int[] primeNumbersInARange(int lowerLimit, int upperLimit) {
		int t;
		if (lowerLimit >upperLimit) {
			t = upperLimit;
			upperLimit = lowerLimit;
			lowerLimit = t;
		}
		int[] primeArray = new int[1];
		for (int i = lowerLimit ; i <= upperLimit ; i++) {
			if (isPrime(i) == true) {
				primeArray[] = increaseSize()

			}
		}
		return primeArray;
	}
	public int[] increaseSize(int [] array0 , int num) {
		int[] arr = new int[array0.length+1];
		for (int i = 0; i < arr.length; i++ ) {
			arr[i] = array0[i];
		}
		arr[array0.length]=num;
		return arr;

	}

	*/


	public int findNumberOfOccurrences(int[] array, int n) {
		if (array == null) {
			return 0;
		}
		int count = 0;
		for (int i : array){
			if (i == n){
				count++;
			}
		}
		return count;
	}
	public int rowCount(String[] array) {
        return (int) Math.ceil((-1 + Math.sqrt(1 + 8 * array.length)) / 2);
	}

	public void pattern( int n ) {
        StringBuilder numbersBuilder = new StringBuilder(" ");
        for (int i = 1; i<=n; i++) {
			numbersBuilder.append(i);
		}
        String numbers = numbersBuilder.toString();
        numbers = numbers.trim();
		String[] arr = numbers.split("");
		int k = 0;
		int row = rowCount(arr);
		System.out.println(row);
		boolean flag= true;
		for (int i = 1; k< arr.length; i++) {
			for (int j = 1, a = 1; (j<= i && k<arr.length);  ){
				if ((flag) && ( a <row+1-i)) {
					System.out.print(" ");
					a++;
					if (a==row) {
						flag = false;
						a=1;
					}
				}else {
					System.out.print(arr[k]+" ");
					j++;
					k++;
					if (j > i) {
						flag = true;
					}
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Basics basics = new Basics();

		// Testing printHelloWorld
		basics.printHelloWorld();

		// Testing getSum
		System.out.println("Sum of 5 and 10: " + basics.getSum(5, 10));

		// Testing getLargerNumber
		System.out.println("Larger number between 5 and 10: " + basics.getLargerNumber(5, 10));

		// Testing largestNumber
		System.out.println("Largest number among 5, 10, and 15: " + basics.largestNumber(5, 10, 15));

		// Testing printArray
		int[] array = {1, 2, 3, 4, 5};
		System.out.println("Array elements:");
		basics.printArray(array);

		// Testing getSumOfArrayElements
		System.out.println("Sum of array elements: " + basics.getSumOfArrayElements(array, array.length));

		// Testing isPrime
		System.out.println("Is 7 prime? " + basics.isPrime(7));
		System.out.println("Is 8 prime? " + basics.isPrime(8));

		// Testing getArrayOfRangeOfNumbers
		System.out.println("Array of range from 5 to 10: " + Arrays.toString(basics.getArrayOfRangeOfNumbers(5, 10)));

		// Testing getFactorial
		System.out.println("Factorial of 5: " + basics.getFactorial(5));

		// Testing getFactorialWithoutLoop
		System.out.println("Factorial of 5 without loop: " + basics.getFactorialWithoutLoop(5));

		// Testing reverseDigits
		System.out.println("Reversed digits of 1234: " + basics.reverseDigits(1234));

		// Testing primeNumbersInARange
		System.out.println("Prime numbers between 10 and 20: " + Arrays.toString(basics.primeNumbersInARange(10, 20)));

		// Testing findNumberOfOccurrences
		System.out.println("Occurrences of 3 in array: " + basics.findNumberOfOccurrences(array, 3));

		// Testing pattern
		System.out.println("Pattern for 90:");
		basics.pattern(90);

		// Testing findFirstOccurence
		System.out.println("First occurrence of 3 in array: " + basics.findFirstOccurence(array, 3));

		// Testing printRhombus
		System.out.println("Rhombus of size 5:");
		basics.printRhombus(5);

		// Testing getNumberLessThanTenInWords
		System.out.println("Number 5 in words: " + basics.getNumberLessThanTenInWords(5));
		System.out.println("Number 15 in words: " + basics.getNumberLessThanTenInWords(15));

		// Testing getNumberInWords
		System.out.println("Number 123 in words: " + basics.getNumberInWords(123));
		System.out.println("Number 1005 in words: " + basics.getNumberInWords(1005));

		// Testing printTrianglePointingRight
		System.out.println("Triangle pointing right of size 5:");
		basics.printTrianglePointingRight(5);


	}


	public int findFirstOccurence(int[] array, int number) {
		for (int i = 0; i < array.length;i++){
			if (array[i] == number){
				return i;
			}
		}
		return -1;
	}

	public void printRhombus(int size) {
		for (int i = 1; i <= size; i++) {
			String line = " ".repeat(size - i) + "*".repeat(size);
			System.out.println(line);
		}
	}


	public String getNumberLessThanTenInWords(int number) {
		String[] numberBelowTen = {"zero"," one "," two "," three "," four "," five "," six "," seven "," eight "," nine "," ten "};
		if ( number <=10 && number >= 0){
			return numberBelowTen[number].trim();
		}else {
			return "Invalid number";
		}
	}

	public String getNumberInWords(int number) {
		String noInWords = " ";
		String[] numbersBelow20 = {
				"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
		};
		String[] tens = {
				"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
		};
		if (number == 0) {
			return "zero";
		}else if (number <0) {
			return "invalid number";
		}
		if (number < 20) {
			noInWords += numbersBelow20[number];
		}else if (number < 100) {
			noInWords += tens[number / 10] + " " + numbersBelow20[number % 10];
		} else if (number < 1000) {
			noInWords += getNumberInWords(number/100) + " hundred " + (number%100>0? "and " : "" ) + getNumberInWords(number%100);
		} else if (number < 1000000) {
			noInWords = getNumberInWords(number / 1000) + " thousand" + ((number % 1000 != 0 && number % 1000 < 100) ? " and " : " ") + getNumberInWords(number % 1000);
		} else {
			noInWords = getNumberInWords(number / 1000000) + " million" + ((number % 1000000 != 0) ? " " + getNumberInWords(number % 1000000) : "");
		}
		return noInWords.trim();
	}

	public void printTrianglePointingRight(int n) {
		int halfSize = n/2;
		for (int i = 1; i <= n; i++) {
			int limit = (i <= halfSize)? i: n-i+1;
			System.out.println("*".repeat(limit));
		}
	}
}