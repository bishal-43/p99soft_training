package service;

import model.Member;

// interface seggregation: only handle what is need or use
public interface MemberService {
    void addMember(Member member);

    Member getMember(int id);
}
