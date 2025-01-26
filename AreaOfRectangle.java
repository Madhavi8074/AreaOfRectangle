import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lenght of the rectangle (integer): ");
        int length=sc.nextInt();
        System.out.println("Enter the width of the rectangle (float): ");
        float width=sc.nextFloat();
        float area=length*width;
        System.out.println("The area of the rectangle is: "+area);

        sc.close();


    }
}
