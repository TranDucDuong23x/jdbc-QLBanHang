package dao;

import java.util.ArrayList;

import model.dondathang;

public class DonDatHangDao implements Inewdao<dondathang>{
	
	public dondathang getInstance() {
		return new dondathang();
	}
	@Override
	public int insert(dondathang t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(dondathang t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(dondathang t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<dondathang> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public dondathang selectById(dondathang t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<dondathang> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
