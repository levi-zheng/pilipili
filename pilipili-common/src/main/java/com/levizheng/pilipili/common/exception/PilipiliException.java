package com.levizheng.pilipili.common.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author levi
 * @since 2024/4/29
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PilipiliException extends RuntimeException{

    private String message;

    private Integer code;

}
