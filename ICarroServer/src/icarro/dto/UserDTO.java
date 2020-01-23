package icarro.dto;

import java.time.LocalDate;
import java.util.ArrayList;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;



//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class UserDTO {
	String email;
	String first_name;
	String second_name;
	LocalDate registration_date;
	ArrayList<String> comments = new ArrayList<>();
	OwnCarDto[] own_cars;
	BookedCarDTO[] booked_cars;
	BookedCarDTO[] history;	

}
