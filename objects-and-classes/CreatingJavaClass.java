// We can create a class in Java using the class keyword. For example,

//class ClassName {
  // fields
  // methods
//}

// Here, fields (variables) and methods represent the state and behavior of the object respectively.

// - fields are used to store data
// - methods are used to perform some operations

// For our bicycle object, we can create the class as

class Bicycle {

  // state or field
  private int gear = 5;

  // behavior or method
  public void braking() {
    System.out.println("Working of Braking");
  }
}

// In the above example, we have created a class named Bicycle. It contains a field named gear and a method named braking().

// Here, Bicycle is a prototype. Now, we can create any number of bicycles using the prototype. And, all the bicycles will share the fields and methods of the prototype.

// Note: We have used keywords private and public. These are known as access modifiers. To learn more, visit Java access modifiers.