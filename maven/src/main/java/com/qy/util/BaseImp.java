package com.qy.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseImp {
	protected Connection con;
	protected ResultSet set;
	protected PreparedStatement st;
	//��ȡ���Ӷ���  �������Ӷ���ֵcon
	private void getCon(){
		con=DBUtil.getCon();
	}
	//��ȡԤ�������
	protected void getPPS(String sql) throws SQLException{
		//���û�ȡ���Ӷ���
		getCon();
		//��ȡԤ�������
		st=con.prepareStatement(sql);
		
	}
	//�ر���������
	protected void close(){
		DBUtil.closeAll(con, st, set);
	}
	
	
	
}
