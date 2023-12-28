package com.salesforce;

import java.util.ArrayList;
import java.util.List;

public class AuthorApp {

	public static void main(String[] args) {
		int count = 0;
		AuthorDao dao = new AuthorDaoImpl();
		
//		//insert
//		AuthorVO vo = new AuthorVO(null ,"홍길동", "홍길동");
//		count = dao.insert(vo);
//		System.out.println("AuthorApp.dao.insert(vo) 결과--> " + count);
		
		//getList
		List<AuthorVO> list = new ArrayList<AuthorVO>();
		list = dao.getList();
		for(AuthorVO vo : list) {
			System.out.println(vo);
		}
		System.out.println("AuthorApp.dao.getList(vo) 결과--> 전체 " + list.size() + "건");
		
//		//Delete
//		int id = 8;
//		count = dao.delete(id);
//		System.out.println("AuthorApp.dao.delete(vo) 결과--> " + count);
		
		//update
//		AuthorVO vo = new AuthorVO(9,"홍길동", "우헤헤");
//		count = dao.update(vo);
//		System.out.println("AuthorApp.dao.update(vo) 결과--> " + count);
		
	}

}
