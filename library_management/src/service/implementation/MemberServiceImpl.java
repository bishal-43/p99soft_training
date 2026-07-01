package service.implementation;

import model.Member;
import repository.MemberRepository;
import service.MemberService;

public class MemberServiceImpl implements MemberService {

    private MemberRepository memberRepository; // this is Dependency inversion principle depends on interface

    public MemberServiceImpl(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    @Override
    public void addMember(Member member){
        memberRepository.save(member);
    }

    @Override
    public Member getMember(int id){
        return memberRepository.findById(id);
    }
}
