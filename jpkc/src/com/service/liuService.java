package com.service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dao.DB;
import com.orm.Ttimu;
import com.orm.Tzhuanye;

public class liuService
{
	
	public static String getUserName(String id)
	{
		String name="";
		
		String sql="select * from t_user where id=?";
		Object[] params={id};
		DB mydb=new DB();
		try
		{
			mydb.doPstm(sql, params);
			ResultSet rs=mydb.getRs();
			rs.next();
			name=rs.getString("loginname");
			rs.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		mydb.closed();
		return name;
	}
	
	public static String getZhuanyeName(int id)
	{
		String zhuanye_name="";
		
		String sql="select * from t_zhuanye where id="+id;
		Object[] params={};
		DB mydb=new DB();
		try
		{
			mydb.doPstm(sql, params);
			ResultSet rs=mydb.getRs();
			rs.next();
			zhuanye_name=rs.getString("name");
			rs.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		mydb.closed();
		return zhuanye_name;
	}
	
	public static String getBanjiName(int id)
	{
		String name="";
		
		String sql="select * from t_banji where id="+id;
		Object[] params={};
		DB mydb=new DB();
		try
		{
			mydb.doPstm(sql, params);
			ResultSet rs=mydb.getRs();
			rs.next();
			name=rs.getString("name");
			rs.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		mydb.closed();
		return name;
	}
	
	public static String getStuXuehao(int id)
	{
		String xuehao="";
		
		String sql="select * from t_stu where id="+id;
		Object[] params={};
		DB mydb=new DB();
		try
		{
			mydb.doPstm(sql, params);
			ResultSet rs=mydb.getRs();
			rs.next();
			xuehao=rs.getString("xuehao");
			rs.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		mydb.closed();
		return xuehao;
	}
	
	public static String getKechengName(int id)
	{
		String name="";
		
		String sql="select * from t_kecheng where id="+id;
		Object[] params={};
		DB mydb=new DB();
		try
		{
			mydb.doPstm(sql, params);
			ResultSet rs=mydb.getRs();
			rs.next();
			name=rs.getString("name");
			rs.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		mydb.closed();
		return name;
	}
	
	public static String getTeaName(int id)
	{
		String name="";
		
		String sql="select * from t_tea where id="+id;
		Object[] params={};
		DB mydb=new DB();
		try
		{
			mydb.doPstm(sql, params);
			ResultSet rs=mydb.getRs();
			rs.next();
			name=rs.getString("name");
			rs.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		mydb.closed();
		return name;
	}

	public static String getJiaoshiName(int id)
	{
		String name="";
		
		String sql="select * from t_jiaoshi where id="+id;
		Object[] params={};
		DB mydb=new DB();
		try
		{
			mydb.doPstm(sql, params);
			ResultSet rs=mydb.getRs();
			rs.next();
			name=rs.getString("name");
			rs.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		mydb.closed();
		return name;
	}
	
	public static boolean getTeabyjiaoshihao(String jiaoshihao)
	{
		boolean b=false;
		
		String sql="select * from t_tea where del='no' and bianhao=?";
		Object[] params={jiaoshihao};
		DB mydb=new DB();
		try
		{
			mydb.doPstm(sql, params);
			ResultSet rs=mydb.getRs();
			b=(rs==null||!rs.next()?false:true);
			rs.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		mydb.closed();
		return b;
	}
	
	
	public static boolean getStubyxuehao(String xuehao)
	{
		boolean b=false;
		
		String sql="select * from t_stu where del='no' and xuehao=?";
		Object[] params={xuehao};
		DB mydb=new DB();
		try
		{
			mydb.doPstm(sql, params);
			ResultSet rs=mydb.getRs();
			b=(rs==null||!rs.next()?false:true);
			rs.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		mydb.closed();
		return b;
	}

	
	public static Ttimu getTimuById(int id)
	{
		Ttimu timu=new Ttimu();
		
		String sql="select * from t_timu where id=?";
		Object[] params={id};
		DB mydb=new DB();
		try
		{
			mydb.doPstm(sql, params);
			ResultSet rs=mydb.getRs();
			rs.next();
			timu.setId(rs.getInt("id"));
			timu.setName(rs.getString("name"));
			timu.setXuanxianga(rs.getString("xuanxianga"));
			timu.setXuanxiangb(rs.getString("xuanxiangb"));
			
			timu.setXuanxiangc(rs.getString("xuanxiangc"));
			timu.setXuanxiangd(rs.getString("xuanxiangd"));
			timu.setDaan(rs.getString("daan"));
			timu.setFenshu(rs.getInt("fenshu"));
				
			rs.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		mydb.closed();
		
		return timu;
	}
	
	
	public static List<Integer> getAllTimuId()
	{
        List<Integer> timu_idList=new ArrayList<Integer>();
		
		String sql="select * from t_timu where del='no'";
		Object[] params={};
		DB mydb=new DB();
		try
		{
			mydb.doPstm(sql, params);
			ResultSet rs=mydb.getRs();
			while(rs.next())
			{
				timu_idList.add(rs.getInt("id"));
		    }
			rs.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		mydb.closed();
		
		return timu_idList;
		
	}
	
 
	public static int[] Random(int suoyoudeshu[],int geshu)
	{
		if(suoyoudeshu.length<geshu)
		{
			return suoyoudeshu;
		}
		
		int[] numbers = suoyoudeshu;
		int n=numbers.length;
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = i + 1;
		}
		int[] result = new int[geshu];
		for (int i = 0; i < result.length; i++)

		{

			int r = (int) (Math.random() * n);

			result[i] = numbers[r];

			numbers[r] = numbers[n - 1];

			n--;

		}
		
		return result;  

	}
	
	public static int[] Random(List<Integer> list,int geshu)
	{
		int[] numbers = new int[list.size()];
		for(int i=0;i<list.size();i++)
		{
			numbers[i]=list.get(i);
		}
		
		if(numbers.length<geshu)
		{
			return numbers;
		}
		
		int n=numbers.length;
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = i + 1;
		}
		int[] result = new int[geshu];
		for (int i = 0; i < result.length; i++)

		{

			int r = (int) (Math.random() * n);

			result[i] = numbers[r];

			numbers[r] = numbers[n - 1];

			n--;

		}
		
		return result;  
	}
}
