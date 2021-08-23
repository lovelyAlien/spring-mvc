package spring.servlet.domain.member;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class MemberRepositoryTest {

    //싱글톤이기 때문에 new가 안된다.
    MemberRepository memberRepository=MemberRepository.getInstance();


    @AfterEach
    void afterEach(){
        memberRepository.clear();
    }

    @Test
    void save(){
        //given
        Member member= new Member("jaeseung", 29);

        //when
        Member saveMember=memberRepository.save(member);

        //then
        Member findMember= memberRepository.findById(saveMember.getId());
        assertThat(findMember).isEqualTo(saveMember);


    }


    @Test
    void findAll(){
        //given
        Member member1= new Member("member1", 29);
        Member member2= new Member("member2", 30);

        memberRepository.save(member1);
        memberRepository.save(member2);
        //when
        List<Member> result= memberRepository.findAll();

        //then

        assertThat(result).isEqualTo(2); //갯수 확인
        assertThat(result).contains(member1, member2); //멤버 확인


    }
}
