package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {1,2,3,4,5,3,7};

        int index;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao vi tri can chen: ");
        index = scanner.nextInt();


        if (index >=0 && index < arr.length) {
            System.out.println("Nhap gia tri con them: ");
            int number = scanner.nextInt();
            for (int i = arr.length -1; i >index;i--) {
                arr[i] = arr [i-1];
            }
            arr[index] = number;
            for (int i =0; i<arr.length; i++) {
                System.out.println("arr["+i+"] = " + arr[i]);
            }
        } else
            System.out.println("khong chen duoc phan tu vao mang");
    }
}
