package com.pigeonMarket.dealInfo.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class DealInfoDao {
	
	private Properties prop = new Properties();
	
	public DealInfoDao() {
		
		String fileName = DealInfoDao.class.getResource("/sql/dealInfo/dealInfo-query.properties").getPath();
		
		try {
			prop.load(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
