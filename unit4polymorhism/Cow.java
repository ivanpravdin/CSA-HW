package app.unit4polymorhism;

/**
 * Concrete class of Golden eagle
 */
class Cow extends AAnimal {
	Cow() {
		super("Normal cow");
	}

	/**
	 * Adding interesting feature
	 */
	@Override
	String showYourself() {
		// TODO Auto-generated method stub
		return super.showYourself() + ", Max Speed 3 km/h";
	}
}