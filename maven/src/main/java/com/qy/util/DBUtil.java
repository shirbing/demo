package com.qy.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSourceFactory;



public class DBUtil {
	//属性
	private static Properties p=new Properties();
	private static DataSource source=null;
	static{
		//获取配置文件
		//加载器对象
		InputStream in=Thread.currentThread().getContextClassLoader().getResourceAsStream("dbcp.properties");

		try {
			//将数据加载到属性p中
			p.load(in);
			//获取数据源对象
			source=BasicDataSourceFactory.createDataSource(p);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//获取连接读写
	public static Connection getCon(){
		Connection con=null;
		try {
			con=source.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}
	//关闭连接
	public static void closeAll(Connection con,Statement st,ResultSet set){

		try {
			if(con!=null)con.close();
			if(st!=null)st.close();
			if(set!=null)set.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}




}
