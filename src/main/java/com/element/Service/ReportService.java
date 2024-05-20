package com.element.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.element.Dao.ReportDao;

@Service
public class ReportService {
	@Autowired
	@Qualifier("mysql")
	private ReportDao dao;

	public void generateReport() {
		String data = dao.getReprtData();
		System.out.println(data);
	}
}
