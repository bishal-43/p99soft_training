package repository;

import model.Member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    private Map<Integer, Member> members = new HashMap<>();

    public void save(Member member){
        members.put(member.getId(),member);
    }

    public Member findById(int id) {

        return members.get(id);
    }
}
