package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.jdbcutil;
import model.NhaCungCap;

public class NhaCungCapDao implements Inewdao<NhaCungCap>{
	public static NhaCungCapDao getInstance() {
		return new NhaCungCapDao();
	}

	@Override
	public int insert(NhaCungCap t) {
		// TODO Auto-generated method stub
		int ketqua=0;
		try {
			Connection connect=jdbcutil.getConnection();
			Statement st=connect.createStatement();
			String sql="insert into NhaCungCap(MaCongTy,TenCongTy,TenGiaoDich,DiaChi,DienThoai,Fax,Email)" + "values('" + t.getMaCongTy() + "' , '" + t.getTencongty() + "' , '" + t.getTengiaodich() + "' , '" + t.getDiachi() + "' , '" + t.getDienthoai() + "' , '" + t.getFax() + "' , '" + t.getEmail() +"')";
			ketqua=st.executeUpdate(sql);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return ketqua;
	
	}

	@Override
	public int delete(NhaCungCap t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(NhaCungCap t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<NhaCungCap> selectAll() {
		ArrayList<NhaCungCap> ketqua=new ArrayList<NhaCungCap>();
		NhaCungCap vendor=null;
		try {
			Connection connect =jdbcutil.getConnection();
			Statement st=connect.createStatement();
			String sql="select * from nhacungcap";
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				String MaCongTy=rs.getString("MaCongTy");
				String TenCongTy=rs.getString("TenCongTy");
				String TenGiaoDich=rs.getString("TenGiaoDich");
				String DiaChi=rs.getString("DiaChi");
				String DienThoai=rs.getString("DienThoai");
				String Fax=rs.getString("Fax");
				String Email=rs.getString("Email");
				vendor=new NhaCungCap(MaCongTy,TenCongTy,TenGiaoDich,DiaChi,DienThoai,Fax,Email);
				ketqua.add(vendor);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return ketqua;
	}

	@Override
	public NhaCungCap selectById(NhaCungCap t) {
		// TODO Auto-generated method stub
		NhaCungCap vendor=null;
		try {
			Connection connect=jdbcutil.getConnection();
			Statement st= connect.createStatement();
			String sql="select * from nhacungcap where MaCongTy= '" + t.getMaCongTy() + "'";
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				String MaCongTy=rs.getString("MaCongTy");
				String TenCongTy=rs.getString("TenCongTy");
				String TenGiaoDich=rs.getString("TenGiaoDich");
				String DiaChi = rs.getString("DiaChi");
				String DienThoai = rs.getString("DienThoai");
				String Fax = rs.getString("Fax");
				String Email = rs.getString("Email");
				vendor=new NhaCungCap(MaCongTy,TenCongTy,TenGiaoDich,DiaChi,DienThoai,Fax,Email);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return vendor;
	}

	@Override
	public ArrayList<NhaCungCap> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		ArrayList<NhaCungCap> ketqua=new ArrayList<NhaCungCap>();
		NhaCungCap vendor=null;
		try {
			Connection connect = jdbcutil.getConnection();
			Statement st=connect.createStatement();
			String sql="select * from nhacungcap where " + condition;
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				String MaCongTy=rs.getString("MaCongTy");
				String TenCongTy=rs.getString("TenCongTy");
				String TenGiaoDich=rs.getString("TenGiaoDich");
				String DiaChi=rs.getString("DiaChi");
				String DienThoai=rs.getString("DienThoai");
				String Fax=rs.getString("Fax");
				String Email=rs.getString("Email");
				vendor=new NhaCungCap(MaCongTy,TenCongTy,TenGiaoDich,DiaChi,DienThoai,Fax,Email);
				ketqua.add(vendor);
			}
		}catch(SQLException e) {
			
		}
		return ketqua;
	}

}
