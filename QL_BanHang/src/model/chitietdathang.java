package model;

import java.sql.Date;

public class chitietdathang {
	int sohoadon;
	int MaHang;
	Date GiaHan;
	int soluong;
	int mucgiamgia;
	public chitietdathang(int sohoadon, int maHang, Date giaHan, int soluong, int mucgiamgia) {
		super();
		this.sohoadon = sohoadon;
		MaHang = maHang;
		GiaHan = giaHan;
		this.soluong = soluong;
		this.mucgiamgia = mucgiamgia;
	}
	public chitietdathang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSohoadon() {
		return sohoadon;
	}
	public void setSohoadon(int sohoadon) {
		this.sohoadon = sohoadon;
	}
	public int getMaHang() {
		return MaHang;
	}
	public void setMaHang(int maHang) {
		MaHang = maHang;
	}
	public Date getGiaHan() {
		return GiaHan;
	}
	public void setGiaHan(Date giaHan) {
		GiaHan = giaHan;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public int getMucgiamgia() {
		return mucgiamgia;
	}
	public void setMucgiamgia(int mucgiamgia) {
		this.mucgiamgia = mucgiamgia;
	}
	
}
