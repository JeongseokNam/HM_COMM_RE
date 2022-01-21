package com.hmbbs.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.hmbbs.DAO.MemberDAO;
import com.hmbbs.VO.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	@Inject MemberDAO memberDAO;
	@Override
	public void signUp(MemberVO memberVO) throws Exception {
		memberDAO.insertMember(memberVO);
	}

}
