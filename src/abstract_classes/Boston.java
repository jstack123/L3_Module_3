package abstract_classes;

public class Boston extends City {
	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	public double getAnnualTaxes() {
		return 0;
	}
}
