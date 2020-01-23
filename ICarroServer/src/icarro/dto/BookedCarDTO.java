package icarro.dto;

/*  "booked_cars": [
    {
      "serial_number": "123-67-123",
      "booked_period": {
       "order_id": "String",
          "start_date_time": "YYYY-MM-dd HH:mm",
          "end_date_time": "YYYY-MM-dd HH:mm",
          "paid": true,
          "amount":123.34,
          "booking_date":"YYYY-MM-dd HH:mm"
      }
    }
  ]
*/
public class BookedCarDTO {
	String serial_number;
	BookedPeriodDTO booked_period;

}
