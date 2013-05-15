class ExtendShow extends SuperShow {

	public String str = "ExtendStr";

	public void show() {
		System.out.println("Extend.show " + str);

	}

	public void foo() {
		System.out.println("ExtendShow.foo()");
	}

	public static void main(String[] args) {
		ExtendShow ext = new ExtendShow();
		SuperShow sup = ext;

		sup.show();
		ext.show();
		System.out.println("sup.str " + sup.str);
		System.out.println("ext.str " + ext.str);

		sup.foo();
	}
}