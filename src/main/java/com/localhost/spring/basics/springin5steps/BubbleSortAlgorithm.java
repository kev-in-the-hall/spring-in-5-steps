package com.localhost.spring.basics.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm {

	@Override
	public int[] sort(int[] input) {
		// Logic for Bubble Sort
		return input;
	}
}
