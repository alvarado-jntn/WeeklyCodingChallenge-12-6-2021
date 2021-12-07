# WeeklyCodingChallenge-12-6-2021

## JavaScript:
1) In this exercise the goal is to extend the Math() object adding four methods for calculate different types of averages.

-Arithmetic Mean: The division of the sum of the numbers by the quantity of numbers.
avg of [A, B, C] ➞ (A + B + C) / 3
-Quadratic Mean: Also called Root Mean Square, is the square root of the arithmetic mean of the squared numbers.
qAvg of [A, B, C] ➞ ²√ ( (A² + B² + C²) / 3 )
-Harmonic Mean: is the reciprocal of the arithmetic mean of the numbers reciprocals.
hAvg of [A, B, C] ➞ ( (A⁻¹ + B⁻¹ + C⁻¹) / 3 )⁻¹
-Geometric Mean: is the n-th root of the product of the numbers, where n is the quantity of numbers.
gAvg of [A, B, C] ➞ ³√ (A B C)

For each average type build a function that, given a required parameter (the array containing the numbers) and an optional one (the precision, or number of floating digits to return) returns the result as a number.

Examples:
Math.avg([3, 5, 7])➞ 5
//Precision is an optional parameter.
// (3 + 5 + 7) / 3 = 15 / 3 = 5

Math.qAvg([3, 5, 7], 1) ➞ 5.3
// ²√ ( (3² + 5² + 7²) / 3 ) = ²√ (83 / 3) = 5.3

Math.hAvg([3, 5, 7], 1) ➞ 4.4
// Precision is required only for the final result.
// (3⁻¹ + 5⁻¹ + 7⁻¹) / 3 )⁻¹ = (0.676... / 3)⁻¹ = 4.4

Math.gAvg([3, 5, 7], 1) ➞ 4.7
// ³√ (3 5 7) = ³√ 105 = 4.7

Notes:
-Pay attention to cumulative rounding errors! Precision is required only if the parameter is indicated and only for the final result.
-All given arrays are valid ones containing positive numbers greater than zero, either integers or float.



2) Create a function that takes guitar strings as an array of frequencies, starting at the first string (High E) and ending in the sixth string (Low E).

The function must return the display of a tuner for each string, in the same order, as an array.

(You can find the frequencies of the strings on the Wikipedia page)

-The guitar strings are played 1st to 6th, High E to Low E.
-If the guitar string matches, return "OK" for that guitar string.
-If it's too low, return ">•" for 1 or 2 percent off (the arrow means, tune up).
-Return ">>•" if it's way off. For more than 3 percent.
-If it's too high, return "•<" for 1 or 2 percent, and "•<<" for more, (tune down).
-Check the rounded percentages.
-If 0 is given, the guitar string isn't played, return " - ".

Examples:
tune([0, 246.94, 0, 0, 0, 80]) ➞ [" - ", "OK", " - ", " - ", " - ", ">>•"]

tune([329, 246, 195, 146, 111, 82]) ➞ ["OK", "OK", ">•", ">•", "•<", "OK" ]

tune([329.63, 246.94, 196, 146.83, 110, 82.41]) ➞ ["OK", "OK", "OK", "OK", "OK", "OK"]

Notes:
Items in the array will always be numbers.


## Java:
1) Create a function that takes an array of more than three numbers and returns the Least Common Multiple (LCM).

Examples:
lcmOfArray([5, 4, 6, 46, 54, 12, 13, 17]) ➞ 2744820

lcmOfArray([46, 54, 466, 544]) ➞ 78712992

lcmOfArray([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) ➞ 2520

lcmOfArray([13, 6, 17, 18, 19, 20, 37]) ➞ 27965340

Notes:
The LCM of an array of numbers is the smallest positive number that is divisible by each of the numbers in the array.

2) Given an integer value, return a new integer according to the rules below:

-Split the number into groups of two digit numbers. If the number has an odd number of digits, return -1.
-For each group of two digit numbers, concatenate the last digit to a new string the same number of times as the value of the first digit.
-Return the result as an integer.

lookAndSay(3132) ➞ 111222

// By reading the number digit by digit, you get three "1" and three "2".
// Therefore, you put three ones and three two's together.
// Remember to return an integer value (i.e BigIntger class).
Examples:
1) lookAndSay(1213200012171979) ➞ 23002799999999

2) lookAndSay(54544666) ➞ 44444444446666666666

3) lookAndSay(95) ➞ 555555555

4) lookAndSay(1213141516171819) ➞ 23456789

5) lookAndSay(120520) ➞ 200

6) lookAndSay(231) ➞ -1

Notes:
Note that the number 0 can be included (see example #5).
