package com.hmbbs.DAO;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hmbbs.VO.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
@Inject SqlSession sqlSession;
private static String mapperquery = "com.hmbbs.DAO.MemberDAO";
	@Override
	public void insertMember(MemberVO memberVO) throws Exception {
		sqlSession.insert(mapperquery+".insertmember", memberVO);
	}

}
