package model;

public class KhachHang {
	int MaKhachHang;
	String TenCongTy;
	String TenGiaoDich;
	String diachi;
	String email;
	String dienthoai;
	String Fax;
	public KhachHang(int maKhachHang, String tenCongTy, String tenGiaoDich, String diachi, String email,
			String dienthoai, String fax) {
		super();
		MaKhachHang = maKhachHang;
		TenCongTy = tenCongTy;
		TenGiaoDich = tenGiaoDich;
		this.diachi = diachi;
		this.email = email;
		this.dienthoai = dienthoai;
		Fax = fax;
	}
	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMaKhachHang() {
		return MaKhachHang;
	}
	public void setMaKhachHang(int maKhachHang) {
		MaKhachHang = maKhachHang;
	}
	public String getTenCongTy() {
		return TenCongTy;
	}
	public void setTenCongTy(String tenCongTy) {
		TenCongTy = tenCongTy;
	}
	public String getTenGiaoDich() {
		return TenGiaoDich;
	}
	public void setTenGiaoDich(String tenGiaoDich) {
		TenGiaoDich = tenGiaoDich;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDienthoai() {
		return dienthoai;
	}
	public void setDienthoai(String dienthoai) {
		this.dienthoai = dienthoai;
	}
	public String getFax() {
		return Fax;
	}
	public void setFax(String fax) {
		Fax = fax;
	}
	
}
