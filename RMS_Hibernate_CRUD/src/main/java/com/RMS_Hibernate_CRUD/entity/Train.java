package com.RMS_Hibernate_CRUD.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Train_Information")
public class Train {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column (length =10,nullable =false)
	private int train_no;
	@Column (length =20,nullable =false)
	private String train_name;
	@Column (length =6,nullable =false)
	private int ticket_price;
	@Column(length =50,nullable =false)
	private int ticket_available;
	public int getTrain_no() {
		return train_no;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTrain_no(int train_no) {
		this.train_no = train_no;
	}
	public String getTrain_name() {
		return train_name;
	}
	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}
	public int getTicket_price() {
		return ticket_price;
	}
	public void setTicket_price(int ticket_price) {
		this.ticket_price = ticket_price;
	}
	public int getTicket_available() {
		return ticket_available;
	}
	public void setTicket_available(int ticket_available) {
		this.ticket_available = ticket_available;
	}
}