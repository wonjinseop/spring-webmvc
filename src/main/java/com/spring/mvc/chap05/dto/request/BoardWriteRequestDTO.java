package com.spring.mvc.chap05.dto.request;

import lombok.*;

@Setter @Getter @ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class BoardWriteRequestDTO {
    
    private String writer;
    private String title;
    private String content;
    
}
