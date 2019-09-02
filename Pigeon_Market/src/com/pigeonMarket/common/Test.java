package com.pigeonMarket.common;

import java.util.ArrayList;

import com.pigeonMarket.member.model.dao.MemberDao;
import com.pigeonMarket.member.model.service.MemberService;
import com.pigeonMarket.member.model.vo.Activity;
import com.pigeonMarket.member.model.vo.Member;

public class Test {
	
	public static void main(String[] args) {

		
		int limitCount = 30;
		
		int perious = 90;
		
		Activity a = new Activity("user10", perious, limitCount);
		
		ArrayList<Activity> aList = new MemberService().activityList(a);
		
		ArrayList<String> range = new MemberDao().rangeList(aList);

		
	}

}
