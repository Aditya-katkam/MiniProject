package com.example.demo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FARMER")
public class Farmer {
	@Column(name="FARMER_ID")
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    int farmerId;

     @Column(name="NAME")
     String name;

     

     @Column(name="AGE")
     int age;

  
         

	public int getFarmerId() {
		return farmerId;
	}

	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

     
    

}
