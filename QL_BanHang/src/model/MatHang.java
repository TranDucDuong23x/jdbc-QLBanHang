package model;

import java.sql.Date;

public class MatHang {
	int MaHang;
	String TenHang;
	String MaCongTy;
	int MaLoaiHang;
	int SoLuong;
	String DonViTinh;
	Date GiaHan;
	public MatHang(int maHang, String tenHang, String maCongTy, int maLoaiHang, int soLuong, String donViTinh,
			Date giaHan) {
		super();
		MaHang = maHang;
		TenHang = tenHang;
		MaCongTy = maCongTy;
		MaLoaiHang = maLoaiHang;
		SoLuong = soLuong;
		DonViTinh = donViTinh;
		GiaHan = giaHan;
	}
	public MatHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMaHang() {
		return MaHang;
	}
	public void setMaHang(int maHang) {
		MaHang = maHang;
	}
	public String getTenHang() {
		return TenHang;
	}
	public void setTenHang(String tenHang) {
		TenHang = tenHang;
	}
	public String getMaCongTy() {
		return MaCongTy;
	}
	public void setMaCongTy(String maCongTy) {
		MaCongTy = maCongTy;
	}
	public int getMaLoaiHang() {
		return MaLoaiHang;
	}
	public void setMaLoaiHang(int maLoaiHang) {
		MaLoaiHang = maLoaiHang;
	}
	public int getSoLuong() {
		return SoLuong;
	}
	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}
	public String getDonViTinh() {
		return DonViTinh;
	}
	public void setDonViTinh(String donViTinh) {
		DonViTinh = donViTinh;
	}
	public Date getGiaHan() {
		return GiaHan;
	}
	public void setGiaHan(Date giaHan) {
		GiaHan = giaHan;
	}
	
}
