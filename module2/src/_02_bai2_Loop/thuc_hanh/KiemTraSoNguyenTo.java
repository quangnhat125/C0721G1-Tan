package _02_bai2_Loop.thuc_hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number= Integer.parseInt(scanner.nextLine());
        if(number<2){
            System.out.println(number+" is not a prime");
        }
        else{
            int i=2;
            boolean check =true;
            while(i<number/2){
                if(number%i==0){
                    check=false;
                    break;
                }
                i++;
            }
            if(check){
                System.out.println(number + " is a prime");
            }
            else {
                System.out.println(number + " is not a prime");
            }

        }

    }
}
