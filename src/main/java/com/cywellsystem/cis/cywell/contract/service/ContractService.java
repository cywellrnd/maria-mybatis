package com.cywellsystem.cis.cywell.contract.service;

import com.cywellsystem.cis.cywell.contract.mapper.ContractMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ContractService {
    @Autowired
    ContractMapper contractMapper;

    public Map<String, Object> selectContractList(Map<String,Object> searchMap) throws Exception {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("list", contractMapper.selectContractList(searchMap));
        map.put("cnt", contractMapper.selectContractListCnt(searchMap));
        return map;
    }

}
