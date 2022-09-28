package org.example.algo.qlc2;

public class ContainerMostWaterV2 {

    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right) {
            int width = right - left;
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * width);
            if(height[left] > height[right]) right--;
            else left++;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ContainerMostWaterV2 cmw = new ContainerMostWaterV2();
        int[] height = { 1, 8, 6 , 2 , 5 ,4 , 8 ,3 ,7 };
        System.out.println(cmw.maxArea(height));
    }
}
