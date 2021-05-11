class Main {

// create a method
  public static int square(int num) {

    // return statement
    return num * num;
  }

  public static void main(String[] args) {
    int result;

    // call the method
    // store returned value to result
    result = square(10);

    System.out.println("Squared value of 10 is: " + result);
  }
}

// In the above program, we have created a method named square(). The method takes a number as its parameter and returns the square of the number.

// Here, we have mentioned the return type of the method as int. Hence, the method should always return an integer value.