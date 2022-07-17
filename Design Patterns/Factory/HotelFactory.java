package Factory;

public class HotelFactory {
	public static Packages createHotel(HotelCode hotelCode) {
		
		switch (hotelCode) {
		
		case Package01:
			return new Package01();
		case Package02:
			return new Package02();
		case Package03:
			return new Package03();
		default:
			return null;
					
		}
	}

}
