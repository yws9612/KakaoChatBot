package com.example.KakaoChatBot.kakaoConfig;

import com.example.KakaoChatBot.model.KakaoApiModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
@RequestMapping("/api/kakao/*")
public class KakaoApiSet {

    @RequestMapping("/callApi")
    public String callApi(@RequestBody
                             KakaoApiModel kakaoApiModel){
        try{
            ObjectMapper mapper = new ObjectMapper();
            String jsonInString = mapper.writeValueAsString(kakaoApiModel);
            int x = 0;
            System.out.println(jsonInString);

            return "정상적으로 작동되었습니다";
        } catch (Exception e) {
            System.out.println("에러 발생 " + e);

            return "에러발생";
        }
    }
}
