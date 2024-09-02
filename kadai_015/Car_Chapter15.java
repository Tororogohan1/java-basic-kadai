package kadai_015;

public class Car_Chapter15 {

	private int gear = 1;
	private int speed =  10;
	
	public void gearChange(int afterGear) {
		int previousGear = this.gear;
		this.gear = afterGear;
		this.speed = (afterGear >= 1 && afterGear <= 5) ? afterGear * 10 : 10;
        System.out.println("ギアを" + previousGear + "から" + afterGear + "に切り替えました");
    }
	public void run() {
        System.out.println("速度は時速" + this.speed + "kmです");
    }
}