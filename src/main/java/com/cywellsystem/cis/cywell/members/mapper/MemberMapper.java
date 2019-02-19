package com.cywellsystem.cis.cywell.members.mapper;

import com.cywellsystem.cis.common.AbstractDAO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

//@Repository("memberMapper")
@Component
public class MemberMapper extends AbstractDAO {

    public List<Map<String,Object>> selectMemberList(Map<String,Object> searchMap) throws Exception {
        return selectList("memberQuery.selectMemberList", searchMap);
    }

    public Object selectMemberListCnt(Map<String, Object> searchMap) {
        return selectOne("memberQuery.selectMemberListCnt", searchMap);
    }
}
