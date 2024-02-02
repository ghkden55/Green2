package com.example.myWeb.controller;

import com.example.myWeb.dao.MemberDao;
import com.example.myWeb.dto.MemberDto;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MyController {

    // 객체를 자동으로 매핑해주는 어노테이션
    @Autowired
    MemberDao memberDao;

    @GetMapping({"/", "home"})
    public String root() {
        return "home";
    }

    @GetMapping("/idCheck")
    public @ResponseBody String idCheck(@RequestParam("id") String id) {
        System.out.println("idCheck.........." + id);
        int result = memberDao.idCheck(id);

        String idResult = "";

        if (result == 0) { // js에서 ==은 자료형 상관없이 값 자체가 같은지 체크. ===를 사용해야 자료형까지 일치 체크
            idResult = "사용 가능합니다.";
        } else {
            idResult = "이미 사용중인 아이디입니다.";
        }

        return idResult;
    }

    @GetMapping("/reg")
    public String regForm() {
        return "regForm";
    }

    @PostMapping("/reg")
    public String regMember(@RequestParam("id") String id,
                            @RequestParam("pw") String pw,
                            @RequestParam("name") String name) {
        MemberDto memberDto = new MemberDto(id, pw, name, "MEMBER");

        int result = memberDao.regist(memberDto);
        String view = "";

        if (result == 1) {
            view = "success";
        } else {
            view = "fail";
        }

        return view;
    }

    @GetMapping("/success")
    public String success() {
        return "success";
    }

    @GetMapping("/login")
    public String login() {
        return "loginForm";
    }

    @PostMapping("/loginProc")
    public String loginProc(@RequestParam String id, @RequestParam String pw, HttpSession session) {
        String view = "";
        MemberDto memberDto = new MemberDto();

        memberDto = memberDao.login(id, pw);

        if (memberDto != null) {
            session.setAttribute("id", memberDto.getId());
            session.setAttribute("name", memberDto.getName());
            session.setAttribute("role", memberDto.getRole());

            view = "loginSuccess";

        } else {
            view = "loginFail";
        }

        return view;
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {

        session.invalidate(); // 세션에 있는 모든 데이터 삭제
        // session.removeAttribute(); 세션에 있는 특정 값 제거

        // 해당 페이지를 이미 다른 컨트롤러에서 사용중일 경우, 매개변수가 있을 수도 있기 때문에 redirect 해줘서 다시 해당 컨트롤러를 호출한다.
        return "redirect:/home";
    }
}
