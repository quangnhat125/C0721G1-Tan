package _01_bai1.thuc_hanh;

import java.util.Scanner;

public class operator_expression {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: " );
        width=scanner.nextFloat();
        System.out.println("Enter height: ");
        height=scanner.nextFloat();
        float area=width*height;
        System.out.println("Area is : " + area);

    }
}
