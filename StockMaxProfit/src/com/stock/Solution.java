package com.stock;

/*
 *  Problem link:
 *  https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */

public class Solution {
	public static void main(String[] args) throws Exception {
		int[] prices = {10,8,15,20,1};
		Solution challenge = new Solution();
		
		System.out.println(challenge.solution(prices));
	}
	
	public int solution(int[] prices) throws Exception {
		if (prices == null || prices.length <= 1) {
			throw new IllegalArgumentException("There must be more than one price!");			
		}
		
		int min = Integer.MAX_VALUE;
		int max = 0;
		
		for (int i=0; i<prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
			} else {
				max = Math.max(max, prices[i] - min);
			}
		}
		
		return max;
	}
}
