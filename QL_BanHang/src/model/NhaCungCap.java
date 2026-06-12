package model;

public class NhaCungCap {
	String MaCongTy;
	String tencongty;
	String tengiaodich;
	String diachi;
	String dienthoai;
	String fax;
	String email;
	public NhaCungCap(String maCongTy, String tencongty, String tengiaodich, String diachi, String dienthoai,
			String fax, String email) {
		super();
		MaCongTy = maCongTy;
		this.tencongty = tencongty;
		this.tengiaodich = tengiaodich;
		this.diachi = diachi;
		this.dienthoai = dienthoai;
		this.fax = fax;
		this.email = email;
	}
	public NhaCungCap() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMaCongTy() {
		return MaCongTy;
	}
	public void setMaCongTy(String maCongTy) {
		MaCongTy = maCongTy;
	}
	public String getTencongty() {
		return tencongty;
	}
	public void setTencongty(String tencongty) {
		this.tencongty = tencongty;
	}
	public String getTengiaodich() {
		return tengiaodich;
	}
	public void setTengiaodich(String tengiaodich) {
		this.tengiaodich = tengiaodich;
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
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
