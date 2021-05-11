class Main {

  // create a method
  public int addNumbers(int a, int b) {
    int sum = a + b;
    // return value
    return sum;
  }

  public static void main(String[] args) {
    
    int num1 = 25;
    int num2 = 15;

    // create an object of Main
    Main obj = new Main();
    // calling method
    int result = obj.addNumbers(num1, num2);
    System.out.println("Sum is: " + result);
  }

}

// In the above example, we have created a method named addNumbers(). The method takes two parameters a and b. Notice the line,

// int result = obj.addNumbers(num1, num2);

// Here, we have called the method by passing two arguments num1 and num2. Since the method is returning some value, we have stored the value in the result variable.

// Note: The method is not static. Hence, we are calling the method using the object of the class.