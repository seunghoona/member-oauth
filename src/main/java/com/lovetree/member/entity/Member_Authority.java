package com.lovetree.member.entity;

import javax.persistence.*;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.*;

@Entity
@Table(name = "member_authority")
public class Member_Authority {

    @Id
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "authority_name")
    private Authority authority;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
}
