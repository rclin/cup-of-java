interface Lookup {
	/** Return the value associated with the name, or
	 *  null if there is no such value */

	//implicitly public
	Object find(String name);
}