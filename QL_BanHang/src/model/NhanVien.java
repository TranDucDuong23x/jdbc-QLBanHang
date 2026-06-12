package model;

import java.sql.Date;

public class NhanVien {
	String MaNhanVien;
	String ho;
	String ten;
	Date NgaySinh;
	Date ngaylamviec;
	String diachi;
	String dienthoai;
	String LuongCoBan;
	String phucap;
	public NhanVien(String maNhanVien, String ho, String ten,Date NgaySinh, Date ngaylamviec, String diachi, String dienthoai,
			String luongCoBan, String phucap) {
		super();
		MaNhanVien = maNhanVien;
		this.ho = ho;
		this.ten = ten;
		this.NgaySinh=NgaySinh;
		this.ngaylamviec = ngaylamviec;
		this.diachi = diachi;
		this.dienthoai = dienthoai;
		LuongCoBan = luongCoBan;
		this.phucap = phucap;
	}
	public Date getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		NgaySinh = ngaySinh;
	}
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMaNhanVien() {
		return MaNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		MaNhanVien = maNhanVien;
	}
	public String getHo() {
		return ho;
	}
	@Override
	public String toString() {
		return "NhanVien [MaNhanVien=" + MaNhanVien + ", ho=" + ho + ", ten=" + ten + ", NgaySinh=" + NgaySinh
				+ ", ngaylamviec=" + ngaylamviec + ", diachi=" + diachi + ", dienthoai=" + dienthoai + ", LuongCoBan="
				+ LuongCoBan + ", phucap=" + phucap + "]";
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Date getNgaylamviec() {
		return ngaylamviec;
	}
	public void setNgaylamviec(Date ngaylamviec) {
		this.ngaylamviec = ngaylamviec;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getDienthoai() {
		return dienthoai;
	}
	public void setDienthoai(String dienthoai) {
		this.dienthoai = dienthoai;
	}
	public String getLuongCoBan() {
		return LuongCoBan;
	}
	public void setLuongCoBan(String luongCoBan) {
		LuongCoBan = luongCoBan;
	}
	public String getPhucap() {
		return phucap;
	}
	public void setPhucap(String phucap) {
		this.phucap = phucap;
	}
	
}
