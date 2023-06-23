package com.onetoone.entity;

import java.math.BigDecimal;
import javax.persistence.*;

import com.onetoone.request.LaptopRequest;

import lombok.*;

@Entity
@Table(name="tbl_laptop")
@Getter
@Setter
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Laptop 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private BigDecimal price;
	
	@OneToOne
	@JoinColumn(name = "brand_id")
	private Brand brand;
	public Laptop(LaptopRequest request) 
	{
		this.name = request.getName();
		this.price = request.getPrice(); 
	}
	
	
}
