package com.cywellsystem.cis.user.members.service;

import com.cywellsystem.cis.user.members.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MemberService {
    @Autowired
    MemberMapper memberMapper;

    public Map<String, Object> selectUserList(Map<String,Object> searchMap) throws Exception {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("list", memberMapper.selectMemberList(searchMap));
        return map;
    }

}
