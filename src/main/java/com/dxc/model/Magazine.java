package com.dxc.model;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="magazine")
public class Magazine {
	@Id
	
	private int floorno;
	private String shelfno;
	private String name;
	private Date date;
	
	public Magazine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Magazine(int floorno, String shelfno, String name, String strDate) throws ParseException {
		super();
		this.floorno = floorno;
		this.shelfno = shelfno;
		this.name = name;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		date = sdf.parse(strDate);
		
	}
	
	@Column(name="floorno",nullable=false)
	public int getFloorno() {
		return floorno;
	}
	public void setFloorno(int floorno) {
		this.floorno = floorno;
	}
	@Column(name="shelfno",nullable=false)
	public String getShelfno() {
		return shelfno;
	}
	public void setShelfno(String shelfno) {
		this.shelfno = shelfno;
	}
	@Column(name="name",nullable=false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name ="date",nullable=false)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		
		String strDate = new SimpleDateFormat("dd-MM-yyyy").format(date);
		return "Newspaper [floorno=" + floorno + ", shelfno=" + shelfno + ", name=" + name + ", date=" + strDate + "]";
	}
	
}

