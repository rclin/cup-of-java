class ColorAttr extends Attr {
	
	private ScreenColor myColor;  // the decoded color
	
	public ColorAttr(String name, Object value) {
		super(name, value);
		decodeColor();
	}
	
	public ColorAttr(String name) {
		this(name, "transparent");
	}
	
	public ColorAttr(String name, ScreenColor value) {
		super(name, value.toString());
		myColor = value;
	}
	
	// overrides super class method
	public Object setValue(Object newValue) {
		
		Object retval = super.setValue(newValue);
		decodeColor();
		return retval;
	}
	
	// overloads super class method
	public ScreenColor setValue(ScreenColor newValue) {
		super.setValue(newValue.toString());
		ScreenColor oldValue = myColor;
		myColor = newValue;
		return oldValue;
	}
	
	public ScreenColor getColor() {
		return myColor;
	}
	
	/** set ScreenColor from description in getValue */
	protected void decodeColor() {
		if (getValue() == null)
			myColor = null;
		else
			myColor = new ScreenColor(getValue());
	}
	
	
}