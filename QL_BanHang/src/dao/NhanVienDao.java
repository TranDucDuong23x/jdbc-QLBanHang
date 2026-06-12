package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.jdbcutil;
import model.NhanVien;

public class NhanVienDao implements Inewdao<NhanVien>{
	public static NhanVienDao getInstance() {
		return new NhanVienDao();
	}
	@Override
	public int insert(NhanVien t) {
		// TODO Auto-generated method stub
		int ketqua=0;
		try {
			Connection connect =jdbcutil.getConnection();
			String sql="insert into NhanVien(MaNhanVien,Ho,Ten,NgaySinh,NgayLamViec,DiaChi,DienThoai,LuongCoBan,PhuCap)"
			+ "values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement st=connect.prepareStatement(sql);
			st.setString(1, t.getMaNhanVien());
			st.setString(2, t.getHo());
			st.setString(3, t.getTen());
			st.setDate(4,t.getNgaySinh());
			st.setDate(5, t.getNgaylamviec());
			st.setString(5, t.getDiachi());
			st.setString(6, t.getDienthoai());
			st.setString(7, t.getLuongCoBan());
			st.setString(8, t.getPhucap());
			ketqua=st.executeUpdate(sql);
			jdbcutil.closeConnection(connect);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return ketqua;
	}

	@Override
	public int delete(NhanVien t) {
		int ketqua=0;
		try {
			Connection connect=jdbcutil.getConnection();
			String sql="delete from nhanvien where MaNhanVien=?";
			PreparedStatement pst=connect.prepareStatement(sql);
			pst.setString(1, t.getMaNhanVien());
			ketqua=pst.executeUpdate();
			jdbcutil.closeConnection(connect);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return ketqua;
	}

	@Override
	public int update(NhanVien t) {
		// TODO Auto-generated method stub
		int ketqua=0;
		try {
			Connection connect=jdbcutil.getConnection();
			String sql="update nhanvien set DienThoai= ?";
			PreparedStatement pst=connect.prepareStatement(sql);
			ketqua=pst.executeUpdate();
			jdbcutil.closeConnection(connect);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return ketqua;
	}

	@Override
	public ArrayList<NhanVien> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<NhanVien> ketqua=new ArrayList<NhanVien>();
		Connection connect =jdbcutil.getConnection();
		try {
			String sql="SELECT * FROM NhanVien";
			PreparedStatement pst=connect.prepareStatement(sql);
			
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				String MaNhanVien=rs.getString("MaNhanVien");
				String Ho=rs.getString("Ho");
				String ten=rs.getString("Ten");
				Date NgaySinh=rs.getDate("NgaySinh");
				Date NgayLamViec = rs.getDate("NgayLamViec");
				String DiaChi = rs.getString("DiaChi");
				String DienThoai=rs.getString("DienThoai");
				String LuongCoBan=rs.getString("LuongCoBan");
				String PhuCap=rs.getString("PhuCap");
				NhanVien nv=new NhanVien(MaNhanVien,Ho,ten,NgaySinh,NgayLamViec,DiaChi,DienThoai,LuongCoBan,PhuCap);
				ketqua.add(nv);
				
			}
			jdbcutil.closeConnection(connect);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return ketqua;
	}

	@Override
	public NhanVien selectById(NhanVien t) {
		// TODO Auto-generated method stub
		NhanVien nv = null;
		try {
			Connection connect=jdbcutil.getConnection();
			
			String sql="select * from nhanvien where MaNhanVien=?";
			PreparedStatement pst=connect.prepareStatement(sql);
			pst.setString(1, t.getMaNhanVien());
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				String MaNhanVien=rs.getString("MaNhanVien");
				String Ho=rs.getString("Ho");
				String Ten=rs.getString("Ten");
				Date NgaySinh=rs.getDate("NgaySinh");
				Date NgayLamViec = rs.getDate("NgayLamViec");
				String DiaChi = rs.getString("DiaChi");
				String DienThoai = rs.getString("DienThoai");
				String LuongCoBan = rs.getString("LuongCoBan");
				String phuCap= rs.getString("PhuCap");
				nv=new NhanVien(MaNhanVien,Ho,Ten,NgaySinh,NgayLamViec,DiaChi,DienThoai,LuongCoBan,phuCap);
			}
			return nv;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<NhanVien> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		ArrayList<NhanVien> ketqua=new ArrayList<NhanVien>();
		NhanVien nv=null;
		try {
			Connection connect=jdbcutil.getConnection();
			Statement st=connect.createStatement();
			String sql="select * from nhanvien where " + condition;
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				String MaNhanVien=rs.getString("MaNhanVien");
				String Ho=rs.getString("Ho");
				String Ten=rs.getString("Ten");
				Date NgaySinh=rs.getDate("NgaySinh");
				Date NgayLamViec=rs.getDate("NgayLamViec");
				String DiaChi=rs.getString("DiaChi");
				String DienThoai=rs.getString("DienThoai");
				String LuongCoBan=rs.getString("LuongCoBan");
				String PhuCap=rs.getString("PhuCap");
				nv=new NhanVien(MaNhanVien,Ho,Ten,NgaySinh,NgayLamViec,DiaChi,DienThoai,LuongCoBan,PhuCap);
				ketqua.add(nv);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return ketqua;
	}

}
