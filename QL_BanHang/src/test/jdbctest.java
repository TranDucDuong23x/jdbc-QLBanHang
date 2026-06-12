package test;

import java.util.ArrayList;

import dao.NhanVienDao;
import model.NhanVien;

public class jdbctest {
	public static void main(String []args) {
		ArrayList<NhanVien> list = NhanVienDao.getInstance().selectAll();
		for(NhanVien nv:list) {
			System.out.println(nv.toString());
		}
		System.out.println("--------------------------------");
		NhanVien find_nv=new NhanVien();
		find_nv.setMaNhanVien("Q001");
		NhanVien nv=NhanVienDao.getInstance().selectById(find_nv);
		System.out.println(nv.toString());
		System.out.println("--------------------------------");
				
	}
}
