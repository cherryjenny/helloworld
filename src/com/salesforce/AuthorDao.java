package com.salesforce;

import java.util.List;

public interface AuthorDao {
	public int insert(AuthorVO vo);
	public List<AuthorVO> getList();
	public int delete(int authorId);
	public int update(AuthorVO vo);
	
	
}
