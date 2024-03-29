package com.pigeonMarket.member.model.service;

import static com.pigeonMarket.common.JDBCTemplate.close;
import static com.pigeonMarket.common.JDBCTemplate.commit;
import static com.pigeonMarket.common.JDBCTemplate.getConnection;
import static com.pigeonMarket.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import com.pigeonMarket.common.model.vo.PageInfo;
import com.pigeonMarket.member.model.dao.MemberDao;
import com.pigeonMarket.member.model.vo.Member;
import com.pigeonMarket.notice.model.dao.NoticeDao;
import com.pigeonMarket.notice.model.vo.Notice;

public class MemberService {

	/**
	 * 1. 로그인용 서비스
	 * @param id
	 * @param pwd
	 * @return 로그인한 회원 객체
	 */
	public Member loginMember(String id, String pwd) {

		Connection conn = getConnection();

		Member loginUser = new MemberDao().loginMember(conn, id, pwd);

		close(conn);

		return loginUser;
	}

	/**
	 * 2. 회원가입 서비스
	 * @param mem
	 * @return
	 */
	public int insertMember(Member mem) {

		Connection conn = getConnection();

		int result = new MemberDao().insertMember(conn, mem);

		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}

		close(conn);

		return result;

	}


	public Member checkMyInfo(Member m) {

		Connection conn = getConnection();

		Member mem = new MemberDao().checkMyInfo(conn, m);

		close(conn);

		return mem;

	}


	public int updateMyInfo(Member m) {

		Connection conn = getConnection();

		int result = new MemberDao().updateMyInfo(conn, m);

		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}

		close(conn);

		return result;
	}

	public int deleteMyInfo(Member m) {

		Connection conn = getConnection();

		int result = new MemberDao().deleteMyInfo(conn, m);

		if(result > 0) {
			commit(conn);

		} else {
			rollback(conn);
		}

		close(conn);

		return result;
	}

	public Member loginUser(String userId) {
		Connection conn = getConnection();

		Member loginUser = new MemberDao().loginUser(conn, userId);

		close(conn);

		return loginUser;

	}

	public int getListCount() {
		Connection conn = getConnection();

		int listCount = new MemberDao().getListCount(conn);

		close(conn);

		return listCount;
	}

	public ArrayList<Member> selectList(PageInfo page) {
		Connection conn = getConnection();
		ArrayList<Member> list = new MemberDao().selectList(conn, page);

		close(conn);

		return list;
	}

	public Member selectMember(int memberNo) {
		Connection conn = getConnection();

		Member m = null;

			commit(conn);
			m = new MemberDao().selectMember(conn, memberNo);

		close(conn);

		return m;
	}

	public int deleteMember(String memberNo) {
		Connection conn = getConnection();

		int result = new MemberDao().deleteMember(conn, memberNo);

		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}

		close(conn);

		return result;
	}

	public int updateEamil(String email, String userId) {

		Connection conn = getConnection();

		int result = new MemberDao().updateEmail(conn, email, userId);

		if(result > 0 ) {
			commit(conn);
		} else {
			rollback(conn);
		}

		close(conn);

		return result;

	}

	public int updatePwd(Member m) {

		Connection conn = getConnection();

		int result = new MemberDao().updatePwd(conn, m);

		if(result > 0 ) {
			commit(conn);
		} else {
			rollback(conn);
		}

		close(conn);

		return result;


	}

	public int updatePhone(String phone, String userId) {

		Connection conn = getConnection();

		int result = new MemberDao().updatePhone(conn, phone, userId);

		if(result > 0 ) {
			commit(conn);
		} else {
			rollback(conn);
		}
		 close(conn);
		 return result;
	}
	
	public int updateAddr(String addr, String userId) {

		Connection conn = getConnection();

		int result = new MemberDao().updateAddr(conn, addr, userId);

		if(result > 0 ) {
			commit(conn);
		} else {
			rollback(conn);
		}
		 close(conn);
		 return result;
	}
	

		public int idCheck(String userId) {
			Connection conn = getConnection();

			int result = new MemberDao().idCheck(conn, userId);
		close(conn);

		return result;

	}
}
