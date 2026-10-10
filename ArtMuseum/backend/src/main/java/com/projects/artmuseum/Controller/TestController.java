package com.projects.artmuseum.Controller;

import com.projects.artmuseum.Service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor // Lombokを使ってコンストラクタ注入を自動化
public class TestController {

    // インターフェース型で定義（Springが@ServiceがついたImplを自動注入してくれます）
    private final TestService testService;

    @GetMapping("/hello")
    public String hello(Model model) {
        // Serviceのメソッドを呼び出す
        String message = testService.getMessage();
        
        // 画面（Thymeleaf）に渡すデータをセット
        model.addAttribute("message", message);
        
        // templates/hello.html をレンダリングして返す
        return "hello";
    }
}