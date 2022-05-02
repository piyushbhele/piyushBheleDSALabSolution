package com.suminbst;

import java.util.Scanner;

public class DriverSumInBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target");
        int target = sc.nextInt();
        SumInBST tree = new SumInBST();

        tree.insert(40);
        tree.insert(20);
        tree.insert(60);
        tree.insert(10);
        tree.insert(30);
        tree.insert(50);
        tree.insert(70);
        tree.isPairPresent(tree.root, target);
    }

}


