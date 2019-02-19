package com.cywellsystem.cis.cywell.contract.mapper;

import com.cywellsystem.cis.common.AbstractDAO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

//@Repository("memberMapper")
@Component
public class ContractMapper extends AbstractDAO {

    public List<Map<String,Object>> selectContractList(Map<String,Object> searchMap) throws Exception {
        return selectList("contractQuery.selectContractList", searchMap);
    }

    public Object selectContractListCnt(Map<String, Object> searchMap) {
        return selectOne("contractQuery.selectContractListCnt", searchMap);
    }
}
