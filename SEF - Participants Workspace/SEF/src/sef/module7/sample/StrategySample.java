package sef.module7.sample;

public class StrategySample {

	public static void main(String arg[]){
		
		//Use interfaces when declaring identifiers instead of the actual classes
		
		Strategy s1 = new StrategyImplOne();
		Strategy s2 = new StrategyImplTwo();
		Strategy s3 = new StrategyImplThree();
		
		General g = new General("John Doe");
		
		//Instead of creating subclasses of 'General' with different strategies
		//We instead assign different 'strategies' to the General
		g.setMyStrategy(s1);
		g.executeStrategy();
		g.setMyStrategy(s2);
		g.executeStrategy();
		g.setMyStrategy(s3);
		g.executeStrategy();
		
	}
}
