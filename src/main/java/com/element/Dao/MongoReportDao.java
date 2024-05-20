package com.element.Dao;

import org.springframework.stereotype.Repository;

@Repository("mongo")
public class MongoReportDao implements ReportDao{

	@Override
	public String getReprtData() {
		String msg= "reprt from mongodao";
		return msg;
	}

}
