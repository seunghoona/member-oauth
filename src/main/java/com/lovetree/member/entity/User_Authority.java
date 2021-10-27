package com.lovetree.member.entity;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Entity
@Table(name = "user_authority")
public class User_Authority {

    @Id
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "authority_name")
    private Authority authority;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private User user;

}
