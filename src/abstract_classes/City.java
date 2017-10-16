package abstract_classes;

public abstract class City {
	protected int population;
	protected double growthRate;
	
	public City(int population, double growthRate) {
		this.population = population;
		this.growthRate = growthRate;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public double getGrowthRate() {
		return growthRate;
	}
	
	abstract double getAnnualTaxes();
	//REMINDER: the return 0 is there so there are no errors. You stil need to work on the method.
}
