package abstract_classes;

public class SanDiego extends City {

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getAnnualTaxes() {
		return population * growthRate + 1000000;
	}

}
