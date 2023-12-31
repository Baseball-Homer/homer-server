package com.dbs.homer.repository.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    private Integer userId;

    private String password;

    private String email;

    private String ownerName;

}
