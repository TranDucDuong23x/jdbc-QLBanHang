package model;

import java.sql.Date;

public class dondathang {
	int sohoadon;
	int MaKhachHang;
	int MaNhanVien;
	Date ngaydathang;
	Date ngaygiaohang;
	Date ngaychuyenhang;
	String noigiaohang;
	public dondathang(int sohoadon, int maKhachHang, int maNhanVien, Date ngaydathang, Date ngaygiaohang,
			Date ngaychuyenhang, String noigiaohang) {
		super();
		this.sohoadon = sohoadon;
		MaKhachHang = maKhachHang;
		MaNhanVien = maNhanVien;
		this.ngaydathang = ngaydathang;
		this.ngaygiaohang = ngaygiaohang;
		this.ngaychuyenhang = ngaychuyenhang;
		this.noigiaohang = noigiaohang;
	}
	public dondathang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSohoadon() {
		return sohoadon;
	}
	public void setSohoadon(int sohoadon) {
		this.sohoadon = sohoadon;
	}
	public int getMaKhachHang() {
		return MaKhachHang;
	}
	public void setMaKhachHang(int maKhachHang) {
		MaKhachHang = maKhachHang;
	}
	public int getMaNhanVien() {
		return MaNhanVien;
	}
	public void setMaNhanVien(int maNhanVien) {
		MaNhanVien = maNhanVien;
	}
	public Date getNgaydathang() {
		return ngaydathang;
	}
	public void setNgaydathang(Date ngaydathang) {
		this.ngaydathang = ngaydathang;
	}
	public Date getNgaygiaohang() {
		return ngaygiaohang;
	}
	public void setNgaygiaohang(Date ngaygiaohang) {
		this.ngaygiaohang = ngaygiaohang;
	}
	public Date getNgaychuyenhang() {
		return ngaychuyenhang;
	}
	public void setNgaychuyenhang(Date ngaychuyenhang) {
		this.ngaychuyenhang = ngaychuyenhang;
	}
	public String getNoigiaohang() {
		return noigiaohang;
	}
	public void setNoigiaohang(String noigiaohang) {
		this.noigiaohang = noigiaohang;
	}
	
}
