package com.element.Dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysql")

public class MysqlReportDao implements ReportDao {

	@Override
	public String getReprtData() {
		
		String msg= "report from mysqldao";
		return msg;
	}

}
