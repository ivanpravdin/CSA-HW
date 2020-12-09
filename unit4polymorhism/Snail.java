package app.unit4polymorhism;

/**
 * Concrete class of Golden eagle
 */
class Snail extends AAnimal {
	Snail() {
		super("Normal snail");
	}

	/**
	 * Adding interesting feature
	 */
	@Override
	String showYourself() {
		// TODO Auto-generated method stub
		return super.showYourself() + ", Max Speed 0.1 km/h";
	}
}