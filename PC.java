package Overriding;

class PC extends LapTop {
	@Override
	public void getSystemInfo() {
		System.out.println("System OS Is : MAC");
	}		

	public static void main(String[] args) {
		PC info = new PC();
		info.getSystemInfo();
	}

}
