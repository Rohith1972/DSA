/*
    ProblemStatement:
    You are given heights of n consecutive buildingsyou can move from roof of one building to
    roof of adjacent building now fimd the max no.of consecutive steps you can put forward such
    that you can gain in increasing altitude in each step.
*/

import java.util.Scanner;

public class BuildingAltitude {
    static int buildingAltitude(int[] arr,int n){
        int maxSteps = 0;
        int currSteps = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                currSteps++; 
                maxSteps = Math.max(maxSteps, currSteps);
            } else {
                currSteps = 0; 
            }
        }
        return maxSteps;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = buildingAltitude(arr,n);
        System.out.println(res);
    }
}
