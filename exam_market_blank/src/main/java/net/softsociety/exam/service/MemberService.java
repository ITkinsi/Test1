package net.softsociety.exam.service;

import net.softsociety.exam.domain.Member;

/** 
 * ȸ������ ���� ����
 */
public interface MemberService {

	void saveMember(Member member);

	Member findMember(Member member);

}
