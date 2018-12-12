package com.cywellsystem.cis.user.members.controller;

import com.cywellsystem.cis.user.members.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class MemberController {
    @Autowired
    MemberService memberService;



    @RequestMapping(value="/memberList")
    public String selectBoardList(@RequestParam Map<String, Object> params,
                                  @RequestParam(value = "pageNo", required = false, defaultValue = "1") int pageNo,
                                  @RequestParam(value = "pageUnit", required = false, defaultValue = "15") int pageUnit, ModelMap model,
                                  HttpSession session, HttpServletRequest request) throws Exception {

        Map<String, Object> map = memberService.selectUserList(params);

        model.put("params", params);
        model.put("resultMap", map);
        if(params.get("searchNm") == null) {
            params.put("searchNm", "");
        }

        System.out.println("========  params : " + params);
        System.out.println("========  resultMap :    " + map);

        return "members/membersList";
    }
}
