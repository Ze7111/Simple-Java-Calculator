import java.util.Scanner;
import java.util.*;

class calculator {
    public static Integer[] addX(int n, Integer arr[], int x)
    {
        // create a new ArrayList
        List<Integer> arrlist
        = new ArrayList<Integer>(
        Arrays.asList(arr));

        // Add the new element
        arrlist.add(x);

        // Convert the Arraylist to array
        arr = arrlist.toArray(arr);

        // return the array
        return arr;
    }
    public static void main(String[] args) 
    {
        /* ------------ D E P E N D I C I E S --------------------*/
        Scanner in = new Scanner(System.in);
        /* ------------ I N I A L I T I Z I N G --------------------*/

        /* ------------ S T A R T   C O D E --------------------*/
        System.out.println("");
        System.out.println("Please Specify What To Do");
        System.out.println("1) Multiply");
        System.out.println("2) Devide");
        System.out.println("3) Remainder");
        System.out.println("4) Add");
        System.out.println("5) Subtract");
        System.out.println("6) Sum");
        System.out.println("7) Do All Of The Above");
        System.out.print("- ");
        int option = in.nextInt();     

        /* ------------ I F / E L S E   S T A T E M E N T S --------------------*/  
        if (option == 1)
        {
            System.out.print("Enter first Number - ");
            float a = in.nextFloat();

            System.out.print("Enter second Number - ");
            float b = in.nextFloat();

            System.out.println("");
            System.out.println("Heres Your Results:");

            float m = a*b;
            System.out.println("");
            System.out.print(a + " x " + b );
            System.out.print(" = " + m);
            in.close();
        }
        else if (option == 2)
        {
            System.out.print("Enter first Number - ");
            float a = in.nextFloat();

            System.out.print("Enter second Number - ");
            float b = in.nextFloat();

            System.out.println("");
            System.out.println("Heres Your Results:");

            float d = a/b;
            System.out.println("");
            System.out.print(a + " / " + b );
            System.out.print(" = " + d);
            in.close();
        }
        else if (option == 3)
        {
            System.out.print("Enter first Number - ");
            float a = in.nextFloat();

            System.out.print("Enter second Number - ");
            float b = in.nextFloat();

            System.out.println("");
            System.out.println("Heres Your Results:");

            float r = a%b;
            System.out.println("");
            System.out.print(a + " % " + b );
            System.out.print(" = " + r);
            }
            else if (option == 4)
            {
            System.out.print("Enter first Number - ");
            float a = in.nextFloat();

            System.out.print("Enter second Number - ");
            float b = in.nextFloat();

            System.out.println("");
            System.out.println("Heres Your Results:");

            float ad = a+b;
            System.out.println("");
            System.out.print(a + " + " + b );
            System.out.print(" = " + ad);
            in.close();
        }
        else if (option == 5)
        {
            System.out.print("Enter first Number - ");
            float a = in.nextFloat();

            System.out.print("Enter second Number - ");
            float b = in.nextFloat();

            System.out.println("");
            System.out.println("Heres Your Results:");

            float s = a-b;
            System.out.println("");
            System.out.print(a + " - " + b );
            System.out.print(" = " + s);
            in.close();
        }
        else if (option == 7)
        {
            System.out.print("Enter first Number - ");
            float a = in.nextFloat();

            System.out.print("Enter second Number - ");
            float b = in.nextFloat();

            System.out.println("");
            System.out.println("Heres Your Results:");

            float m = a*b;
            System.out.println("");
            System.out.print(a + " x " + b );
            System.out.print(" = " + m);

            float d = a/b;
            System.out.println("");
            System.out.print(a + " / " + b );
            System.out.print(" = " + d);

            float r = a%b;
            System.out.println("");
            System.out.print(a + " % " + b );
            System.out.print(" = " + r);

            float ad = a+b;
            System.out.println("");
            System.out.print(a + " + " + b );
            System.out.print(" = " + ad);

            float s = a-b;
            System.out.println("");
            System.out.print(a + " - " + b );
            System.out.print(" = " + s);
            in.close();
        }
        else if (option == 6)
        {
            Integer arr[] = { 0 };

            System.out.print("How many numbers do you want - ");
            int total = in.nextInt();

            int n = 0;
            int x = 0;

            for(int i = 1;i<=total;i++)
            {  
                n =+ 1;
                System.out.print("Enter " + i + " number - " );
                x = in.nextInt();
                arr = addX(n, arr, x);
            }

            System.out.println("\nArray with " + total + " added values:\n" + Arrays.toString(arr));

            int sum = 0;

            for (int l : arr)
            {
                sum = sum + l;
            }

            System.out.println("\nThe Sum is : " + sum);
            in.close();
        }

    }
}