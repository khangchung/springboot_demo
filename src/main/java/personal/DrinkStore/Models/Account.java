package personal.DrinkStore.Models;

import java.time.LocalDate;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "account")
public class Account {
	@Id
	private String username;
	private String password;
	private int role;
	@CreatedDate
	private LocalDate created_at;
	@LastModifiedDate
	private LocalDate updated_at;
	private boolean is_deleted;
}
