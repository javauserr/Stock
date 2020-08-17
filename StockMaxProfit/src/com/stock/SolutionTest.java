package com.stock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

	private Solution sol;

	@Before
	public void initObjects() {
		sol = new Solution();
	}

	// Output: 21 (Buy at 14, sell at 35)
	@Test
	public void testMaxProfit() throws Exception {
		int[] prices = { 66, 14, 25, 35, 28, 17, 8 };
		Assert.assertEquals(21, sol.solution(prices));
	}

	@Test
	public void testNoBuySellPossible() throws Exception {
		int[] prices = { 45, 44, 22 };
		Assert.assertEquals(0, sol.solution(prices));
	}

	// Output: 20 (Buy at 20, sell at 40)
	@Test
	public void testMaxProfit2() throws Exception {
		int[] prices = { 45, 34, 36, 20, 40 };

		Assert.assertEquals(20, sol.solution(prices));
	}

	// Output: 25 (Buy at 15, sell at 40)
	@Test
	public void testMaxProfit3() throws Exception {
		int[] prices = { 15, 40, 22, 25, 1 };

		assertEquals(25, sol.solution(prices));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMaxProfitOnePrice() throws Exception {
		int[] prices = { 7 };

		sol.solution(prices);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMaxProfitNoPrice() throws Exception {
		int[] prices = {};

		sol.solution(prices);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMaxProfitNull() throws Exception {
		int[] prices = null;

		sol.solution(prices);
	}
}
