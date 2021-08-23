package spring.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {

    private static Map<Long, Member> store=  new HashMap<>();
    private static long sequence =0L;

    private static final MemberRepository instance=new MemberRepository();


    //싱글톤
    public static MemberRepository getInstance(){
        return instance;

    }

    //싱글톤 이용 시, 아무나 생성 못하게 private으로 막는다.
    private MemberRepository(){

    }


    public Member save(Member member){
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;

    }

    public Member findById(Long id){
        return store.get(id);

    }

    public List<Member > findAll(){
        //store을 보호하기 위해 새 리스트를 반환한다.
        return new ArrayList<>(store.values());
    }

    public void clear(){
        store.clear();
    }



}
