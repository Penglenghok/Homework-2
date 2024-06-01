package Problem5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        boolean validInputShape = false;
        while(!exit)
        {
            System.out.println("Enter C for Circle \nEnter R for Rectangle \nEnter T for Triangle");
            String shape = scanner.next();

            if(shape.equals("T") || shape.equals("R") || shape.equals("C"))
            {
                validInputShape = true;
            }

            if(validInputShape)
            {
                if(shape.equals("T"))
                {
                    System.out.println("Enter the base of the Triangle");
                    double base = scanner.nextDouble();

                    System.out.println("Enter the height of the Triangle");
                    double height = scanner.nextDouble();

                    Triangle t = new Triangle(base, height);
                    double area = t.computeArea();
                    System.out.println("The area of Triangle is:" + area);
                }
                else if(shape.equals("R"))
                {
                    System.out.println("Enter the width of the Rectangle");
                    double width = scanner.nextDouble();

                    System.out.println("Enter the height of the Rectangle");
                    double height = scanner.nextDouble();

                    Rectangle r = new Rectangle(width, height);
                    double area = r.computeArea();
                    System.out.println("The area of Rectangle is:" + area);
                }
                else if(shape.equals("C"))
                {
                    System.out.println("Enter the radius of the Circle");
                    double radius = scanner.nextDouble();

                    Circle c = new Circle(radius);
                    double area = c.computeArea();
                    System.out.println("The area of Circle is:" + area);
                }

                boolean validInputYN = false;
                while (!validInputYN)
                {
                    System.out.print("Do you want to continue(y/n)");
                    String yesOrNo = scanner.next();

                    if(yesOrNo.equals("y") || yesOrNo.equals("n"))
                    {
                        validInputYN = true;

                        if(yesOrNo.equals("n"))
                        {
                            exit = true;
                        }
                    }
                }
            }
            else
            {
                System.out.println("Invalid input!");
            }
        }

    }
}
