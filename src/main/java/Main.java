///  The Main.java file is responsible for executing our program
public class Main {
        public static void main(String[] args) {
            ArithematicOp a = new ArithematicOp();
            System.out.println("Sum of Two integer values =  " + a.addNum(4,5));

            // calling the div method
            int div_result = a.divNum(10,2);
            System.out.println("Division of Two integer values = " + div_result);

            // calling the multiplication method
            int mul_result = a.prod(5,6);
            System.out.println("Product of Two integer values =  " + mul_result);

            boolean mul_result1= a.product(5,1);
            // the return type of product method is boolean is make it as bool
            System.out.println("Product of Integers is positive  =  " + mul_result1);

            // calling area_of_Rectangle method
            int area = a.areaRectangle(10,100);
            System.out.println("Rectangle area =  " + area);

            // calling subtraction method
            int difference = a.sub(100,50);
            System.out.println("Difference of two integers = " + difference);
        }

    }

