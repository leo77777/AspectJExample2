package fr.leo.service;

import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier {

	@Override
	public void process() {
		System.out.println("Business proces ...");
	}

	@Override
	public double compute() {
		double data = 75;
		System.out.println("Business computing and returning");
		return data;
	}

}
