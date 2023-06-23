package com.onetoone.entity;
import javax.persistence.*;
import lombok.*;

@Entity
@Table(name="tbl_brand")
@Getter
@Setter
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Brand 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "brand")
	private String brandName;
}
