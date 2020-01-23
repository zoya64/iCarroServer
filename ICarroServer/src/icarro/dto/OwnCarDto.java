package icarro.dto;

import java.util.ArrayList;

/* "own_cars": [
{
  "serial_number": "123-67-123",
  "make": "Audi",
  "model": "A6",
  "year": "2012",
  "engine": "3.0L V6 DOHC 24V AWD",
  "fuel": "Gas",
  "gear": "Automatic",
  "wheels_drive": "RWD",
  "doors": 4,
  "seats": 5,
  "fuel_consumption": 12.5,
  "features": [],
  "car_class": "C",
  "price_per_day": 43.5,
  "distance_included": 20,
  "about":  "string",
  "pick_up_place": {
    "place_id": "string",
    "latitude": 31.912363,
    "longitude": 34.8047923
  },
  "image_url": [
    "https://a.d-cd.net/4e0c9b9s-1920.jpg",
    "https://a.d-cd.net/3c0c9b9s-1920.jpg"
  ],
  "booked_periods": [
    {
      "order_id": "String",
      "start_date_time": "YYYY-MM-dd HH:mm",
      "end_date_time": "YYYY-MM-dd HH:mm",
      "paid": true,
      "amount":123.34,
      "booking_date":"YYYY-MM-dd HH:mm",
      "person_who_booked": {
        "email": "email@mail.com",
        "first_name": "Brian",
        "second_name": "O'Conner",
        "phone": "972000000000"
      }
    }
  ]
}
],
*/
public class OwnCarDto {
	String serial_number;
	String make;
	String model;
	int year;
	String engine;
	String fuel;
	String gear;
	String wheels_drive;
	int doors;
	int seats;
	double fuel_consumption;
	ArrayList<String> features = new ArrayList<>();
	String car_class;
	double price_per_day;
	int distance_included;
	String about;
	PickupPlaceDTO pick_up_place;
	

}
