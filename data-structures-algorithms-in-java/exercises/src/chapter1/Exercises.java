package chapter1;

import java.util.Scanner;

public class Exercises {

    static public void r_1_1() {
        System.out.println( "Q: Write a short Java function, inputAllBaseTypes, that inputs a different value of each base type from the standard input device and prints it back to the standard output device." );
        System.out.println( "A: " );

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        while( !input.hasNextInt() ) {
            input.nextLine();
            System.out.print("Not an integer, try again: ");
        }
        System.out.println( "You entered: " + input.nextInt() );

        System.out.print("Enter a BigDecimal: ");
        while( !input.hasNextBigDecimal() ) {
            input.nextLine();
            System.out.print("Not a BigDecimal, try again: ");
        }
        System.out.println( "You entered: " + input.nextBigDecimal() );

        System.out.println( "Enter a long: " );
        while( !input.hasNextLong() ) {
            input.nextLine();
            System.out.println( "Not a long, try again" );
        }
        System.out.println( "You entered: " + input.nextLong() );

        System.out.println( "Enter a double: " );
        while( !input.hasNextDouble() ) {
            input.nextLine();
            System.out.println( "Not a double, try again" );
        }
        System.out.println( "You entered: " + input.nextDouble() );

        System.out.println( "Enter a boolean: " );
        while( !input.hasNextBoolean() ) {
            input.nextLine();
            System.out.println( "Not a boolean, try again" );
        }
        System.out.println( "You entered: " + input.nextBoolean() );

        System.out.println( "Enter a BigInteger: " );
        while( !input.hasNextBigInteger() ) {
            input.nextLine();
            System.out.println( "Not a BigInteger, try again" );
        }
        System.out.println( "You entered: " + input.nextBigInteger() );

        System.out.println( "Enter a Byte: " );
        while( !input.hasNextByte() ) {
            input.nextLine();
            System.out.println( "Not a Byte, try again" );
        }
        System.out.println( "You entered: " + input.nextByte() );

        System.out.println( "Enter a Float: " );
        while( !input.hasNextFloat() ) {
            input.nextLine();
            System.out.println( "Not a Float, try again" );
        }
        System.out.println( "You entered: " + input.nextFloat() );
    }

    static public boolean r_1_2(long n, long m) {
        System.out.println("Q: R-1.3 Write a short Java method, isMultiple, that takes two long values, n and m, and returns true if and only if n is a multiple of m, that is, n = mi for some integer i.");
        System.out.println("A: ");
        if(m == 1)
            return true;

        for(int i = 2; i < m; i++) {
            if(n%i == 0)
                return true;
        }
        return false;
    }

    public static void main(String[] args)  {
//        r_1_1();
        System.out.println(r_1_2(123123, 12));

    }

}


//        R-1.2 Suppose that we create an array A of GameEntry objects, which has an integer scores field, and we clone A and store the result in an array B.
// If we then im- mediately set A[4].score equal to 550, what is the score value of the GameEntry object referenced by B[4]?
//        R-1.3 Write a short Java method, isMultiple, that takes two long values, n and m, and returns true if and only if n is a multiple of m, that is, n = mi for some integer i.
//        R-1.4 WriteashortJavamethod,isEven,thattakesanintiandreturnstrueifandonly if i is even. Your method cannot use the multiplication, modulus, or division operators, however.
//        R-1.5 Write a short Java method that takes an integer n and returns the sum of all positive integers less than or equal to n.
//        R-1.6 Write a short Java method that takes an integer n and returns the sum of all the odd positive integers less than or equal to n.
//        R-1.7 Write a short Java method that takes an integer n and returns the sum of the squares of all positive integers less than or equal to n.
//        R-1.8 Write a short Java method that counts the number of vowels in a given character string.
//        R-1.9 Write a short Java method that uses a StringBuilder instance to remove all the punctuation from a string s storing a sentence, for example, transforming the string "Let’s try, Mike!" to "Lets try Mike".
//        R-1.10 Write a Java class, Flower, that has three instance variables of type String, int, and float, which respectively represent the name of the flower, its number of petals, and price. Your class must include a constructor method that initializes each variable to an appropriate value, and your class should include methods for setting the value of each type, and getting the value of each type.