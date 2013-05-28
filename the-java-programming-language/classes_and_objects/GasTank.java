class GasTank implements EnergySource {

	private float gallons;

	public boolean empty() {
		if (gallons == 0)
			return true;
		else
			return false;
	}

}
