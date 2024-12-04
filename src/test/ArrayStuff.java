package test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayStuff {
    private static Random rand = new Random();
    public static void main(String[] args) {
        int size = 15;
        int maxCount = 10;
        int[] arr = new int[size];
       arraySetup(arr, maxCount);
       System.out.println("before: " +Arrays.toString(arr));
       arr = Arrays.copyOf(arr, maxCount);
        System.out.println("after: " +Arrays.toString(arr));
    }
    public static void arraySetup(int[] arr, int maxCount) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < maxCount; i++) {
            int next = rand.nextInt(420);
            arr[i] = next;
        }
    }
}
