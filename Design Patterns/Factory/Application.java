package Factory;

public class Application {
	public static void main(String[] args) {
		
		Packages pkg1 = HotelFactory.createHotel(HotelCode.Package01);
		System.out.println(pkg1);
		
		Packages pkg2 = HotelFactory.createHotel(HotelCode.Package02);
		System.out.println(pkg2);
		
		Packages pkg3 = HotelFactory.createHotel(HotelCode.Package03);
		System.out.println(pkg3);
	}

}
