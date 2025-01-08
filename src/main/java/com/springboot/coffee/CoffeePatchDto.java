package com.springboot.coffee;

import com.springboot.member.NotSpace;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class CoffeePatchDto {

    private long coffeeId;

    @NotSpace
    @Pattern(regexp = "^([가-힣])+$", message = "한글만 입력할 수 있습니다. 다시 입력해주세요.")
    private String korName;

    @Pattern(regexp ="^[a-zA-Z]+(\\s[a-zA-Z]+)*$", message = "워드 사이에 공백 하나만 사용할 수 있습니다. 다시 입력해주세요.")
    private String engName;
    @Min(value = 100, message = "최소 100부터 시작입니다. 다시 입력해주세요.")
    @Max(value = 50000, message = "최대 50000까지입니다. 다시 입력해주세요.")
    private int price;
}
