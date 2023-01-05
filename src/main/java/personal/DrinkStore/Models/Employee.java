package personal.DrinkStore.Models;

import java.time.LocalDate;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
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
@Table(name = "employee")
@EntityListeners(AuditingEntityListener.class)
public class Employee {
	@Id
	private String id;
	private String name;
	@JsonFormat(shape = JsonFormat.Shape.STRING ,pattern = "yyyy-MM-dd")
	private LocalDate birthday;
	private String gender;
	private String numberphone;
	private String email;
	private String address;
	private String position;
	private int salary;
	@CreatedDate
	@Column(name = "created_at", updatable = false)
	private LocalDate created_at;
	@LastModifiedDate
	private LocalDate updated_at;
	private boolean is_deleted;
}
