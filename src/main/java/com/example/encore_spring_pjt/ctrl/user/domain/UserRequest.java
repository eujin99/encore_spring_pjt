package com.example.encore_spring_pjt.ctrl.user.domain;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class UserRequest {
    @NotBlank(message = "아이디는 필수입력사항입니다.")
    private String id  ;
    @NotBlank(message = "비밀번호는 필수입력사항입니다.")
    private String pwd ; 
    @NotBlank(message = "이름은 필수입력사항입니다.")
    private String name ; 
}




