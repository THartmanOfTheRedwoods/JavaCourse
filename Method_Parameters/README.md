# Java Arguments and Method Parameters

## Assumptions
* Knowledge of Java syntax
* Familiarity with Java variables, Data Types, operators, loops, and conditionals.
* Familiarity with Java methods

## Overview
* By the end of the class today, you should have a familiarity with what Java parameters and arguments are, where they are located, and the syntax necessary to utilize them in your own code.

### Paramaters
### What are Parameters?
* Parameters are information passed to a Java method.
* Think of them as variables scoped (existing only in) the method.

### Where do we define Parameters?
* After the method name
* Enclosed within parenthesis
* Preceded by a data type
* Multiple parameters separated by comma

      public class EverythingIsAwesome {
          static void coolMethod(String rayBan) {
              System.out.println(rayBan + " make me look cool.");
          }
      }
* Above our method takes a single **String** parameter **rayBan**, the value of which we'll pass along when we call **coolMethod** from the **EverythingIsAwesome** class.
* Below demonstrates calling our **coolMethod**

      public class EverythingIsAwesome {
          static void coolMethod(String rayBan) {
              System.out.println(rayBan + " make me look cool.");
          }
      
          public static void main(String[] args) {
              coolMethod("Aviators");
              coolMethod("Wayfarers");
              coolMethod("Club Masters");
          }
      }
      /* Expected Output */
      // Aviators make me look cool.
      // Wayfarers make me look cool.
      // Club Masters make me look cool.

## Arguments
### What and Where are Arguments?
* We've already seen them!
* Arguments are the parameters passed to the method
  * *Aviators*, *Wayfarers*, and *Club Masters* are the **Arguments** while *rayBan* is the **Parameter**

## Multiple Arguments and Parameters
* Pass as many as you like
* As previously indicated *comma* separated and with data types.
* When calling method with multiple parameters, **arguments** are passed in the same **order** and with the same **type** as the parameters.

      public class EverythingIsAwesome2 {
          static void coolMethod(String brand, String style, float price) {
              System.out.println(brand + " " + style + " make me look cool for "+ price);
          }

          public static void main(String[] args) {
              coolMethod("Ray-Ban","Aviators", 163.99f);
              coolMethod("Ray-Ban", "Wayfarers", 143.97f);
              coolMethod("Ray-Ban","Club Masters", 174.00f);
          }
      }
      /* Expected Output */
      // Ray-Ban Aviators make me look cool for 163.99
      // Ray-Ban Wayfarers make me look cool for 143.97
      // Ray-Ban Club Masters make me look cool for 174.0

## Let's Practice!
* In the Class method below add a **zipCode** parameter of type **int** to method **myZip**, and output "My Zipcode is 90210"

      public class Practice1 {
          static void myZip(___ _______) {
              System.out.println("My Zipcode is " + _______);
          }

          public static void main(String[] args) {
              myZip(_____);
          }
      }
* In the Class method below add a **firstName** parameter of type **String**, a **zipCode** parameter of type **int** to method **myZip** and output "Trevor's Zipcode is 90210"

      public class Practice2 {
          static void myZip(______ _________, ___ _______) {
              System.out.println(_________ + "'s Zipcode is " + _______);
          }

          public static void main(String[] args) {
              myZip(________, _____);
          }
      }

## Return of the Jedi
* Great, we can pass data via arguments to method parameters and use them as variables in the method, but how do we get anything out?
* Replace **void** with the **data type** you want, and add a return!