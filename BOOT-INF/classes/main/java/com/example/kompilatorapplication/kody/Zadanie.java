package com.example.kompilatorapplication.kody; public class Zadanie { public static void main(String args[]) { int[] arr = {1,5,3,2,5,6}; System.out.println(maxProfit(arr)); } public static int maxProfit(int[] prices) { int minPrice = Integer.MAX_VALUE; int maxProfit = 0; for (int i = 0; i < prices.length; i++) { if (prices[i] < minPrice) { minPrice = prices[i]; } else if (prices[i] - minPrice > maxProfit) { maxProfit = prices[i] - minPrice; } } return maxProfit; } }


