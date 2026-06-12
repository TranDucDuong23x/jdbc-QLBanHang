package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.jdbcutil;
import model.KhachHang;

public class KhachHangDao implements Inewdao<KhachHang>{
	
	public static KhachHangDao getInstance() {
		return new KhachHangDao();
	}
	@Override
	public int insert(KhachHang t) {
		// TODO Auto-generated method stub
		try {
			Connection connect=jdbcutil.getConnection();
			Statement st=connect.createStatement();
			String sql="insert into khachhang(MaKhachHang,TenCongTy,TenGiaoDich,DiaChi,Email,DienThoai,Fax)"
			+"values('" + t.getMaKhachHang() + "' , '" + t.getTenCongTy() + "' , '" + t.getTenGiaoDich() + "' , '" + t.getDiachi() + 
			"' , '" + t.getEmail() + "' , '" + t.getDienthoai() + "' , '" + t.getFax() + "')";
			int check=st.executeUpdate(sql);
			System.out.println("So dong da thay doi " + check);
			jdbcutil.closeConnection(connect);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(KhachHang t) {
		// TODO Auto-generated method stub
		int ketqua=0;
		try {
			Connection connect = jdbcutil.getConnection();
			Statement st=connect.createStatement();
			String sql="delete from khachhang where MaKhachHang='" + t.getMaKhachHang()+"'";
			ketqua=st.executeUpdate(sql);
			System.out.println("So dong da thay doi: " + ketqua);
			jdbcutil.closeConnection(connect);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return ketqua;
	}

	@Override
	public int update(KhachHang t) {
		int ketqua=0;
		try {
			Connection connect=jdbcutil.getConnection();
			Statement st=connect.createStatement();
			String sql="update khachhang " + " set DienThoai='" + t.getDienthoai()+"' ";
			ketqua=st.executeUpdate(sql);
			System.out.println("So dong da thay doi " + ketqua);
			jdbcutil.closeConnection(connect);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return ketqua;
	}

	@Override
	public ArrayList<KhachHang> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public KhachHang selectById(KhachHang t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<KhachHang> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
