package com.springboot.coffee;

import com.springboot.member.NotSpace;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import javax.validation.constraints.*;

@Getter
@Setter
public class CoffeePostDto {
    @NotSpace
    private String korName;
    @Pattern(regexp ="^[a-zA-Z]+(\\s[a-zA-Z]+)*$", message = "워드 사이에 공백 하나만 사용할 수 있습니다. 다시 입력해주세요.")
    private String engName;
    @Min(value = 100, message = "최소 100부터 시작입니다. 다시 입력해주세요.")
    @Max(value = 50000, message = "최대 50000까지입니다. 다시 입력해주세요.")
    private int price;
}
