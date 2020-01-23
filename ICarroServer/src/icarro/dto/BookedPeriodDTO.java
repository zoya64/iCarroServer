package icarro.dto;

import java.time.*;

/*"booked_periods": [
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
  ]*/
public class BookedPeriodDTO {
	String order_id;
	LocalDateTime start_date_time;
	LocalDateTime end_date_time;
	boolean paid;
	double amount;
	LocalDate booking_date;
	BookedPersonDTO person_who_booked;

}
