class Battery extends EnergySource {

	private float charge;

	public boolean empty() {

		if (charge == 0)
			return true;
		else
			return false;

	}

}