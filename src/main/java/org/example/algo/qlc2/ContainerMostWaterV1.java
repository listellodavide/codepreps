package org.example.algo.qlc2;

public class ContainerMostWaterV1 {

    public int findMin(int a, int b) {
        if (a > b) return b;
        return a;
    }

    public int maxArea(int[] height) {
        int maxArea = 0;
        for(int left = 0; left < height.length-1; left++) {
            for(int right = height.length -1; right >= 0; right--) {
                System.out.println(">> left= " + left + " right=" + right);
                if (Math.abs(right - left) * findMin(height[left], height[right]) > maxArea) {
                    maxArea = Math.abs(right - left) * findMin(height[left], height[right]);
                    System.out.println(">> max= " + Math.abs(right - left) + "*" + findMin(height[left], height[right]));
                }
                if (left + 1 < height.length && height[left + 1] > height[left]) {
                    left++;
                }
                if (right -1 >= 0 && height[right - 1] > height[right]) {
                    right--;
                }
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ContainerMostWaterV1 cmw = new ContainerMostWaterV1();
        int[] height = { 1, 8, 6 , 2 , 5 ,4 , 8 ,3 ,7 };
        System.out.println(cmw.maxArea(height));
    }
}
