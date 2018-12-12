package com.cywellsystem.cis.user.members.mapper;

import com.cywellsystem.cis.user.common.AbstractDAO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("memberMapper")
public class MemberMapper extends AbstractDAO {

    public List<Map<String,Object>> selectMemberList(Map<String,Object> searchMap) throws Exception {
        return (List<Map<String, Object>>)selectList("memberQuery.selectMemberList", searchMap);
    }
}
