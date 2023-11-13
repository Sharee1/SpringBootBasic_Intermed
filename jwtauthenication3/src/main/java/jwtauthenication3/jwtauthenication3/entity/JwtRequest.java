package jwtauthenication3.jwtauthenication3.entity;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class JwtRequest {

    private String email;
    private String password;
}
